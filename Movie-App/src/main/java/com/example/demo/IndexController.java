package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
public class IndexController {
	
	 @RequestMapping("/")
	    public String index() {
	        return "index";
	    }
	
}
