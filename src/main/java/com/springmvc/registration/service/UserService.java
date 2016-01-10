package com.springmvc.registration.service;

import java.util.List;

import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;

import com.springmvc.registration.model.User;


public interface UserService {
	
	User findById(int id);
	
	
	User findBySSO(String sso);
	
	void saveUser(User user);
	
	
	void updateUser(User user);
	
	 @PreAuthorize("hasRole('DBA')")
	void deleteUserBySSO(String sso);

	List<User> findAllUsers(); 
	
	boolean isUserSSOUnique(Integer id, String sso);

}