package automationFramework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class POM_TC_1Test {
	WebDriver driver = new FirefoxDriver();
  @BeforeClass
  public void beforeClass() {
	  
	  System.setProperty("webdriver.gecko.driver", "/Users/vidhathri/Downloads/geckodriver");
	
  }

  @AfterClass
  public void afterClass() {
	 driver.close();
  }


  @Test
  public void main() {
		driver.get("https://ss-web-aikman.ap.ngrok.io");
        driver.manage().window().maximize();
  }
}
