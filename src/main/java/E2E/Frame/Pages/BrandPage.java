package E2E.Frame.Pages;

import java.util.List;

import org.apache.logging.log4j.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrandPage  {
	
	WebDriver driver;
	public static Logger log=LogManager.getLogger(BrandPage.class.getName());
	
	
	public BrandPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	
	//button[@class='btn btn-info']/parent::div/preceding-sibling::div//a
	By addButtons= By.xpath("//button[@class='btn btn-info']");
	By brandname = By.xpath("parent::div/preceding-sibling::div//a");
	//By categoryone = //By.linkText("Category 1");
	By categoryone = By.xpath("//a[text()='Category 1']");
	
	
	public void clickBrand() throws InterruptedException {
		log.info("in list");
		//System.out.println("in list");
		@SuppressWarnings("deprecation")
		WebDriverWait wb = new WebDriverWait(driver,30);
		wb.until(ExpectedConditions.presenceOfAllElementsLocatedBy(addButtons));
		List<WebElement> buttons= driver.findElements(addButtons);
		log.info(buttons.size());
		
		for (WebElement button:buttons) {
			if(button.findElement(brandname).getText().equalsIgnoreCase("Blackberry")) {
				button.click();
				//System.out.println("in if condition");
				break;
			}
		}
	}
	
	public WebElement clickcategory() {
		System.out.println("po");
		return driver.findElement(categoryone);
	}
	
	public String Title() {
		return driver.getTitle();
	}
}
