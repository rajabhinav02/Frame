package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Utility {

	static ExtentReports ext;
	
	public static ExtentReports getExtent() {
		
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Test First Report");
		
		ext = new ExtentReports();
		ext.attachReporter(reporter);
		
		return ext;
	}
	
}
