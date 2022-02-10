package com.weasels.portal.api.users.service;

import java.util.List;
import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.weasels.portal.api.users.shared.UserDto;
import com.weasels.portal.api.users.ui.model.UpdateUserRequestModel;

public interface UsersService {

	UserDto createUser(UserDto userDto);

	List<UserDto> findUsers();
	
	UserDto findUser(String id);
	
	UserDto updateUser(String id, UpdateUserRequestModel user);

	
}
