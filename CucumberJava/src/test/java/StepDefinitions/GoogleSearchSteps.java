package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	
//	WebDriver driver = null;
//	
//	@SuppressWarnings("deprecation")
//	@Given("browser is open")
//	public void browser_is_open() {
//		// Write code here that turns the phrase above into concrete actions
//		//throw new io.cucumber.java.PendingException();
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
//	@And("user is on google search page")
//	public void user_is_on_google_search_page() throws InterruptedException {
//		// Write code here that turns the phrase above into concrete actions
//		//throw new io.cucumber.java.PendingException();
//		driver.navigate().to("https://google.com");
//		Thread.sleep(2000);
//	}
//
//	@When("user enters a text in search box")
//	public void user_enters_a_text_in_search_box() {
//		// Write code here that turns the phrase above into concrete actions
//		//throw new io.cucumber.java.PendingException();
//		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
//	}
//
//	@And("hits enter")
//	public void hits_enter() throws InterruptedException {
//		// Write code here that turns the phrase above into concrete actions
//		//throw new io.cucumber.java.PendingException();
//		driver.findElement(By.name("q")).submit();
//		Thread.sleep(2000);
//	}
//
//	@Then("user is navigated to search results")
//	public void user_is_navigated_to_search_results() {
//		// Write code here that turns the phrase above into concrete actions
//		driver.getPageSource().contains("Online Courses");
//		driver.close();
//		driver.quit();
//	}
}
