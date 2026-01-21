package testscript;

import org.testng.annotations.Test;

import utilities.ScreenshortUtility;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class Base {
	WebDriver driver;
  @Test

  @BeforeMethod
  public void beforeMethod() {
	  driver=new ChromeDriver();
	  driver.get("https://groceryapp.uniqassosiates.com/admin");
	  driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod(ITestResult itResult) throws IOException {
	  if (itResult.getStatus() == ITestResult.FAILURE) {
			ScreenshortUtility sc = new ScreenshortUtility();
			sc.captureFailureScreenShot(driver, itResult.getName());
		}
		if (driver != null) {
			driver.quit();
		}
	 // driver.quit();
  }


}
