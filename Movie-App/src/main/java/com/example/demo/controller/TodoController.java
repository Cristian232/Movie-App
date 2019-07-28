package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.example.demo.service.TodoService;


@Controller
public class TodoController {
	@Autowired
	private TodoService service;
	
	
	@RequestMapping(value = "/list-todos" , method = RequestMethod.GET  ) 
	public String loginMessage(ModelMap model) {
		
		model.put("todos",service.retrieveTodos("mytodos"));
		
		return "list-todos" ;
	}
	
	
}
