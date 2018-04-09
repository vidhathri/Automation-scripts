package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import Utility.constant;
import Utility.utils;

public class serp {
	public static void main(String[] args) throws Exception {
		//utils.setExcelFile(constant.Path_TestData + constant.File_TestData,"Sheet2");

	System.setProperty("webdriver.gecko.driver", "/Users/vidhathri/Downloads/geckodriver");
	WebDriver driver = new FirefoxDriver();
	driver.get(constant.URL);
	driver.findElement(By.xpath("//ul[@class = 'ui-nav-list']//li")).click();
	//driver.findElement(By.xpath("//div[contains(@class,'serp-search')]//a[contains(@data-modal-selector,'serp-locations')]")).click();
	//String value = utils.getCellData(1, 1);
	
	/**WebElement element = driver.findElement(By.xpath("//div[contains(@class , 'has-sep has-sub')]//li)]"));
	element.sendKeys(value);
	element.click();
*/
	WebElement element = driver.findElement(By.xpath("//div[contains(@class,'is-level-1')]//a[text()='Ampara']"));
	// driver.findElement(By.xpath("//div[contains(@class,'is-level-2')]//a[@href = '/en/ads/akkarepattu']")).click();
	//element.sendKeys("/en/ads/angoda");
	//element.click();
	//WebElement element = driver.findElement(By.xpath("//div[contains(@class , 'is-level-2')]//a[text()='New Developments']"));
   JavascriptExecutor js = (JavascriptExecutor)driver; 
    js.executeScript("arguments[0].click();", element);
    WebElement element1= driver.findElement(By.xpath("//div[contains(@class,'is-level-2')]//a[text() = 'Akkarepattu']"));
    JavascriptExecutor js1 = (JavascriptExecutor)driver; 
    js1.executeScript("arguments[0].click();", element1);
	}
}