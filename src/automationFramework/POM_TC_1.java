package automationFramework;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import Utility.constant;
import Utility.csvUtils;
import Utility.utils;
import pageObjects.Post_page;

public class POM_TC_1 {
	
	public static void main(String[] args) throws Exception {
		 
		System.setProperty("webdriver.gecko.driver", "/Users/vidhathri/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get(constant.URL);
		
		driver.findElement(By.xpath("//div[@class='container']//a[@href='/en/users/login']")).click(); 
		utils.setExcelFile(constant.Path_TestData + constant.File_TestData,"Sheet1");
		//csvUtils.fileReader(constant.Path_TestData + constant.File_TestData);
		String Username = utils.getCellData(1, 1);
		//String Username = 
		driver.findElement(By.id("account")).sendKeys(Username);
		String Password = utils.getCellData(1, 2);
		driver.findElement(By.id("password")).sendKeys(Password);
		
        driver.findElement(By.xpath(".//*[@id='login-form']//button")).click();
		Post_page.btn_postad(driver).click();
		Post_page.sclt_ad_type(driver).click();
		//Post_page.sclt_category(driver).click();
		//driver.get("https://ss-web-aikman.ap.ngrok.io/en/post-ad/details?type=for_sale&category=412&location=2129");
		driver.findElement(By.xpath("//div[contains(@class, 'is-level-1')]//li[contains(@class, 'cat-409')]")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.xpath("//div[contains(@class , 'is-level-2')]//a[text()='New Developments']"));
        JavascriptExecutor js = (JavascriptExecutor)driver; 
        js.executeScript("arguments[0].click();", element);
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Post_page.sclt_baths(driver)
		WebElement uploadElement = Post_page.upload_img(driver);
		uploadElement.sendKeys("/Users/vidhathri/Downloads/600px-Hazard_X.svg.png");

		 //Post_page.upload_img(driver).click();
		   Select oSelect = new Select(Post_page.sclt_beds(driver));
	       oSelect.selectByVisibleText("5");
	       Select aSelect = new Select(Post_page.sclt_baths(driver));
	       aSelect.selectByVisibleText("5");
		
	    Post_page.input_title(driver).sendKeys("Test Title");
	    Post_page.text_description(driver).sendKeys("This is the description for automation framework");
	    //Post_page.select_subshop(driver)
	    //Select sSelect = new Select(Post_page.select_subshop(driver));
	    //sSelect.selectByVisibleText("sub-shop-mar-27");
	    Post_page.send_size(driver).sendKeys("120");
	       Post_page.click_post(driver).click();
	       //Assert.Equals("", actuals);
	      //assertsTrue(isTextPresent("Your ad was successfully submitted for review"));
	       
	       WebElement el=driver.findElement(By.xpath("//div[@class='text t-left col-11']//h1"));
	       String text=el.getText();
	       System.out.println(text);
	       
	       if(text.contains("Your ad was successfully submitted for review")){

	    	   System.out.println("Expected text is obtained");

	    	   }else{

	    	   System.out.println("Expected text is not obtained");

	    	   }
	       driver.close();
	       
	       
	    
	}

}

