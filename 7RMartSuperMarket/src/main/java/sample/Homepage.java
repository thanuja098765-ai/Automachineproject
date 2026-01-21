package sample;

import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
public class Homepage {
	public WebDriver driver;
	public Homepage(WebDriver driver) {
		this.driver=driver;
		 PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@data-toggle='dropdown']")
	WebElement Admin;
	@FindBy(xpath = "(//a[@class='dropdown-item'])[2]")  
	WebElement Logout;
	//@FindBy(xpath="(//a[text()='More info '])[1]")
	//WebElement moreinfo;
	@FindBy(xpath="(//a[@class='small-box-footer'])[7]")
	WebElement moreinfo;
	public Homepage clickonAdmin() {
		Admin.click();
		return this;
	}
	public Homepage clickonLogout() {
		Logout.click();
		return this;
	}	
	public AdminuserPage clickonMoreinfoAdmin()
	{
		moreinfo.click();
		return new AdminuserPage(driver);
	}
	public ManageNews clickonMoreinfo() {
		moreinfo.click();
		return new ManageNews(driver);
		
	}

}
