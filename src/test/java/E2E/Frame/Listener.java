package E2E.Frame;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import resources.BaseClass;
import resources.Utility;

public class Listener extends BaseClass implements ITestListener {

	ExtentTest test;
	ExtentReports ext = Utility.getExtent();
	
	@Override
	public void onTestStart(ITestResult result) {
		test = ext.createTest(result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test pass");
	}
		
	

	@Override
	public void onTestFailure(ITestResult result) {
		
		test.fail(result.getThrowable());
		test.addScreenCaptureFromPath(System.getProperty("user.dir")+"\\reports\\"+result.getName()+".png", "Screenshot");
		
		/*WebDriver driver= null;
		String tcname=result.getName();
		System.out.println(tcname);
		
		
		try {
			driver=(WebDriver)	result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
			System.out.println("in try");
		} catch (Exception e) 
		{System.out.println("in catch");
		}
		
		
		try {
			getScreenshot(tcname, driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		ext.flush();
	}

}
