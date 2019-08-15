package com.example.demo.service;



public class Reqbuilder {
	
	private StringBuilder str ;
	private Search search;

	public Reqbuilder(Search srch) {
		super();
		str = new StringBuilder();
		search = srch;
		str.append(search.getSite()+search.getCategory()+"?api_key="+search.getApikey()+"&query="+search.getSeartchtext());
		//System.out.println(str.toString());
	}

	public String getStr() {
		return str.toString();
	};
	
	
}
