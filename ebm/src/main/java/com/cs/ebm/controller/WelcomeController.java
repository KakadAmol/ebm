package com.cs.ebm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class WelcomeController {

	@RequestMapping("/landingPage")
	public String landingPage() {
		System.out.println("Welcome to LoginPage : Called");
		return "login";
	}

}
