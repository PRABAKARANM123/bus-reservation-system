package com.bus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bus.userDTO.UserDTO;

@Controller
public class TestController {
	
	@RequestMapping("/")
	public String showHomePage() {
		return "home-page";
	}
	@RequestMapping("/result-page")
	public String showResultPage(UserDTO userDTO, Model model) {
		
		System.out.println(userDTO.getFirstName());
		System.out.println(userDTO.getLastName());
		
		model.addAttribute("userdto", userDTO);
			
		return "result-page";
	}

}
