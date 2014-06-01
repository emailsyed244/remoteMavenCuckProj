package com.util;

import java.util.HashMap;
import java.util.Map;

public class ConstantClass {

	 Map<String,String> loginValues= new HashMap<String, String>();
	 Map<String,String> landPageValues= new HashMap<String, String>();
	public ConstantClass(){
		loginValues.put("BROWSER","Firefox");
		loginValues.put("URL","https://login.salesforce.com/");
		loginValues.put("USERVALUE","me2uonly@hotmail.co.uk");
		loginValues.put("PASSVALUE","password123");
		loginValues.put("USERXPATH","//input[@id='username']");
		loginValues.put("PASSXPATH","//input[@id='password']");
		loginValues.put("LOGINBUTTON","//button[@id='Login']");
		landPageValues.put("LINK_HOME", "//li[@id='home_Tab']");
		landPageValues.put("LINK_CONTACT", "//li[@id='Contact_Tab']");
	}
	
	public String getLoginValues(String key){
		
		return loginValues.get(key);
	}
	public String getLandPageValues(String key){
		
		return landPageValues.get(key);
	}	
	public enum LoginValues{
		BROWSER("Firefox"),
		URL("https://login.salesforce.com/"),
		USERVALUE("me2uonly@hotmail.co.uk"),
		PASSVALUE("password123"),
		USERXPATH("//input[@id='username']"),
		PASSXPATH("//input[@id='password']"),
		LOGINBUTTON("//button[@id='Login']"),
		;
		private String value;
		private LoginValues(String val){
			this.value=val;
		}
		public String getLoginValues(){
			return this.value;
		}
	}
	public enum LandPageValues{
		LINK_HOME("//li[@id='home_Tab']"),
		LINK_CONTACT("//li[@id='Contact_Tab']"),
		;
		private String value;
		private LandPageValues(String val){
			this.value=val;
		}
		public String getLandPageValues(){
			return this.value;
		}
	}
	
}
