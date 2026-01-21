package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageCategory {
	public WebDriver driver;
	public ManageCategory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@onclick='click_button(1)']")
	WebElement newbutton;
	@FindBy(xpath="//input[@type='text']")
	WebElement category;
	@FindBy(xpath="//li[@id='134-selectable']")
	WebElement discount;
	@FindBy(xpath="//input[@type='file']")
	WebElement choosefile;
	@FindBy(xpath="(//input[@value='yes'])[1]")
	WebElement showontopmenu;
	@FindBy(xpath="//button[@type='submit']")
	WebElement save;
	public void clickOnmoreinfo() {
		moreinfo.click();
	}
	public void clickOnNewButton() {
		newbutton.click();
	}
	public void enterCategory(String categoryfield) {
		category.sendKeys(categoryfield);
		
	}
	public void clickOnDiscount() {
		discount.click();
	}
	public void uploadChooseFile( String file) {
		choosefile.sendKeys(file);
	}
	public void clickOnShowTopmenu() {
		showontopmenu.click();
	}
	public void clickOnSavebutton() {
		save.click();
	}

}
