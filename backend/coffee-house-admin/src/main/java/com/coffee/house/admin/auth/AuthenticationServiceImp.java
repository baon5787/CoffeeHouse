package com.coffee.house.admin.auth;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.coffee.house.admin.jwt.JwtService;
import com.coffee.house.admin.user.UserRepository;
import com.coffee.house.admin.user.UserTokenRepository;
import com.coffee.house.models.entity.User;
import com.coffee.house.models.entity.UserToken;
import com.coffee.house.models.enums.TokenType;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceImp implements AuthenticationService{
	
	private final UserTokenRepository tokenRepository;
	
	private final UserRepository userRepository;

	private final JwtService jwtService;
	
	private final AuthenticationManager authenticationManager;
	
	@Override
	public String authenticate(LoginForm loginForm, HttpServletResponse response) {
		Authentication authentication = authenticationManager
				.authenticate(new UsernamePasswordAuthenticationToken(loginForm.getEmail(), loginForm.getPassword()));
		SecurityContextHolder.getContext().setAuthentication(authentication);

		User user = userRepository.findByEmail(loginForm.getEmail()).orElseThrow();

		String jwtToken = jwtService.generateToken(user);
		String refershToken = jwtService.refershToken(user);

		saveUserToken(user, jwtToken, refershToken);

		Cookie cookie = new Cookie("refersh_token", refershToken);
		cookie.setSecure(true);
		cookie.setHttpOnly(true);
		cookie.setPath("/api/admin/auth/refresh");

		response.addCookie(cookie);

		return jwtToken;
	}
	
	private void saveUserToken(User user, String jwtToken, String refershToken) {
		UserToken token = UserToken.builder()
				.user(user)
				.token(jwtToken)
				.refershToken(refershToken)
				.tokenType(TokenType.BEARER)
				.build();
		tokenRepository.save(token);
	}
}
