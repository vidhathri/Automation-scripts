package automationFramework;


import java.io.FileReader;

import com.opencsv.CSVReader;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import Utility.constant;
import pageObjects.Post_page;

public class POM_TC_1 {

	 static CSVReader reader;
	 static String CSV_file = constant.Path_TestData;
	
	//private static final String CSV_file = null;
    


	public static void main(String[] args) throws Exception {
		 
		//System.setProperty("webdriver.gecko.driver", constant.firfx_brw);
		//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", constant.chro_brw);
		WebDriver driver = new ChromeDriver();
		driver.get("https://ss-web-aikman.ap.ngrok.io/");
		driver.findElement(By.xpath("//div[@class='container']//a[@href='/en/users/login']")).click(); 
	
		

		reader = new CSVReader(new FileReader(CSV_file));
		 

			  String[] csvCell;
	
			  while ((csvCell = reader.readNext()) != null) {  

				  String UserName = csvCell[0];
				  String Password = csvCell[1];
		   driver.findElement(By.id("account")).sendKeys(UserName);
		   driver.findElement(By.id("password")).sendKeys(Password);
	       driver.findElement(By.xpath(".//*[@id='login-form']//button")).click();
	       
	       Post_page.btn_postad(driver).click();
	       Post_page.sclt_ad_type(driver).click();
	       driver.findElement(By.xpath("//div[contains(@class, 'is-level-1')]//li[contains(@class, 'cat-409')]")).click();
	       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	       
	       WebElement element = driver.findElement(By.xpath("//div[contains(@class , 'is-level-2')]//a[text()='New Developments']"));
	       JavascriptExecutor js = (JavascriptExecutor)driver; 
	       js.executeScript("arguments[0].click();", element);
	       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	       WebElement uploadElement = Post_page.upload_img(driver);
	       
	      uploadElement.sendKeys("/Users/vidhathri/Desktop/Screen Shot 2018-05-14 at 4.26.43 PM.png");
	      Thread.sleep(5000);
	       Select oSelect = new Select(Post_page.sclt_beds(driver));
	       oSelect.selectByVisibleText("5");
	       Select aSelect = new Select(Post_page.sclt_baths(driver));
	       aSelect.selectByVisibleText("5");
	       
	       Post_page.input_title(driver).sendKeys("Test Title");
	       Post_page.text_description(driver).sendKeys("This is the description for automation framework");
	       Post_page.send_size(driver).sendKeys("120");
	       Post_page.click_post(driver).click();
	       
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
}

