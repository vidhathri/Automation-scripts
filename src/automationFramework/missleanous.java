package automationFramework;

public class missleanous {
	//WebElement element = driver.findElement(By.xpath("//div[contains(@class , 'is-level-1')]//a[text() = 'Colombo']"));
    //JavascriptExecutor js = (JavascriptExecutor)driver; 
    //js.executeScript("arguments[0].click();", element);
	//driver.findElement(By.xpath("//div[contains(@class,'is-level-1')]//li[@class= 'loc-1432']")).click();
   // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//WebElement element = driver.findElement(By.xpath("//div[contains(@class , 'is-level-2')]//a[text() = 'Nugegoda']"));
    //JavascriptExecutor js = (JavascriptExecutor)driver; 
    //js.executeScript("arguments[0].click();", element);
	//driver.findElement(By.xpath("//li[@class= 'loc-1506']")).click();
    //driver.findElement(By.xpath("//li[@class= 'loc-1549']")).click();
	//driver.findElement(By.xpath("//li[@class='loc-1434']")).click();
	//driver.findElement(By.xpath("//li[@class='loc-1434']")).click();
	
	// Above is for serp page
	   //String testCaseName = csvCell[0];
	  /**   CSVReader reader = null;
  try {
      reader = new CSVReader(new FileReader(CSV_file));
      String[] cell = reader.readNext();
      while ((cell = reader.readNext()) != null) {
          int i = 0;
          String UserName = cell[i];
          String Password = cell[i + 1];
         // String message = cell[i + 2];

	   //String UserName = cell[i];
	   
	   //String Password =cell[i + 1];
	    **/
}
//String passs = csvCell[3];
//String company = csvCell[4];
// driver.findElement(By.id("account")).sendKeys(username);
//System.out.println("System enters search keyword.");
//Thread.sleep(3000);
 

//****Add cssSelector of your 1st webelement

/**List<WebElement> button = driver.findElements(By.xpath(xpathofElement));
button.get(0).click();
driver.navigate().back();
WebDriverWait wait = new WebDriverWait(driver, 30);
WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathofElement)));
**/


/**	List <WebElement> l1 = driver.findElements(By.xpath("//div[contains(@class,'item-content')]/a[@class='item-title h4']"));
for(WebElement e : l1){
  e.click();
  driver.navigate().back();
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
  
  List<WebElement> optionCount = driver.findElements(By.xpath("//div[contains(@class,'item-content')]/a[@class='item-title h4']"));
  System.out.println(optionCount.size());
  optionCount.get(0).click();
  driver.navigate().back();
 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
  //time.sleep(5);
  optionCount.get(1).click();
  **/






/**  } catch (IOException e) {
      e.printStackTrace();
  } 

}**/



/**public static void main(String[] args) {
// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "/Users/vidhathri/Downloads/geckodriver");
WebDriver driver = new FirefoxDriver();
driver.get("https://ss-web-aikman.ap.ngrok.io");
driver.findElement(By.xpath("//div[@class='container']//a[@href='/en/users/login']")).click();
driver.findElement(By.id("account")).sendKeys("j1@yopmail.com");
driver.findElement(By.id("password")).sendKeys("12345");
driver.findElement(By.xpath(".//*[@id='login-form']//button")).click();
}
**/
