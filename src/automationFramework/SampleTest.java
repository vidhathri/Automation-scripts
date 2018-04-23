package automationFramework;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;

import Utility.constant;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class SampleTest {
	WebDriver driver;
	private CSVReader reader;
	String CSV_file = constant.Path_TestData;
  @BeforeTest
  public void openBrowser(){

	        driver = new FirefoxDriver();
	        driver.manage().window().maximize();
	        driver.get(constant.URL);
	        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
  }
  
  @Test
  public void verify_login() throws IOException {
	  Properties obj = new Properties(); 
	  FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"//src//dataFile.properties");
 	  obj.load(objfile); 
 	  driver.findElement(By.xpath("//div[@class='container']//a[@href='/en/users/login']")).click();
 	  reader = new CSVReader(new FileReader(CSV_file));
	  String [] csvCell;
	  while ((csvCell = reader.readNext()) != null) {  
		  
    	  String UserName = csvCell[0];
    	  String Password = csvCell[1];
    	  driver.findElement(By.id(obj.getProperty("email"))).sendKeys(UserName);
    	  driver.findElement(By.id(obj.getProperty("password"))).sendKeys(Password);
    	  driver.findElement(By.xpath(obj.getProperty("submitbtn"))).click();
  }
}
  @Test
  public void verify_serp_data() {
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
	  
	  
  }


  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
