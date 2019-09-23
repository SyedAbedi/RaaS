package com.example.dev.demo.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping("/")
	public String getIndex(Model model, Principal principal){
		
		String username = principal.getName();
		model.addAttribute("username",username);
		return "index";
	}
	
	@RequestMapping("/login")
	public String loginUser(Model model, Principal principal){
		
		String username = principal.getName();
		System.out.println("In side Login controller");
		model.addAttribute("username","from login");
		return "index";
	}
}
