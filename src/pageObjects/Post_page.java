package pageObjects;


import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import objectRepo.Repositoryparser;

public class Post_page {
	
	private static WebElement element = null;
	
	
	public static WebElement btn_postad(WebDriver driver){
		element = driver.findElement(By.xpath("//div[@class='container']//a[@href='/en/post-ad']"));
	    return element;
	  }
	 
	
	public static WebElement sclt_ad_type(WebDriver driver){
		element = driver.findElement(By.xpath("//div[@class='post-ad-types row lg-g']//li[@class='ui-nav-item for_sale']"));
	    return element;	
	}

	public static WebElement sclt_category(WebDriver driver){
		element = driver.findElement(By.xpath("//div[@class='progress-content']//div[@class='ui-sl-group is-level-1 has-sep has-sub']//li[@class='cat-409']"));
	    return element;	
	}
	
	public static WebElement sclt_beds(WebDriver driver){
		element = driver.findElement(By.id("fields-bedrooms-value"));
	    return element;	
	}
	
	public static WebElement sclt_baths(WebDriver driver){
		element = driver.findElement(By.id("fields-bathrooms-value"));
	    return element;	
}
	
	public static WebElement input_title(WebDriver driver){
		element = driver.findElement(By.xpath("//div[@class='post-fields']//input[@id='fields-title-value']"));
	    return element;	
}

	
	
	public static WebElement text_description(WebDriver driver){
	   element = driver.findElement(By.xpath("//div[@class='post-fields']//textarea[@id='fields-description-value']"));
	     // xpath = .//*[@id= 'fields-description-value']
	    return element;	
}

	public static WebElement select_subshop(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='sub_shop']"));
	    return element;	
}

	public static WebElement click_post(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@name= 'post']"));
	    return element;	
}
	
	
	public static WebElement upload_img(WebDriver driver){
		element = driver.findElement(By.xpath("//div[@class='post-upload']//input[@id='image']"));
	    return element;	
}
	
	
	
	public static WebElement send_size(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='fields-size-value']"));
	    return element;	
}
	
	
	
	

	//xpath = .//*[@id='image']
	
	
	
	
}
