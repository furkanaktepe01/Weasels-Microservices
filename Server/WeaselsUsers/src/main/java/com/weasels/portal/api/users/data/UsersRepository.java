package com.weasels.portal.api.users.data;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<User, Long> {
	
	@Query("SELECT u FROM User u WHERE u.userId = ?1")
	User findByUserId(String userId);

}
