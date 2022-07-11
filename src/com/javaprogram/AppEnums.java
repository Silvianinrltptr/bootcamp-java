package com.javaprogram;

public enum AppEnums {
	
	SUCCESS ("This is request is succesfully transmited"), FAILED ("This request is failed");
	private String filter;
	
	private AppEnums(String filter) {
		this.filter = filter;
	}
	
	public String getValue() {
		return filter;
		
	}
	

}
