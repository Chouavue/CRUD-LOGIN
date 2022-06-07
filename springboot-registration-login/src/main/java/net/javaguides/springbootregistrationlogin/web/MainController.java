package net.javaguides.springbootregistrationlogin.web;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.stereotype.Controller;


@Controller
public class MainController {
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
}