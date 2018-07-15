package TestNGPackage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGFirstscript {
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
	
	
	
  @Test
  public void VerifyRegisterlink() throws InterruptedException {
	//  System.setProperty("webdriver.gecko.driver", "C:\\firefoxdriver\\geckodriver.exe");
	//	WebDriver driver = new FirefoxDriver();
	  
	 
	  	driver.findElement(By.linkText("REGISTER")).click();
	  	Thread.sleep(2000);
	  
	  
	  
  }
  
  @AfterTest
  public void closeapplication()
  {
	  driver.close();
	   driver.quit();  
  }
  
}
  