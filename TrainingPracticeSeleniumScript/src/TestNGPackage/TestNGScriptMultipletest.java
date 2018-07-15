package TestNGPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGScriptMultipletest {
 public WebDriver driver;
	
	@BeforeTest
	public void openapplication() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		    driver = new ChromeDriver();
			String url = "http://newtours.demoaut.com/";
		  	driver.manage().window().maximize();
		  	driver.get(url);
		  	Thread.sleep(2000);
		
	}
		
  @Test(priority=0)
  public void VerifyRegisterlink() throws InterruptedException {
	//  System.setProperty("webdriver.gecko.driver", "C:\\firefoxdriver\\geckodriver.exe");
	//	WebDriver driver = new FirefoxDriver();
	  
	 
	  	driver.findElement(By.linkText("REGISTER")).click();
	  	Thread.sleep(2000);
	  
	  
	  
  }
  
  @Test(priority=1)
  public void UserregistraionTest() throws InterruptedException
  {
	  driver.findElement(By.name("firstName")).sendKeys("Testfirstname");
	  	driver.findElement(By.name("lastName")).sendKeys("Testlastname");
	  	driver.findElement(By.name("phone")).sendKeys("8888888889");
	  	driver.findElement(By.name("userName")).sendKeys("testusername");
	  	driver.findElement(By.name("address1")).sendKeys("testaddress");
	  	driver.findElement(By.name("address2")).sendKeys("testaddress2");
	  	driver.findElement(By.name("city")).sendKeys("Herndon");
	  	driver.findElement(By.name("state")).sendKeys("Va");
	  	driver.findElement(By.name("postalCode")).sendKeys("23456");
	  	Select drpcountry = new Select(driver.findElement(By.name("country")));
	    drpcountry.selectByVisibleText("UNITED STATES");
	    driver.findElement(By.name("email")).sendKeys("Test@test.com");
	    driver.findElement(By.name("password")).sendKeys("Test1234$");
	    driver.findElement(By.name("confirmPassword")).sendKeys("Test1234$");
	    driver.findElement(By.name("register")).click();
	    Thread.sleep(2000);
	    WebElement cap = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b"));
        System.out.println("Note: Your user name is TestID. :"+cap.getText());

	    
	    driver.findElement(By.linkText("SIGN-OFF")).click();
	    Thread.sleep(2000); 
	    
	    
  }
  
  @AfterTest
  public void closeapplication()
  {
	  driver.close();
	   driver.quit();  
  }
  
}
  