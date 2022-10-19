package com.cs.ebm.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NavigationController {

	private static final Logger logger = LogManager.getLogger(NavigationController.class);

	@RequestMapping(value = "/register")
	public String navToRegisterPage() {
		return "register";
	}
	
	
	@RequestMapping(value = "/admOprUser")
	public String navToAdmOprUserPage() {
		return "admOprUser";
	}
	
	@RequestMapping(value = "/admEndUser")
	public String navToAdmEndUser() {
		return "admEndUser";
	}
	
	@RequestMapping(value = "/admVndUser")
	public String navToVdmVndUser() {
		return "admVndUser";
	}
}
