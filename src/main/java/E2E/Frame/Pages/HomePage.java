package E2E.Frame.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="name")
	public WebElement Name;
	
		
	@FindBy(linkText="Shop")
	public WebElement shop;
	
	By email = By.xpath("//input[@name='email']");
	
	
	public WebElement getemail() {
		return driver.findElement(email);

	}
	
	
	
}
