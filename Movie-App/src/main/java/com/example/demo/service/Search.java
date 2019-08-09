package com.example.demo.service;

public class Search {
	
	private String apikey = "fbcf98951251b4a93b1e8101ed89bd95" ;
	private String site = "https://api.themoviedb.org/3/search/" ;
	private String category;
	private String seartchtext;

	public Search(String searchtext ,String category) {
		super();
		this.setSeartchtext(searchtext);
		this.setCategory(category);
	}
	
	public String getSeartchtext() {
		return seartchtext;
	}

	public void setSeartchtext(String seartchtext) {
		this.seartchtext = seartchtext;
	}


	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getApikey() {
		return apikey;
	}

	public String getSite() {
		return site;
	}
	
}
