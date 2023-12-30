package com.coffee.house.admin.user;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coffee.house.models.entity.User;

public interface UserResponsitory extends JpaRepository<User, Integer> {

}
