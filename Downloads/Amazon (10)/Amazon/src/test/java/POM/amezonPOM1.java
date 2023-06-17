package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amezonPOM1 {
   public WebDriver driver;
   public amezonPOM1(WebDriver driver) {
	   this.driver=driver;
	   PageFactory.initElements(driver,this);
   }
	
	@FindBy(id="Email")
	public WebElement Email;
	
	@FindBy(id="password")
	public WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement Login;
	
	@FindBy(xpath="//a[@href='/logout']")
	public WebElement Logout;
	
}
