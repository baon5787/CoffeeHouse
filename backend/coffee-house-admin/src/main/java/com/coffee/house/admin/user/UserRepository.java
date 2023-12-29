package com.coffee.house.admin.user;

import java.util.Optional;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.coffee.house.models.entity.User;

public interface UserRepository extends PagingAndSortingRepository<User, Integer> {
	
	Optional<User> findByEmail(String email);
}
