package br.com.aslima.spring.authentication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@GetMapping
	@RequestMapping("/")
	public String defaultPath() {
		return "redirect:home";
	}
	
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	
}
