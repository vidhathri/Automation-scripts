package automationFramework;
import org.testng.annotations.Test;


import org.testng.Assert;
import java.io.FileReader;
import java.io.IOException;
import org.openqa.selenium.By;

import Utility.constant;
import com.opencsv.CSVReader;

public class Login1 extends Base_class{
	   
	CSVReader reader;
	
	
	String CSV_file = constant.Path_TestData;

	@Test(description="This TC will perform valid login")

    public void verify_login() throws InterruptedException, IOException{
	{
	

   driver.findElement(By.xpath("//div[@class='container']//a[@href='/en/users/login']")).click();

      /** new CSVReader(new FileReader(CSV_file));
	   String [] csvCell;
    	  //while loop will be executed till the last line In CSV.
    	  while ((csvCell = reader.readNext()) != null) {  
  
    	  String UserName = csvCell[0];
    	  String Password = csvCell[1];
    **/
   
   reader = new CSVReader(new FileReader(CSV_file));
	  String [] csvCell;
	  //while loop will be executed till the last line In CSV.
	  while ((csvCell = reader.readNext()) != null) {  

	  String UserName = csvCell[0];
	  String Password = csvCell[1];
    	   driver.findElement(By.id("account")).sendKeys(UserName);
    	   driver.findElement(By.id("password")).sendKeys(Password);
    	   driver.findElement(By.xpath(".//*[@id='login-form']//button")).click();
    	   Assert.assertEquals("My Ads - ikman.lk", driver.getTitle());
  
            }
    }   

 }
}  	
    	