package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage_PF {
	//Create elements
	
	@FindBy(id = "name")
	WebElement txt_username;
	
	@FindBy(id = "password")
	WebElement txt_password;
	
	@FindBy(id = "login")
	WebElement btn_login;
	
	WebDriver driver;
	
	public loginPage_PF(WebDriver driver) {
		this.driver = driver;
		//PageFactory.initElements(driver, loginPage_PF.class);
		PageFactory.initElements(driver, this);
	}
	
	//Methods for actions
	
	public void enterUsername(String userName) {
		txt_username.sendKeys(userName);
	}
	
	public void enterPassword(String password) {
		txt_password.sendKeys(password);
	}
	
	public void clickLoginBtn() {
		btn_login.click();
	}
}
