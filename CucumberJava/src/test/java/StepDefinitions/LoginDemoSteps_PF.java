package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.HomePage_PF;
import pageFactory.loginPage_PF;

public class LoginDemoSteps_PF {
	WebDriver driver = null;
	
	loginPage_PF login = new loginPage_PF(driver);
	HomePage_PF homePage = new HomePage_PF(driver);
	
	
	
	@Given("browser is open")
	public void browser_is_open() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		//maximizar la ventana
		driver.manage().window().maximize();
				
	}

	@And("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
		driver.navigate().to("https://example.testproject.io/web/");
		Thread.sleep(5000);
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) throws InterruptedException {
		
		login.enterUsername(username);
		login.enterPassword(password);
//		driver.findElement(By.id("name")).sendKeys(username);
//		driver.findElement(By.id("password")).sendKeys(password);
	}
	
	@And("user clicks on login")
	public void user_clicks_on_login() throws InterruptedException {
		login.clickLoginBtn();
	    //driver.findElement(By.id("login")).click();
		Thread.sleep(2000);
	}

	@Then("user is navigated to the homepage")
	public void user_is_navigated_to_the_homepage() {
		homePage.checkLogoutIsDisplayed();
		//driver.findElement(By.id("logout")).isDisplayed();
		driver.close();
		driver.quit();
	}

}
