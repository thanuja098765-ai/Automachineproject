package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

  import sample.Homepage;
  import sample.Loginpage;

  public class Homepagetest extends Base {
	  public Homepage home;
    @Test
    public void clickonAdminAndLogoutbutton() {
  	  Loginpage loginpage=new Loginpage(driver);
  	  loginpage.enterUsernameandPassword("admin", "admin");
  	  home=loginpage.clickonSigin();
  	  home.clickonAdmin().clickonLogout();
  	  //loginpage.clickonSigin();
  	  
  	  //Homepage homepage=new Homepage(driver);
  	   //homepage.clickonAdmin();
  	   //homepage.clickonLogout();
  	  String expected="Login | 7rmart supermarket";
  	   String actual=driver.getTitle();
  	   Assert.assertEquals(expected,actual,"logout failed");
}
}