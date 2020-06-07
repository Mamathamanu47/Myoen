package TestCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import UtilityFiles.Config;
import UtilityFiles.ExtendReports;





public class BaseClass {
     
	
	static Config cf=new Config();
	public static WebDriver driver;
	public static String URL=cf.applicationUrl();
	public static String username=cf.getUsername();
	public static String password=cf.getPassword();
	public  ExtentReports extent=ExtendReports.gerintance();
	public static ExtentTest test;

	@Parameters("browser")
	@BeforeClass
	public void lunchBrowser(String br)
	
	{
		if(br.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", cf.chromePath());
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		else if(br.equals("firefox"))
		{
			System.out.print("lunch firebox broeswrr");
		
		}
		else if(br.equals("ie"))
		{
			System.out.print("ie");
		}
		
	  
		
	} 
    
@AfterClass
	public void closeBrowser()
	{
		driver.close();	}
	
  public void takescreenshot(String testCaseName,WebDriver driver) throws IOException	  {	
	      TakesScreenshot capture=(TakesScreenshot) driver;
		 File src= capture.getScreenshotAs(OutputType.FILE);
		 File des=new File(System.getProperty("user.dir")+"\\Screenshots\\"+testCaseName+".png");
		 FileUtils.copyFile(src, des);
		 
	  }
}
