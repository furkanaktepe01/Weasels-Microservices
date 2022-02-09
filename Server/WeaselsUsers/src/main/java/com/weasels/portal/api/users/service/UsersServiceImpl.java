package com.weasels.portal.api.users.service;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weasels.portal.api.users.data.User;
import com.weasels.portal.api.users.data.UsersRepository;
import com.weasels.portal.api.users.shared.UserDto;


@Service
public class UsersServiceImpl implements UsersService {

	private UsersRepository usersRepository;
	
	private static Logger logger = LoggerFactory.getLogger(UsersServiceImpl.class);
	
	@Autowired
	public UsersServiceImpl(UsersRepository usersRepository) {
		this.usersRepository = usersRepository;
	}
	
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public UserDto createUser(UserDto userDto) {
		
		logger.info("UsersServiceImpl creatUser(UserDto) before db insertion operation.");
		
		userDto.setUserId(UUID.randomUUID().toString());
		// Later change this to actual date as opposed to String (varchar)
		userDto.setEntranceDate(LocalDate.now().toString());
		
		String firstName = userDto.getFirstName();
		String lastName = userDto.getLastName();
		String fullName = firstName + " " + lastName;
		userDto.setFullName(fullName);
		
		userDto.setPassword(userDto.getUserId().substring(0, 8));
		
		// safa@gmail.com -> safa@weasels.io
		String email = userDto.getEmail().substring(
											0, userDto.getEmail().indexOf("@")) + "@weasels.io";
		
		userDto.setEmail(email);
		
		byte permissionDays = 40;
		userDto.setRemainingPermissionDays(permissionDays);
		
		ModelMapper modelMapper = new ModelMapper();
		User user = modelMapper.map(userDto, User.class);
		
		usersRepository.save(user);
		
		logger.info("UsersServiceImpl creatUser(UserDto) after db insertion operation.");
		
		UserDto returnUser = modelMapper.map(user, UserDto.class);
		
		return returnUser;
	}

//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		
//		logger.debug("Loading User via JPA");
//		UserEntity user = usersRepository.findByEmail(username).orElseThrow(() -> {
//			return new UsernameNotFoundException("Username: " + username + " not found!");
//		});
//				
//		return new org.springframework.security.core.userdetails.User(
//				user.getEmail(), user.getPassword(), new ArrayList<>()
//				);
//
//		
//	}

	@Override
	public List<UserDto> findUsers() {
		
		List<User> users = (List<User>) usersRepository.findAll();
		
		ModelMapper modelMapper = new ModelMapper();
		return users.stream()
				  .map(user -> modelMapper.map(user, UserDto.class))
				  .collect(Collectors.toList());
		
	}

	@Override
	public UserDto findUser(String id) {
		
		User user = usersRepository.findByUserId(id);
		
		logger.info("USER EMAIL -:> " + user.getEmail());
		
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(user, UserDto.class);
		
	}

}
