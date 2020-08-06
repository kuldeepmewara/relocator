package com.kuldeep.Relocator;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends JpaRepository<User,Long> {
	public User findByEmail(String email);
	
	

}
