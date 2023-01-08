package com.bus.confic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bus.registration.dto.UserRegistrationDTO;

@Controller
public class RegistrationController {
	@RequestMapping("/register")
	public String showRegistrationPage(@ModelAttribute("userdto") UserRegistrationDTO userDTO) {
		
		return "registration-page";
	}

}
