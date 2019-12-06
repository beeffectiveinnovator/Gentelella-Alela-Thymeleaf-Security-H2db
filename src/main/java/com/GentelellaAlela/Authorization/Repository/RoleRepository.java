package com.GentelellaAlela.Authorization.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.GentelellaAlela.Authorization.Entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{

	public Role findByRole(String role);
}
