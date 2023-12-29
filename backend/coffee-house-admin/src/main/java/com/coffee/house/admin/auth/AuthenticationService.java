package com.coffee.house.admin.auth;

import javax.servlet.http.HttpServletResponse;

public interface AuthenticationService {

	String authenticate(LoginForm loginForm, HttpServletResponse response);

}
