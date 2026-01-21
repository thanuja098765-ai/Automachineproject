package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNews {
	public WebDriver driver;
	public ManageNews(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

		@FindBy(xpath="//a[@onclick='click_button(1)']")
		WebElement New;
		@FindBy(xpath="//textarea[@id='news']")
		WebElement news;
		@FindBy(xpath="//button[@type='submit']")
		WebElement save;
		public ManageNews clickonNew() {
			New.click();
			return this;
		}
	
		public ManageNews enterNews(String Newfield) {
			news.sendKeys(Newfield);
			return this;
		}
		public ManageNews clickonSavebutton() {
			save.click();
			return this;
		}

}
