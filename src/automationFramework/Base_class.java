package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Utility.constant;
 
public class Base_class 
{
        
        
	WebDriver driver;
	
	@BeforeClass
	public void setupApplication()
	{
		
		Reporter.log("=====Browser Session Started=====", true);
		
		//driver = new FirefoxDriver();
		
		//System.setProperty("webdriver.gecko.driver", constant.firfx_brw);
	    //driver = new FirefoxDriver();
	    System.setProperty("webdriver.chrome.driver", constant.chro_brw);
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		//driver.get("https://ss-web-aikman.ap.ngrok.io");
		
		Reporter.log("=====Application Started=====", true);
	}
	
	
	@AfterClass
	public void closeApplication()
	{
		driver.quit();
		Reporter.log("=====Browser Session End=====", true);
		
	}
	
}