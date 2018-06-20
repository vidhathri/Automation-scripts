package automationFramework;
//import java.awt.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import Utility.constant;

import java.util.List;
//import Utility.constant;


public class subshop_serp {
	public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.gecko.driver",constant.firfx_brw);
	WebDriver driver = new FirefoxDriver();
	driver.get("https://ss-web-aikman.ap.ngrok.io/en/ads/sri-lanka/new-developments");
	String xpathofElement="//div[contains(@class,'item-content')]/a[@class='item-title h4']"; 
	 List <WebElement> links= driver.findElements(By.xpath(xpathofElement));
	 	for(int i=0;i<links.size();i++){
	 		links= driver.findElements(By.xpath(xpathofElement)); // this step is must, because whenever you go to other page all store webelements in a list will washout
	 		links.get(i).click();
	 		WebElement title = driver.findElement(By.xpath(".//*[@id='app-container']//h1[contains(@class,'page-header')]"));
	 		String text = title.getText();
	 	    System.out.println(text);
	 	   WebElement amount = driver.findElement(By.xpath(".//div[contains(@class,'ui-price-tag')]"));
	 	   String text1 = amount.getText();
	 	   System.out.println(text1);
	 	   List<WebElement> elements = driver.findElements(By.xpath(".//p[contains(@class,'is-font-size')]"));
	 	   java.util.Iterator<WebElement> val = elements.iterator();
    while (val.hasNext()) {
        String values = val.next().getText();

        if(!values.equals("null"))
        {
            System.out.println("The value is " + values);
        }
        else
        {
        	 System.out.println("Failed to get data ");
        }

    }
	 	// do whatever the actions you need to perform
	 		driver.navigate().back();

}
	 	driver.quit();
    }
    
	}
