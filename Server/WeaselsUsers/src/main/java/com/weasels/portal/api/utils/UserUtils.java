package com.weasels.portal.api.utils;

import com.weasels.portal.api.users.shared.UserDto;

public class UserUtils {

	public static String makeFullName(UserDto user) {
		return user.getFirstName().toUpperCase() + " " + user.getLastName().toUpperCase();
	}
	
}
