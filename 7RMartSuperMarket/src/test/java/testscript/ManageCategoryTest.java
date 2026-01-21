package testscript;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.LoginPage;
import sample.ManageCategory;

public class ManageCategoryTest extends Base {
  @Test
  public void enterUsernameAndPassword() {
	  WebDriver driver;
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.enterUsernameandPassword("admin", "admin");
	  loginpage.clickOnSigin();
	  ManageCategory category=new ManageCategory(driver);
	  category.clickOnmoreinfo();
	  category.clickOnNewButton();
	  category.enterCategory("vegetables");
	  category.clickOnDiscount();
	  category.uploadChooseFile("C:\\Users\\Shajin\\Downloads\\TEST PLAN REPORT");
	  category.clickOnShowTopmenu();
	  category.clickOnSavebutton();
}
}