package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.amezonPOM1;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Amazon1 {
	 amezonPOM1 ap;
     WebDriver driver;
	@Given("User Launch chrome browser")
	public void user_launch_chrome_browser() {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");   
	 driver=new ChromeDriver();
	 ap=new amezonPOM1(driver);
	 driver.manage().window().maximize();
	 
	}

	@When("some other precondition")
	public void some_other_precondition() {
	
	}

	@When("User opens URL\"https:\\/\\/admin-demo.nopcommerce.com\\/login\"")
	public void user_opens_url_https_admin_demo_nopcommerce_com_login() {
		driver.get("https://admin-demo.nopcommerce.com/");
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String string, String string2) {
	  
	  
	}

	@When("User Click on Login")
	public void user_click_on_login() {
	    ap.Login.click();
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String string) {
	   ap.driver.getTitle();
	}

	@When("User click on Log out link")
	public void user_click_on_log_out_link() {
	   ap.Logout.click();
	}

	@When("close browser")
	public void close_browser() {
	   
	}

	

}
