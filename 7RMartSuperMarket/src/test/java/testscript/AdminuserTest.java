package testscript;

import org.testng.annotations.Test;

import sample.AdminuserPage;
import sample.Homepage;
import sample.Loginpage;


public class AdminuserTest extends Base{
	public Homepage home;
	public AdminuserPage admin;
  @Test
  public void enterUsernameAndPassword() {
	  Loginpage loginpage=new Loginpage(driver);
	  loginpage.enterUsernameandPassword("admin","admin");
	  home=loginpage.clickonSigin();
	  admin= home.clickonMoreinfoAdmin();
	  admin.clickonNewbutton().enterUsernameandPassword("hy", "hy").enterUsertype().saveonSigin();
	  //AdminuserPage adminuser=new AdminuserPage(driver);
	  //adminuser.clickonmoreinfo();
	  //adminuser.clickonNewbutton();
	 // adminuser.enterUsernameandPassword("thanu","0987");
	  //adminuser.enterUsertype();
	  //adminuser.clickonSigin();
	  
	  
  }  
	  
  }

