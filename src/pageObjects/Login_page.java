package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_page {

 private static WebElement element = null;
	
	public static WebElement btn_Login(WebDriver driver){
		element = driver.findElement(By.xpath("//div[@class='container']//a[@href='/en/users/login']"));
	    return element;
	  }
	
	public static WebElement txtbx_email(WebDriver driver){
		element = driver.findElement(By.id("account"));
	    return element;
	    }
	
	public static WebElement txtbx_psswd(WebDriver driver){
		element = driver.findElement(By.id("password"));
	    return element;
 }
	
	public static WebElement btn_login(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='login-form']//button"));
	    return element;
 }
	
}
