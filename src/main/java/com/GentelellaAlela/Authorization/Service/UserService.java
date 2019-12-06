package com.GentelellaAlela.Authorization.Service;

import com.GentelellaAlela.Authorization.Entity.User;

public interface UserService {

	public User findUserByEmail(String email) ;
	public User saveUser(User user);
}
