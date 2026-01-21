package testscript;

import org.testng.annotations.Test;

import sample.Homepage;
import sample.Loginpage;
import sample.ManageNews;

public class ManagenewTest extends Base{
	public Homepage home;
	public ManageNews news;
	@Test
	public void enterUsernameAndPasswword() {
		  Loginpage loginpage=new Loginpage(driver);
		  loginpage.enterUsernameandPassword("admin", "admin");
		  home=loginpage.clickonSigin();
		  news=home.clickonMoreinfo();
		  news.clickonNew().enterNews("hiiii").clickonSavebutton();
		  
		 /* ManageNew managenew=new ManageNew(driver);
		  managenew.clickonMoreinfoandNew();
		  managenew.enterNews("hellow all");
		  managenew.clickonSavebutton();*/
}
}