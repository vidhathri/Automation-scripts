package automationFramework;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

 
import objectRepo.Repositoryparser;
public class test {
	private static Repositoryparser parser;
	private static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
 
	
 
		driver = new FirefoxDriver();
		driver.get("https://ss-web-aikman.ap.ngrok.io/");
		parser = new Repositoryparser("/Users/vidhathri/Documents/workspace1/Happy-Test/bin/objectRepo.properties");
	   driver.findElement(By.xpath("//div[@class='container']//a[@href='/en/users/login']")).click();
       //WebElement lognbtn = driver.findElement(parser.getbjectLocator("Loginbtn"));
        //WebElement btn = driver.findElement(parser.getbjectLocator("Xpath"));
		//element.click();
       // btn.click();
		//Lets see how we can find the first name field
		WebElement Email = driver.findElement(parser.getbjectLocator("email"));
		WebElement Password = driver.findElement(parser.getbjectLocator("password"));
		Email.sendKeys("j1@yopmail.com");
		Password.sendKeys("12345");

		WebElement element = driver.findElement(parser.getbjectLocator("Name"));
		element.click();
	
 
	
		driver.quit();
	}
 

}