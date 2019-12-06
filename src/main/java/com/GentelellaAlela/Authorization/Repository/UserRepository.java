package com.GentelellaAlela.Authorization.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.GentelellaAlela.Authorization.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	public User findByEmail(String email);
}
