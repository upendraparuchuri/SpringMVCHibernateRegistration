package com.springmvc.registration.dao;

import java.util.List;

import com.springmvc.registration.model.UserProfile;


public interface UserProfileDao {

	List<UserProfile> findAll();
	
	UserProfile findByType(String type);
	
	UserProfile findById(int id);
}
