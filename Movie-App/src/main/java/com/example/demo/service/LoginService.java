package com.example.demo.service;

import org.springframework.stereotype.Component;

@Component
public class LoginService {
	
	public boolean isValid(String name , String password) {
		return name.equalsIgnoreCase("Cristi") && password.equalsIgnoreCase("pas");
			
		
	}

}
