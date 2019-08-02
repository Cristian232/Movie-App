package com.example.demo;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class resultcontroller {
	
	@RequestMapping(value = "/api" , method = RequestMethod.GET  ) 
	public String resultcontrollermes(ModelMap model) {
		
		
		
		return "result" ;
	}
	

}
