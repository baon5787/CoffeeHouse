package com.coffee.house.admin.jwt;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.coffee.house.admin.user.UserTokenRepository;
import com.coffee.house.models.entity.UserToken;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class JwtAuthenticationFilter extends OncePerRequestFilter{
	
	private final JwtService jwtService;
	
	private final UserTokenRepository tokenRepository;
	
	private final UserDetailsService userDetailsService;

	@Override
	protected void doFilterInternal(
			@NonNull
			HttpServletRequest request, 
			@NonNull
			HttpServletResponse response, 
			@NonNull
			FilterChain filterChain)
			throws ServletException, IOException {
		final String authHeader = request.getHeader("Authorization");
		final String jwt;
		final String userEmail;

		if (request.getServletPath().equals("/api/admin/auth/login")
				|| request.getServletPath().equals("/api/admin/auth/refresh")) {
			filterChain.doFilter(request, response);
			return;
		} else {
			if (authHeader != null && authHeader.startsWith("Bearer ")) {
				jwt = authHeader.substring(7);
				userEmail = jwtService.extractUsername(jwt);
				if (userEmail != null && SecurityContextHolder.getContext().getAuthentication() == null) {
					UserDetails userDetails = this.userDetailsService.loadUserByUsername(userEmail);
					UserToken token = tokenRepository.findByToken(jwt).orElse(null);
					if (jwtService.isTokenValid(jwt, userDetails) && token != null) {
						UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(
								userDetails, null,
								userDetails.getAuthorities());
						authToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
						SecurityContextHolder.getContext().setAuthentication(authToken);
					}
				}
			}
			filterChain.doFilter(request, response);
		}
	}

}
