package E2E.Frame;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import E2E.Frame.Pages.HomePage;
import resources.BaseClass;

public class Testone extends BaseClass {
	public WebDriver driver;//for parallel execution
	
	@BeforeSuite(alwaysRun=true)
	public void load() throws IOException {
		driver= setup();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
	}

	@Test(dataProvider= "getData")
	public void Testrun(String na, String em) throws IOException, InterruptedException {
		
		
		
		
		HomePage hm = new HomePage(driver);
		hm.Name.sendKeys(na);
		hm.getemail().sendKeys(em);
		//Thread.sleep(5000);
		hm.shop.click();
		Thread.sleep(5000);
		
		
				
	}
	
	@AfterSuite(alwaysRun=true)
	public void teardown() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[1][2];
		data[0][0] = "op";
		data[0][1] = "df";
		
		return data;
	}
	
}
