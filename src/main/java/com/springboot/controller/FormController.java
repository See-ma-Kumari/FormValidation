package com.springboot.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.model.User;
import com.springboot.service.UserService;

@Controller
public class FormController {
	@Autowired
	UserService userService;
	
	@GetMapping("/")
	public String formHandler(Model m) {
		User user=new User();
		m.addAttribute("user", user);
		return "form";
	}

	@PostMapping("/handle")
	public String processHandler(@Valid @ModelAttribute("user") User user, BindingResult result, Model m) {
		if (result.hasErrors()) {
			return "form";
		}
		userService.saveUser(user);
		return "success";
	}
}
