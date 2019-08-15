package com.example.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.demo.service.Reqbuilder;
import com.example.demo.service.Search;


@Controller
public class IndexController {
	
	
	 @RequestMapping(value = "/", method = RequestMethod.GET)
	 public String index() {
	        return "index";
	    }            
	
	
	
	 @RequestMapping(value = "/", method = RequestMethod.POST)
	    public String index(@RequestParam("searchText") String schtxt ,@RequestParam("category") String cat ) throws IOException {
		 	
		 	Search srch = new Search(schtxt, cat);
		 	Reqbuilder reqbuilder = new Reqbuilder(srch);
		 	
			URL url = new URL(reqbuilder.getStr());
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			
			int status = con.getResponseCode();
			
			
			for (int i = 0; i < con.getHeaderFields().size(); i++) {
				System.out.println(con.getHeaderField(i) + " = " + i);
			}
		 	
	        return "result";
	    }
	
}
