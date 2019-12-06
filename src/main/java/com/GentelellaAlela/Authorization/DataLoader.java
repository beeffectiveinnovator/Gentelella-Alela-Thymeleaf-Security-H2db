package com.GentelellaAlela.Authorization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.GentelellaAlela.Authorization.Entity.Role;
import com.GentelellaAlela.Authorization.Repository.RoleRepository;

@Component
public class DataLoader implements CommandLineRunner{

	@Autowired
	RoleRepository roleRepository;
	
	@Override
	public void run(String... args) throws Exception {

		this.roleRepository.save(new Role( 1, "ADMIN"));
		this.roleRepository.save(new Role( 2, "USER"));

	}
}
