package com.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebConnector {
   public static WebDriver driver=null;
   
   public WebConnector(){
	   
   }
   
   public void openBrowser(String browser){
	   
	   if(browser.equalsIgnoreCase("FireFox")){
	     driver=new FirefoxDriver();
	   }else{
		   System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chrome\\chromedriver.exe");
		   driver=new ChromeDriver();
	   }   
   }
   public void navigate(String url){
	    driver.get(url);
   } 
   public void click(String obj){
	 try{ 
	    driver.findElement(By.xpath(obj)).click();
	    Thread.sleep(4000);
	 }catch(Exception e){
		 System.out.println("In Click Exception...!");
	 }   
   }
   public void type(String obj,String value){
	   driver.findElement(By.xpath(obj)).sendKeys(value);
   }
   
   public boolean isElementPresent(String obj){
	   
	    if(driver.findElements(By.xpath(obj)).size()!=0)
	    	return true;
	    
	  return false;  
   }
   public void quitDriver(){
	   driver.quit();
	  // driver=null;
   }
}
