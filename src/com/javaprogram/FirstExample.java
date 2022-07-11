package com.javaprogram;

public class FirstExample {

	public static void main(String[] args) {
		System.out.println("Hallo kalian");
		System.out.println("saya silviani");
		
		String kata = "Hallo gais";
		System.out.println(kata);
		
	int silvi = 10;
	int putri = 12;
	System.out.println(silvi+putri);
		
	String Batch10 = " nama saya silviani";
	String Batch11 = kata + Batch10;
	
	System.out.println(Batch11);
	
	String url = "https://www.google.com/files/exe.pdf";
	//expented get true
	System.out.println(url.endsWith("pdf"));
	//expented get false
	System.out.println(url.endsWith("exe"));
	
	String fathur = "Fathur Rahman Fauzan";
	String Silviani = "silviani nurlita Putri";
	//this is false
	System.out.println(fathur.equals(Silviani));
	//this will return true because
	System.out.println(fathur.equalsIgnoreCase(fathur));
	
	String regex = "Endemi2022";
	System.out.println(regex.replaceAll("[0-9]", ""));
	System.out.println(regex.replaceAll("[a-z]", ""));
	System.out.println(regex.replaceAll("[A-Z]", ""));
	System.out.println(regex.replaceAll("[A-z-9]", ""));
	
	
	String username = "username";
	String menuItem = "Disini akan di masukan ke yang baru";
	
	System.out.println(String.format(menuItem, username));
	
	String loginPage = "Login Page";
	String secureArea = "Secure Area";
	
	String path = "//h2[normalize-apace () ='%s']";
	System.out.println(String.format(path, loginPage));
	System.out.println(String.format(path, secureArea));
	
	}

}
