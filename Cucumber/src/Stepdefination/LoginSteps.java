package Stepdefination;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginSteps {
	WebDriver driver;
	

	@Given("^user is on the login page$")
	public void user_on_loginpage() {
		System.out.println("User is on login page");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 
	}
	
	@When("^user enters correct username and correct password$")
	public void user_enters_valid_data() {
		System.out.println("user enters username and password");
		driver.findElement(By.name("email")).sendKeys("tarunbrar100@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("mynameistarun");
		driver.findElement(By.id("u_0_b")).click();
		
	}
	@When("^user enters email (.*)$")
	public void user_enters_username(String username) {
		driver.findElement(By.name("email")).sendKeys(username);
		
	}
	@And("^user enters password (.*)$")
	public void user_enters_password(String password) {
		driver.findElement(By.name("pass")).sendKeys(password);
		
	}
	@And("^user clicks login button$")
	public void user_ckicks_login_button() {
		System.out.println("user clicks login button");
		driver.findElement(By.id("u_0_b")).click();
	}
	
	@Then("^user gets confirmation$")
	public void user_gets_confirmation() {
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"u_0_c\"]/a")).getText().contains("success"));
	}
//	@After
//	public void finish_task() {
//		driver.quit();
//	}
	
	
	
	
}