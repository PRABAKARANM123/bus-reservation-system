package com.bus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {
	
	@RequestMapping("/")
	public String showHomePage() {
		return "home-page";
	}
	@RequestMapping("/proces-homepage")
	public String showSucesspage(@RequestParam("firstName") String firstName1, 
			@RequestParam("lastName") String lastName1, Model model) {
		
		model.addAttribute("fName", firstName1);
		model.addAttribute("lName", lastName1);
			
		return "proces-homepage";
	}

}
