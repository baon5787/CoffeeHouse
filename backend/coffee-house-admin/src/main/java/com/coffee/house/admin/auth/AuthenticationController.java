package com.coffee.house.admin.auth;

import com.coffee.house.admin.helper.AppConstant;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(AppConstant.URL_API_ADMIN_AUTH)
@RequiredArgsConstructor
@Validated
public class AuthenticationController {
	
	private final AuthenticationService authenticationService;
	
	@PostMapping(AppConstant.URL_LOGIN)
	public ResponseEntity<String> authenticate(HttpServletResponse response,
			@Valid @RequestBody LoginForm loginForm) {
		String authenticationResponse = authenticationService.authenticate(
				loginForm, response);
		return new ResponseEntity<String>(authenticationResponse, HttpStatus.OK);
	}

}
