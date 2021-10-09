package E2E.Frame;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import E2E.Frame.Pages.BrandPage;
import resources.BaseClass;




public class Testtwo extends BaseClass {
	
	public static Logger log=LogManager.getLogger(BaseClass.class.getName());
	
	/*@BeforeTest
	public void start() throws IOException {
		driver= setup();
		driver.get("https://rahulshettyacademy.com/angularpractice/shop");
	}*/

	BrandPage bp;
	
	@BeforeMethod(alwaysRun=true)
	public void getobj() {
		 bp = new BrandPage(driver);
	}
	
	@Test
	public void clickbrandname() throws InterruptedException {
		//Thread.sleep(5000);
		
		
		//driver.navigate().refresh();
		Thread.sleep(5000);
		bp.clickBrand();
		String tit = bp.Title();
		//Assert.assertEquals(tit, "ha");
		//Assert.assertEquals(driver.getTitle().te, false);
		log.info("hahagh");
		//bp.clickcategory().click();
		
	}
	
	@Test(groups={"smoke"})
	public void clickCategory() throws InterruptedException {
		bp.clickcategory();
		Thread.sleep(10000);
	}
	
	//1st july
	
	/*@AfterTest
	public void teardown() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}*/
	@AfterMethod(alwaysRun=true)
	public void getSS(ITestResult result) throws IOException {
		if (ITestResult.FAILURE==result.getStatus()) {
			getScreenshot(result.getName());
		}
	}
	
	
	
	
	
	
}
