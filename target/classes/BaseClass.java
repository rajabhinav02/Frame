package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	static public WebDriver driver;
	public Properties prop;
	
	@SuppressWarnings("deprecation")
	public WebDriver setup() throws IOException {
	prop = new Properties();
	FileInputStream fi = new FileInputStream("C:\\Users\\Punam\\eclipse-workspace\\Frame\\src\\main\\java\\resources\\Properties.properties");
	prop.load(fi);
	
	if (prop.getProperty("browser").equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver92\\chromedriver_win32 (5)\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	else if (prop.get("browser").equals("firefox")) {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver92\\chromedriver_win32 (5)\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	return driver;
	}
	
	public void getScreenshot(String failedtestname) throws IOException {
		
		TakesScreenshot ts= (TakesScreenshot)driver;
		File sorc=ts.getScreenshotAs(OutputType.FILE);
		String dst = System.getProperty("user.dir")+"\\reports\\"+failedtestname+".png";
		FileUtils.copyFile(sorc, new File (dst));
		
	}
}	
