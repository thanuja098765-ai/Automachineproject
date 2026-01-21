package testscript;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import sample.Homepage;
import sample.Loginpage;
import utilities.ExcelUtility;
public class Loginpagetest extends Base {
	Homepage home;
  @Test
  public void enterUsernameandPassword() throws IOException {
		 Loginpage loginpage=new Loginpage(driver);//Loginpage-classname of code
		  String username=ExcelUtility.getStringData(1, 0, "loginpage");
		  String password=ExcelUtility.getStringData(1, 1, "loginpage");
		 loginpage.enterUsernameandPassword(username,password);
		 home= loginpage.clickonSigin();
		  
	  }
	  @Test

	  public void entercorrectUsernameAndwrongPassword() {
		  Loginpage loginpage=new Loginpage(driver);//Loginpage-classname of code
		  loginpage.enterUsernameandPassword("admin","thanu");
		  loginpage.clickonSigin();
		  boolean dashboarddisplayed=loginpage.isDashboardisdisplayed();
		  Assert.assertTrue(dashboarddisplayed, "Fail to login");
	  }
	  @Test
	 public void enterwrongUsernameAndcorrectPassword() {
		 Loginpage loginpage=new Loginpage(driver);//Loginpage-classname of code
		  loginpage.enterUsernameandPassword("thanu", "admin");//wrong Username
		  loginpage.clickonSigin();  
	  }
	  @Test(dataProvider = "page")
	  public void enterwrongUsernameAndwrongPassword(String username,String password) {
		  Loginpage loginpage=new Loginpage(driver);//Loginpage-classname of code
		  loginpage.enterUsernameandPassword(username,password);
		  loginpage.clickonSigin(); 
	  }
	  @DataProvider(name="page")
	  public Object[][] data(){
		  Object testdata[][]= {{"admin","1q2w3e"},{"admin","1q2w"}};
		  return testdata;
		  
}
}
