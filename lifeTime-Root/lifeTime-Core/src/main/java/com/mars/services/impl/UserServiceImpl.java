package com.mars.services.impl;

import org.springframework.stereotype.Service;

import com.mars.services.UserSeviceI;

@Service("userService")
public class UserServiceImpl implements UserSeviceI {

	public String getUserName() {
		return "user name test";
	}
}
