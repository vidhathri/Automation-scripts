package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
//import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utility.constant;

public class admin_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", constant.bwsr_url);
		WebDriver driver = new FirefoxDriver();
		driver.get("https://ss-admin-aikman.ap.ngrok.io/");
		driver.findElement(By.xpath("//div[contains(@class,'ui-panel-block')]/a[contains(@class,'is-primary is-auth')]")).click();
		driver.findElement(By.xpath(".//*[@id='name']")).sendKeys("test");
		driver.findElement(By.id("email")).sendKeys("testing@saltside.se");
		driver.findElement(By.xpath("//form['noValidate']//button")).click();
		driver.findElement(By.xpath("//ul[@class='ui-nav-list']//a[text() = 'Manage']")).click();
		//ul[@class='ui-nav-submenu']
		driver.findElement(By.xpath(".//a[text()='Site Users']")).click();
		driver.findElement(By.xpath(".//input[@id = 'search']")).sendKeys("new@yopmail.com");
		driver.findElement(By.xpath(".//*[@id='search-users']//button")).click();
		driver.findElement(By.xpath("//a[contains(@class,'edit is-s')]")).click();
		driver.findElement(By.xpath("//a[text()='Memberships']")).click();
		driver.findElement(By.xpath(".//*[@id='level-properties']/option[text()='Business Plus']")).click();
		driver.findElement(By.xpath(".//*[@id='starts_at-properties']")).sendKeys("2018-04-01");
		driver.findElement(By.xpath(".//*[@id='expires_at-properties']")).sendKeys("2018-04-30");
		driver.findElement(By.xpath("//div[@class='membership properties']//button[contains(@class,'save-sub is-s')]")).click();
		driver.findElement(By.xpath("//a[text()='Shop']")).click();
		driver.findElement(By.id("name")).sendKeys("Test-Automation-name");
		driver.findElement(By.id("slug")).sendKeys("testing-automation-slug");
		driver.findElement(By.id("tagline")).sendKeys("Test-Automation-tag-line");
		driver.findElement(By.id("description")).sendKeys("Test-Automation-description");
		WebElement emailbtn = driver.findElement(By.xpath("//div[@class='ui-field is-list']//input[@name='contact_card[email]']"));
		emailbtn.click();
		driver.findElement(By.xpath("//div[@class='submit']")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);	
		//Alert alert = driver.switchTo().alert();	
		//driver.switchTo().alert().accept();
		
		WebElement yesbtn= driver.findElement(By.xpath("//div[@class='confirmation-modal']//button[contains(text(),'create the shop') and contains(@class,'confirm')]"));
	
		//button[contains(@class,'is-secondary confirm')]
		JavascriptExecutor js = (JavascriptExecutor)driver; 
        js.executeScript("arguments[0].click();",yesbtn);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       //WebElement yesbtn= driver.findElement(By.xpath("//button[contains(@class,'is-secondary confirm')]"));
        //Alert alert =   driver.switchTo().alert();
        //alert.getText();
		//driver.quit();
       
	
	
	}

}



