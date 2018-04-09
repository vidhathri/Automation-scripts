package automationFramework;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageObjects.Login_page;

public class POM_TC {
	 //private static WebDriver driver = null;
	 
	public static void main(String[] args) {
		 
		//System.setProperty("webdriver.chrome.driver", "/Users/vidhathri/Downloads/chromedriver");
		//WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "/Users/vidhathri/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();
		//driver.get("https://ss-web-vikman.ap.ngrok.io/");
		driver.get("https://ss-web-abikroy.ap.ngrok.io/en");
		Login_page.btn_Login(driver).click();
		Login_page.txtbx_email(driver).sendKeys("mn@yopmail.com");
		Login_page.txtbx_psswd(driver).sendKeys("12345");
		Login_page.btn_login(driver).click();
		driver.close();
		
		

}
}