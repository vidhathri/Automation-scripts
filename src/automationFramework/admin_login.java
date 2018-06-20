package automationFramework;

import java.io.IOException;

//import java.util.concurrent.TimeUnit;


//import org.junit.Assert;
import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import Utility.constant;

public class admin_login extends Base_class {

	@Test(description="This TC will perform valid login")

    public void verify_login() throws InterruptedException, IOException{
	{
		// TODO Auto-generated method stub
		
	   // System.setProperty("webdriver.gecko.driver", constant.bwsr_url)
		//WebDriver driver = new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver", constant.chro_brw);
		//WebDriver driver = new ChromeDriver();
		driver.get(constant.adurl);
		driver.findElement(By.xpath("//div[contains(@class,'ui-panel-block')]/a[contains(@class,'is-primary is-auth')]")).click();
		//driver.findElement(By.xpath(".//*[@id='name']")).sendKeys("test");
		driver.findElement(By.id("name")).sendKeys("test");
		driver.findElement(By.id("email")).sendKeys("testing@saltside.se");
		driver.findElement(By.xpath("//form['noValidate']//button")).click();
		WebElement el = driver.findElement(By.xpath("//div[@class='container']//h1"));
		String test= el.getText();
		System.out.println(test);
		driver.quit();
		
		
	}
	

}
}



