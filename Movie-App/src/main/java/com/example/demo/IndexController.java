package com.example.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.boot.jackson.JsonObjectSerializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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
			
			BufferedReader bufferedReader;
			StringBuffer responseContent = new StringBuffer();
			String line;
			
			bufferedReader = new BufferedReader(new InputStreamReader(con.getInputStream()));
			while ((line = bufferedReader.readLine()) != null) {
				responseContent.append(line);
			}
			bufferedReader.close();
			
			System.out.println(responseContent );
			
			JSONArray jsonArray = new JSONArray(responseContent);
			
			JSONObject movie = new JSONObject(jsonArray.getJSONObject(3));
			
			for (int i = 0; i < movie.length(); i++) {
				System.out.println();
			}
			
	        return "result";
	    }
	
}
