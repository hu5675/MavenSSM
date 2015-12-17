package com.mars.controller;

import java.util.UUID;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mars.models.CityModel;
import com.mars.models.UserModel;
import com.mars.services.CityServiceI;
import com.mars.services.UserSeviceI;

@Controller
@RequestMapping("demo")
public class DemoController {

	Logger logger = LogManager.getLogger(DemoController.class);

	private UserSeviceI userService;

	@Autowired
	public void setUserService(UserSeviceI userService) {
		this.userService = userService;
	}
	
	private CityServiceI cityService;

	@Autowired
	public void setCityService(CityServiceI cityService) {
		this.cityService = cityService;
	}
	
	@RequestMapping("/random")
	@ResponseBody
	public UserModel random() {
		String random = UUID.randomUUID().toString();
		logger.info("general " + random);
		String userName = this.userService.getUserName();
		logger.info("user name " + userName);
		UserModel userModel = new UserModel();
		userModel.setUserName(userName);
		return userModel;
	}
	
	@RequestMapping("/city")
	@ResponseBody
	public CityModel city() {
		System.out.println("city city");
		return this.cityService.getCity();
	}
}
