package StepDefinition;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import POM.AmazonPOM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonStep {
	public WebDriver driver;
	public AmazonPOM az;
	@Given("Launch the browser")
	public void launch_the_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\HP\\\\Downloads\\\\chromedriver_win32 (4)\\\\chromedriver.exe");
		driver=new ChromeDriver();
		az=new AmazonPOM(driver);
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
		
	}

	@When("User enter url and is on home page")
	public void user_enter_url_and_is_on_home_page() {
		driver.get("https://www.amazon.in/");
		
		
	}

	@When("User Enter the text t-shirt for woman")
	public void user_enter_the_text_t_shirt_for_woman() {
		
		
	//WebElement Searchbox=driver.findElement(By.xpath("//input[@name='field-keywords']"));
	//Searchbox.click();
		az.searchbox.click();
		
	}

	@When("User Enter the text box")
	public void user_enter_the_text_box() {
		//WebElement Searchbox=driver.findElement(By.xpath("//input[@name='field-keywords']"));
		az.searchbox.sendKeys("T-shirt for women");
		//WebElement Search=driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']"));
		az.search.click();
		
	}

	@Then("User see the list of shirts")
	public void user_see_the_list_of_shirts() {
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,350)");
		
	}

	@Then("User click on particular T-shirt")
	public void user_click_on_particular_t_shirt() throws InterruptedException {
		//WebElement Tshirt=driver.findElement(By.xpath("(//img[@class='s-image'])[3]"));
		//Tshirt.click();
		//Thread.sleep(5000);
		az.Tshirt.click();
		
	}

	@Then("Click on add to cart button")
	public void click_on_add_to_cart_button() {
		az=new AmazonPOM(driver);
		//WebElement AddToCart= driver.findElement(By.xpath("//input[@name='submit.add-to-cart']"));
		String handle=driver.getWindowHandle();
		//Set<String> handles=driver.getWindowHandles();
		
		driver.switchTo().window(handle);
		
		String currentwindow=driver.getWindowHandle();
		Set<String> handles=driver.getWindowHandles();
		
		for(String actual:handles)
		{
			if(!actual.equalsIgnoreCase(currentwindow))
			{
				driver.switchTo().window(actual);
				JavascriptExecutor js1=(JavascriptExecutor)driver;
				js1.executeScript("window.scrollBy(0,350);","");
			
				az.CliclAddToCart();
				
				
				
			}
			System.out.println("*********"+driver.getTitle()+"***********");
			
		}
		
		
	}
	


}
