package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	public WebDriver driver;
	public Loginpage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@name='username']")
	WebElement username;
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	@FindBy(xpath="//button[@type='submit']")
    WebElement Sigin;
	@FindBy(xpath=("//a[@class='small-box-footer'])[2]"))
    WebElement dashboard;
	public Loginpage enterUsernameandPassword(String usernamefield, String passwordfield) {
	     username.sendKeys(usernamefield);
	     password.sendKeys(passwordfield);
	     return this;
	}
	public Homepage clickonSigin() {
		Sigin.click();
		return new Homepage(driver);

	}
	public boolean isDashboardisdisplayed() {
		return dashboard.isDisplayed();
	}
}
