package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.loginPage;

public class LoginDemoSteps_POM {
//	WebDriver driver = null;
//	loginPage login = new loginPage(driver);
//	
//	@Given("browser is open")
//	public void browser_is_open() {
//		String projectPath = System.getProperty("user.dir");
//		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
//		driver = new ChromeDriver();
//		
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		//maximizar la ventana
//		driver.manage().window().maximize();
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//		
//		driver.navigate().to("https://example.testproject.io/web/");
//	}
//	
//	@When("^user enters (.*) and (.*)$")
//	public void user_enters_username_and_password(String username, String password) throws InterruptedException {
//		//loginPage login = new loginPage(driver);
//		login.enterUsername(username);
//		login.enterPassword(password);
//				
//		Thread.sleep(2000);
//	}
//	
//	@And("user clicks on login")
//	public void user_clicks_on_login() {
//		login.clickLogin();
//	    //driver.findElement(By.id("login")).click();
//	}
//
//	@Then("user is navigated to the homepage")
//	public void user_is_navigated_to_the_homepage() {
//		login.checkLogOutIsDisplayed();
//		//driver.findElement(By.id("logout")).isDisplayed();
//		driver.close();
//		driver.quit();
//	}

}
