package com.coffee.house.admin.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.LogoutHandler;
import org.springframework.stereotype.Service;

import com.coffee.house.admin.user.UserTokenRepository;
import com.coffee.house.models.entity.UserToken;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LogoutService implements LogoutHandler {
	
	private final UserTokenRepository tokenRepository;

	@Override
	public void logout(HttpServletRequest request, HttpServletResponse response, Authentication authentication) {

		final String authHeader = request.getHeader("Authorization");
		final String jwt;

		if (authHeader == null || !authHeader.startsWith("Bearer ")) {
			return;
		}
		
		jwt = authHeader.substring(7);

		UserToken token = tokenRepository.findByToken(jwt).orElse(null);
		if (token != null) {
			tokenRepository.delete(token);
			SecurityContextHolder.clearContext();
		}
	}

}
