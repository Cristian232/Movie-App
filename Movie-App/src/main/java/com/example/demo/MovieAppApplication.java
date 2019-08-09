package com.example.demo;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.hibernate.validator.internal.util.privilegedactions.GetAnnotationAttribute;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication(scanBasePackages={"com.example.demo"})
public class MovieAppApplication {

	
	public static void main(String[] args) throws IOException {
		SpringApplication.run(MovieAppApplication.class, args);
		
//		URL url = new URL("https://api.themoviedb.org/3/movie/76341?api_key=fbcf98951251b4a93b1e8101ed89bd95");
//		HttpURLConnection con = (HttpURLConnection) url.openConnection();
//		con.setRequestMethod("GET");
//		
//		int status = con.getResponseCode();
//		BufferedReader in = new BufferedReader(
//		        new InputStreamReader(con.getInputStream()));
//		
//		String inputLine;
//		StringBuffer response = new StringBuffer();
//
//		while ((inputLine = in.readLine()) != null) {
//			response.append(inputLine);
//		}
//		
		//System.out.println("hello working? =>  "  + status + " ++  " + response.toString());
		
		
	}

}
