package com.example.demo.service;



public class reqbuilder {
	
	private StringBuilder str ;
	private Search search;

	public reqbuilder() {
		super();
		str = new StringBuilder();
		search = new Search("abc","movie");
		str.append(search.getSite()+search.getCategory()+"?api_key="+search.getApikey()+"&query="+search.getSeartchtext());
		//System.out.println(str.toString());
		
	};
}
