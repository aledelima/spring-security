package br.com.aslima.spring.authentication.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@GetMapping
	@RequestMapping("/login")
	public String login(@RequestParam(required = false, value="error") String error, Model model) {
		model.addAttribute("error", error!=null);
		return "login";
	}
	
}
