package com.rishi.electrohub.services;

import java.io.IOException;

import com.rishi.electrohub.dtos.UserCreationUpdationDto;
import com.rishi.electrohub.dtos.UserDto;
import com.rishi.electrohub.utilities.PageableResponse;

public interface UserService {

	// create user
	UserDto createUser(UserCreationUpdationDto userCreationUpdationDto);
	
	// delete user
	void deleteUser(String id) throws IOException;
	
	// update user
	UserDto updateUser(UserCreationUpdationDto userCreationUpdationDto, String id);
	
	UserDto assignRoleAdmin(String userId);
	// get all users
	PageableResponse<UserDto> getAllUsers(int pageNumber, int pageSize, String sortBy, String sortDir);
	
	// get user by id
	UserDto getUserById(String id);
	
	// get user by email
	UserDto getUserByEmail(String email);
	
	// search user by name
	PageableResponse<UserDto> searchByName(String keyword, int pageNumber, int pageSize, String sortBy, String sortDir);

}

