package com.coffee.house.admin.user;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.coffee.house.models.entity.UserToken;

public interface UserTokenRepository extends JpaRepository<UserToken, Integer> {
	
	@Query(value = "SELECT t FROM UserToken t INNER JOIN User u  ON t.user.id = u.id WHERE u.id = ?1")
	List<UserToken> findAllValidTokenByUser(Integer id);

	Optional<UserToken> findByToken(String token);
	
	@Query("SELECT t FROM UserToken t WHERE t.refershToken = ?1")
	Optional<UserToken> findByRefershToken(String refershToken);
}
