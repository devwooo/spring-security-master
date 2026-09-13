package io.security.springsecuritymaster.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/login")
	public String login() {
		return "content/login/login";
	}
	
	// 직접 처리할경우
	@PostMapping("/login")
	public String loginPost() {
		System.out.println("Login Post");
		return "index";
	}

	@GetMapping("/logoutSuccess")
	public String logoutSuccess() {
		return "logoutSuccess";
	}
}