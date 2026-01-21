package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.PageUtility;

public class AdminuserPage {
	PageUtility page=new PageUtility();
	public WebDriver driver;
	public AdminuserPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[@onclick='click_button(1)']")
	WebElement New;
	@FindBy(xpath="//input[@name='username']")
    WebElement username;
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	@FindBy(xpath="//select[@name='user_type']")
	WebElement usertype;
	@FindBy(xpath="//button[@name='Create']")
    WebElement Save;	
	public AdminuserPage clickonNewbutton()
	{
		New.click();
		return this;
	}
	public AdminuserPage enterUsernameandPassword(String usernamefield, String passwordfield) {
	     username.sendKeys(usernamefield);
	     password.sendKeys(passwordfield);
	     return this;
	     
	}
	public AdminuserPage enterUsertype() {
		page.selectByIndex(usertype, 1);
		return this;
	}
	public AdminuserPage saveonSigin() {
		Save.click();
		return this;
}
	
}