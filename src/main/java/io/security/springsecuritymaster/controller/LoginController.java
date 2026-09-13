package io.security.springsecuritymaster.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	@GetMapping("/")
	public String index(String customParam) {
		if (customParam != null) {
			return "customParam";
		} else {
			return "index";
		}
	}

	@GetMapping("/login")
	public String login() {
		return "content/login/login";
	}

	@ResponseBody
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	
	// 직접 처리할경우
	@PostMapping("/login")
	public String loginPost() {
		System.out.println("Login Post");
		return "index";
	}
}