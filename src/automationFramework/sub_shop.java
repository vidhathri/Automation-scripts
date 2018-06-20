package automationFramework;


import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import com.opencsv.CSVReader;
import Utility.constant;

public class sub_shop {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws InterruptedException, IOException {
		   CSVReader reader;
		   String CSV_file = constant.Path_subshop;
		   System.setProperty("webdriver.gecko.driver", constant.firfx_brw);
		   WebDriver driver = new FirefoxDriver();
		   //System.setProperty("webdriver.chrome.driver", constant.chro_brw);
		   //WebDriver driver = new ChromeDriver();
		   driver.get("https://ss-admin-aikman.ap.ngrok.io/");
		   driver.findElement(By.xpath("//a[contains(@href,'/auth')]")).click();
		   reader = new CSVReader(new FileReader(CSV_file));
		   String [] csvCell;
	  
		   //while loop will be executed till the last line In CSV.
		   while ((csvCell = reader.readNext()) != null) {  

			   	String ID = csvCell[0];
			   	String Email = csvCell[1];
			   	String Slug = csvCell[2];
			    String Name = csvCell[3];
			    String BaPr = csvCell[4];
			    String Floor = csvCell[5];
			    String Unit = csvCell[6];
			    String UnPr = csvCell[7];
			    String PsDate = csvCell[8];
			    String Address = csvCell[9];  
			    String About = csvCell[10];
			    String Image = csvCell[11];
						driver.findElement(By.xpath(".//*[@id='name']")).sendKeys(ID);
						driver.findElement(By.id("email")).sendKeys(Email);
						driver.findElement(By.xpath("//form['noValidate']//button")).click();
						driver.findElement(By.xpath("//ul[@class='ui-nav-list']//a[text() = 'Manage']")).click();
						driver.findElement(By.xpath(".//a[text()='Site Users']")).click();
						driver.findElement(By.xpath(".//input[@id = 'search']")).sendKeys("m6@yopmail.com");
						driver.findElement(By.xpath(".//*[@id='search-users']//button")).click();
						driver.findElement(By.xpath("//a[contains(@class,'edit is-s')]")).click();
						//driver.get("https://ss-admin-aikman.ap.ngrok.io/user/5b0f7702aebf010001061ff3/shops");
						driver.findElement(By.xpath("//li//a[contains(@href,'shops')]")).click();
						driver.findElement(By.xpath("//div[@class='t-center']//a[text()='Add Project']")).click();
						driver.findElement(By.id("SubShopType_PROPERTY")).click();
						driver.findElement(By.xpath(".//*[@id='subshop-selector']//button")).click();
						driver.findElement(By.id("slug")).sendKeys(Slug);
						driver.findElement(By.id("name")).sendKeys(Name);
						driver.findElement(By.xpath(".//*[@id='base_price']")).sendKeys(BaPr);
						driver.findElement(By.id("floors")).sendKeys(Floor);
						driver.findElement(By.id("units")).sendKeys(Unit);
						driver.findElement(By.id("unit_price")).sendKeys(UnPr);
						driver.findElement(By.id("possession_date")).sendKeys(PsDate);
						Thread.sleep(3000);
	//driver.findElement(By.xpath(".//*[@id='possession_date']")).sendKeys("12/02/2022");
						driver.findElement(By.id("address")).sendKeys(Address);
						driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
						driver.findElement(By.id("about")).sendKeys(About);
						Select mySelect = new Select (driver.findElement(By.id("location_id")));
						mySelect.selectByIndex(10);
						  driver.findElement(By.id("add-image")).sendKeys(Image);
						Thread.sleep(5000);
						driver.findElement(By.xpath("//div[contains(@class,'submit')]")).click();
						driver.quit();
		   }
	}
}