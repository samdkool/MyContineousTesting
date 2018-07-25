package testCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class DemoTestScript {
	WebDriver driver;
	
  @Test
  public void Test_001() {
	  driver.get("https://www.google.com");
	  System.out.println(driver.getTitle());
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver",".//Drivers/macDrivers/chromedriver");
	  driver = new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
