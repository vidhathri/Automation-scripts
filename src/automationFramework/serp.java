package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import Utility.constant;
//import Utility.utils;

public class serp {
	public static void main(String[] args) throws Exception {
		//utils.setExcelFile(constant.Path_TestData + constant.File_TestData,"Sheet2");

	System.setProperty("webdriver.gecko.driver", "/Users/vidhathri/Downloads/geckodriver");
	WebDriver driver = new FirefoxDriver();
	driver.get(constant.URL);
	driver.findElement(By.xpath("//ul[@class = 'ui-nav-list']//li")).click();
	driver.findElement(By.xpath("//a[contains(@class,'set-location')]")).click();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//li[@class= 'loc-1432']")).click();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	WebElement element = driver.findElement(By.xpath("//div[contains(@class , 'is-level-2')]//a[text() = 'Akkarepattu']"));
	JavascriptExecutor js = (JavascriptExecutor)driver; 
	js.executeScript("arguments[0].click();", element);
	 
	  
	}
}