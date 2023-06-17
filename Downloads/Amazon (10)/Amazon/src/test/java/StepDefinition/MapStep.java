package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.Mappom;
import POM.infopom;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MapStep {
	
   WebDriver driver;
   public Mappom ip;
	@Given("Launch the Browser")
	public void launch_the_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);  
		ip=new Mappom(driver);
	}

	@Given("Enter the URL")
	public void enter_the_url() {
		
    driver.get("https://maps.google.com/");
	}

	@When("Enter the SearchBox")
	public void enter_the_search_box() {
		ip.searchbox.sendKeys("pune");
		 ip.button.click();
	}

	@When("Click to direction button")
	public void click_to_direction_button() {
	   ip.button.click();
	 
	}

	@When("Enter search box Daund")
	public void enter_search_box_daund() {
	
		  ip.Direction.click();
	}

	@Then("going to pune")
	public void going_to_pune() {
		 ip.yourLocation.sendKeys("Daund");
        
	}

	@Then("Click on TextBox")
	public void click_on_text_box() {
		ip.TextBox.click();
		
	
	}
	}


