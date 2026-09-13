package io.security.springsecuritymaster.controller;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.CurrentSecurityContext;
import org.springframework.security.core.context.SecurityContext;
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

	@GetMapping("/anonymouse")
	public String anonymouse() { return "anonymouse"; }

	@GetMapping("/authenticatoin")
	public String authenticatoin(Authentication authentication) {
		if (authentication instanceof AnonymousAuthenticationToken) {
			return "anonymouse";
		} else {
			return "null";
		}
	}

	@GetMapping("/anonymouseContext")
	public String anonymouseContext(@CurrentSecurityContext SecurityContext context) {
		return context.getAuthentication().getName();
	}
}