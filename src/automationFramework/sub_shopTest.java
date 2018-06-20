package automationFramework;

import org.testng.annotations.Test;


import org.testng.annotations.BeforeTest;
import org.testng.Reporter;

import org.testng.annotations.AfterTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.Select;

import Utility.constant;

public class sub_shopTest extends Base_class{
  private WebDriver driver;

/**
@BeforeTest
  public void beforeClass() {
	  System.setProperty("webdriver.gecko.driver", constant.firfx_brw);
		WebDriver driver = new FirefoxDriver();
	
  }
**/


  @Test(description="This TC will perform valid login")


	  
	  public void sub_shop() throws InterruptedException{
			{
	//  driver = null;
	   driver.get("https://ss-admin-aikman.ap.ngrok.io/");
		driver.findElement(By.xpath("//div[contains(@class,'ui-panel-block')]/a[contains(@class,'is-primary is-auth')]")).click();
		driver.findElement(By.xpath(".//*[@id='name']")).sendKeys("test");
		driver.findElement(By.id("email")).sendKeys("testing@saltside.se");
		driver.findElement(By.xpath("//form['noValidate']//button")).click();
		//String url = driver.getCurrentUrl();
	    //driver.getCurrentUrl();
		driver.get("https://ss-admin-aikman.ap.ngrok.io/user/5b0f7702aebf010001061ff3/shops");
		driver.findElement(By.xpath("//div[@class='t-center']//a[text()='Add Project']")).click();
		driver.findElement(By.id("SubShopType_PROPERTY")).click();
		driver.findElement(By.xpath(".//*[@id='subshop-selector']//button")).click();
		driver.findElement(By.id("slug")).sendKeys("project-vv1");
		driver.findElement(By.id("name")).sendKeys("project-b");
		driver.findElement(By.xpath(".//*[@id='base_price']")).sendKeys("5600");
		driver.findElement(By.id("floors")).sendKeys("4");
		driver.findElement(By.id("units")).sendKeys("5");
		driver.findElement(By.id("unit_price")).sendKeys("434444");
	    driver.findElement(By.id("possession_date")).sendKeys("2019-09-09");
		Thread.sleep(3000);
	    driver.findElement(By.id("address")).sendKeys("project-Address");
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		driver.findElement(By.id("about")).sendKeys("This is about us for the project ! !");
	    Select mySelect = new Select (driver.findElement(By.id("location_id")));
	    mySelect.selectByIndex(10);
	   
	  driver.findElement(By.id("add-image")).sendKeys("/Users/vidhathri/Desktop/Screen Shot 2018-05-14 at 4.26.43 PM.png");
	
	  Thread.sleep(10000);
	  driver.findElement(By.xpath("//div[contains(@class,'submit')]")).click();
  }

/**
@AfterTest
public void closeApplication()
{
	driver.quit();
	Reporter.log("=====Browser Session End=====", true);
	
} 
**/

}
  
  
}







==========================================
String UserName = csvCell[0];
String Password = csvCell[1];
	   driver.findElement(By.id("account")).sendKeys(UserName);
	   driver.findElement(By.id("password")).sendKeys(Password);

    
     
        
 
	   driver.findElement(By.xpath(".//*[@id='name']")).sendKeys("test");
		driver.findElement(By.id("email")).sendKeys("testing@saltside.se");
		driver.findElement(By.id("slug")).sendKeys("project-vv");
		driver.findElement(By.id("name")).sendKeys("project-b");
		driver.findElement(By.xpath(".//*[@id='base_price']")).sendKeys("5600");
		driver.findElement(By.id("floors")).sendKeys("4");
		driver.findElement(By.id("units")).sendKeys("5");
		driver.findElement(By.id("unit_price")).sendKeys("434444");
		driver.findElement(By.id("possession_date")).sendKeys("2019-09-09");
		driver.findElement(By.id("address")).sendKeys("project-Address");
	    driver.findElement(By.id("about")).sendKeys("This is about us for the project ! !");
		
	    driver.findElement(By.id("add-image")).sendKeys("/Users/vidhathri/Desktop/Screen Shot 2018-05-14 at 4.26.43 PM.png");
	    driver.findElement(By.id("add-image")).sendKeys(Image);






