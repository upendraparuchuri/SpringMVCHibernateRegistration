package com.springmvc.registration.service;

import java.util.List;

import com.springmvc.registration.model.UserProfile;


public interface UserProfileService {

	UserProfile findById(int id);

	UserProfile findByType(String type);
	
	List<UserProfile> findAll();
	
}
