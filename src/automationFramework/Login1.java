package automationFramework;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Utility.constant;
import com.opencsv.CSVReader;

public class Login1{
	WebDriver driver;
	String CSV_file = constant.Path_TestData;
	 // utils.setExcelFile(constant.Path_TestData + constant.File_TestData);

	private CSVReader reader;
	
	
	@BeforeClass
    public void openBrowser(){

        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    }


    @Test
    public void verify_login() throws InterruptedException, IOException{
    	//Thread.sleep(5000);
    	Properties obj = new Properties();   
  	  //Create Object of FileInputStream Class. Pass file path.
  	  FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"//src//dataFile.properties");
  	  //Pass object reference objfile to load method of Properties object.
  	  obj.load(objfile); 

       driver.get("https://ss-web-aikman.ap.ngrok.io");
    	driver.findElement(By.xpath("//div[@class='container']//a[@href='/en/users/login']")).click();

      reader = new CSVReader(new FileReader(CSV_file));
    	  String [] csvCell;
    	  //while loop will be executed till the last line In CSV.
    	  while ((csvCell = reader.readNext()) != null) {  
  
    	  String UserName = csvCell[0];
    	  String Password = csvCell[1];
    	  // driver.findElement(By.id("account")).sendKeys(UserName);
    	   driver.findElement(By.id(("account"))).sendKeys(UserName);
    	   driver.findElement(By.id("password")).sendKeys(Password);
    	   //driver.findElement(By.id(obj.getProperty("password"))).sendKeys(Password);
    	      driver.findElement(By.xpath(obj.getProperty("submitbtn"))).click();
     // driver.findElement(By.xpath(".//*[@id='login-form']//button")).click();
            }
    }   

     @Before
     public void driver_close(){
    	 driver.quit();
     }
     }
        	
    	