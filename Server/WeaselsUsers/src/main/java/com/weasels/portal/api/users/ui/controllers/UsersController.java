package com.weasels.portal.api.users.ui.controllers;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weasels.portal.api.users.service.UsersService;
import com.weasels.portal.api.users.shared.UserDto;
import com.weasels.portal.api.users.ui.model.CreateUserRequestModel;
import com.weasels.portal.api.users.ui.model.CreateUserResponseModel;
import com.weasels.portal.api.users.ui.model.UpdateUserRequestModel;
import com.weasels.portal.api.users.ui.model.UserResponseModel;

@RestController
@RequestMapping("/users")
public class UsersController {
	
	@Autowired
	private UsersService usersService;
	
	@Autowired
	private static Logger logger = LoggerFactory.getLogger(UsersController.class);
	
	
	
	// POST - createUser - /new
	@PostMapping(
			value="/new",
			consumes= {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE},
			produces= {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE}
		)
	public ResponseEntity<CreateUserResponseModel> createUser(@Valid @RequestBody CreateUserRequestModel requestModel) {
		
		logger.info("POST request was handled by creeateuser(@Valid @RequestBody CreateuserReqeustModel) route handler method.");
		
		ModelMapper modelMapper = new ModelMapper();
		UserDto userDto = modelMapper.map(requestModel, UserDto.class);
		
		UserDto createUser = usersService.createUser(userDto);
		
		CreateUserResponseModel returnUser = modelMapper.map(createUser, CreateUserResponseModel.class);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(returnUser);
	}
	
	// GET - getUsers
	// CHANGE- Add Pagination and Limit for each request
	@GetMapping("/")
	public ResponseEntity<List<UserResponseModel>> getUsers() {
		
		ModelMapper modelMapper = new ModelMapper();
		
		List<UserDto> userList = usersService.findUsers();
		
		List<UserResponseModel> returnUsers = userList
												.stream()
												.map(user -> modelMapper.map(user, UserResponseModel.class))
												.collect(Collectors.toList());
	
		return ResponseEntity.status(HttpStatus.OK).body(returnUsers);
	}
	
	// GET - getUser - /{user_id}
	@GetMapping("/{user_id}")
	//TODO: Change the return type of the method.
	public UserDto getUser(@PathVariable String user_id) {
		
//		ModelMapper modelMapper = new ModelMapper();
		UserDto user = usersService.findUser(user_id);
		
		return user;
		
	}
	
	@PutMapping("/{user_id}")
	public UserDto updateUser(@PathVariable String user_id, @RequestBody UpdateUserRequestModel user) {	
		return usersService.updateUser(user_id, user);
	}
	
	
	
}
