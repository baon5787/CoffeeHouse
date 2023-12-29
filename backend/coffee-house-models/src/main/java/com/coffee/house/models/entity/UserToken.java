package com.coffee.house.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.coffee.house.models.enums.TokenType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name ="user_tokens")
public class UserToken {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_token_id")
	public Integer id;

	@Column(name = "user_token",unique = true)
	public String token;

	@Enumerated(EnumType.STRING)
	@Column(name = "token_type")
	public TokenType tokenType;
	
	@Column(name = "refersh_user_token",unique = true)
	public String refershToken;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	public User user;
}
