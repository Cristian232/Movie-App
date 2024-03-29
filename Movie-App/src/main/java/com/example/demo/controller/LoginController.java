package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.service.LoginService;


@Controller
public class LoginController {
	@Autowired
	private LoginService service;
	
	
	@RequestMapping(value = "/login" , method = RequestMethod.GET  ) 
	public String loginMessage(ModelMap model) {
		
		//model.put("name", name);
		
		return "login" ;
	}
	
	@RequestMapping(value = "/login" , method = RequestMethod.POST  ) 
	public String welcomeMessage(ModelMap model , @RequestParam String name ,@RequestParam String password ) {
		if (service.isValid(name ,password)) {
					model.put("name", name);
					model.put("password" ,password);
				
					return "welcome";
			}
		
		
		return "login" ;
	}
}
