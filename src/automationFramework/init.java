package automationFramework;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class init {
	public WebDriver driver;
	 @BeforeSuite
	    public void beforeSuite() throws InterruptedException, IOException {
	        //Setting Chrome Driver and disabling the save password option
		  System.setProperty("webdriver.gecko.driver", "/Users/vidhathri/Downloads/geckodriver");
		  WebDriver driver = new FirefoxDriver();
/**
	        //Opening the URL
	        driver.get(constant.URL);
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	        Properties obj = new Properties();   
	    	  //Create Object of FileInputStream Class. Pass file path.
	    	  FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"//src//dataFile.properties");
	    	  //Pass object reference objfile to load method of Properties object.
	    	  obj.load(objfile); 

	         // driver.get("https://ss-web-aikman.ap.ngrok.io");
	      	driver.findElement(By.xpath("//div[@class='container']//a[@href='/en/users/login']")).click();

	        CSVReader reader = new CSVReader(new FileReader(CSV_file));
	      	  String [] csvCell;
	      	  //while loop will be executed till the last line In CSV.
	      	  while ((csvCell = reader.readNext()) != null) {  
	    
	      	  String UserName = csvCell[0];
	      	  String Password = csvCell[1];
	           driver.findElement(By.id(("account"))).sendKeys(UserName);
	    	   driver.findElement(By.id("password")).sendKeys(Password);
	      	  }
	      	  **/
	 }

	    @AfterSuite
	    public void afterSuite() {
	        //Closing the driver
	        driver.close();
	    }

	
}
