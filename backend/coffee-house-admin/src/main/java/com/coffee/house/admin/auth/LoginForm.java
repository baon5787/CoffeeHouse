package com.coffee.house.admin.auth;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LoginForm {
	
	@NotEmpty(message = "Email bị rỗng")
	@Email(message = "Vui lòng nhập lại email cho đúng định dạng")
	@Pattern(regexp = "^[\\w\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", 
		message = "Vui lòng nhập lại vì sai email theo yêu cầu (vd: bao@gmail.com")
	private String email;
	
	private String password;
}
