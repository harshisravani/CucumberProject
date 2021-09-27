package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSteps {
	WebDriver driver=null;
	@Given("browser is open")
	public void browser_is_open() {
		
//	String projectPath=System.getProperty("user.dir");
//		System.out.println("System path is:"+projectPath);
//	System.setProperty("webDriver.chrome.driver",
//				"projectPath+/src/test/resources/Drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Harshi/Downloads/chromedriver_win32 (1)/chromedriver.exe");

		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().window().maximize();   
	
	    	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		driver.navigate().to("https://www.naukri.com/nlogin/login");
		}

	@When("user enter a text in asearch box")
	public void user_enter_a_text_in_asearch_box() throws InterruptedException {
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sravani42v@gmail.com");
	Thread.sleep(2000);   
	}

	@And("hits enters")
	public void hits_enters() throws InterruptedException {
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("durga@123");
		Thread.sleep(2000); 
	    }

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	    	}




}
