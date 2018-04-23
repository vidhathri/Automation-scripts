package automationFramework;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class ReadFileData {
	
	WebDriver driver = null;
	
	@BeforeMethod
	  public void openbrowser() throws IOException { 
	  System.setProperty("webdriver.gecko.driver", "/Users/vidhathri/Downloads/geckodriver");
		//"D:\\Selenium Files\\geckodriver.exe
	   driver = new FirefoxDriver();
	   driver.get("https://ss-web-aikman.ap.ngrok.io");
	   driver.manage().window().maximize();   
	  }
	 
	 @AfterMethod
	  public void closebrowser() {   
	   driver.quit();
	  }  
	 @Test
	  public void Login() throws IOException{
	  //Create Object of Properties Class.
	  Properties obj = new Properties();   
	  //Create Object of FileInputStream Class. Pass file path.
	  FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"//src//dataFile.properties");
	  //Pass object reference objfile to load method of Properties object.
	  obj.load(objfile); 
	  
	  //Sum operation on calculator.
	  //Accessing element locators of all web elements using obj.getProperty(key)
	  //driver.findElement(By.id(obj.getProperty("eight"))).click();
	 
      driver.findElement(By.xpath(obj.getProperty("Loginbtn"))).click();
      driver.findElement(By.id(obj.getProperty("email"))).sendKeys("j1@yopmail.com");
      driver.findElement(By.id(obj.getProperty("password"))).sendKeys("12345");
      driver.findElement(By.xpath(obj.getProperty("submitbtn"))).click();
      
}
	 
}



