package com.cs.ebm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class WelcomeController {
	
	public void HomeControlller() {
		
		System.out.println("HomeController Constructor Called:");
	}
	
	@RequestMapping("/landingPage")
	public String landingPage() {
		
		System.out.println("Welcome to LoginPage : Called");
		
		return "login";
	}

}
