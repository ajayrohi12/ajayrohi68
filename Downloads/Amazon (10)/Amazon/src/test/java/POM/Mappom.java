package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mappom {

	
	
		public WebDriver driver;
			
			public Mappom(WebDriver driver)
			{
				this.driver=driver;
				PageFactory.initElements(driver,this);
			}
			
		
			
			@FindBy(xpath="//input[@jslog='11886']")
			public WebElement searchbox;
			
			@FindBy(xpath="//button[@id='searchbox-searchbutton']")
			public WebElement button;
			
			@FindBy(xpath="//img[@alt='Directions']")
			public WebElement Direction;
			
			@FindBy(xpath="(//input[@class='tactile-searchbox-input'])[1]")
			public WebElement yourLocation;
			
			@FindBy(xpath="(//button[@data-tooltip='Search'])[1]")
			public WebElement TextBox;


}

