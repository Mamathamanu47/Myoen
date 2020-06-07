package UtilityFiles;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import TestCases.BaseClass;

public class Listeners extends BaseClass implements ITestListener
{
	  public void onFinish(ITestContext arg0) {				
      				
        		
    }		

   
    public void onStart(ITestContext result)
    {					
  	
        		
    }		
			

 	
    public void onTestFailure(ITestResult result) {	
    	
    	String testcase=result.getMethod().getMethodName();
    	WebDriver driver=null;
		
			try {
				driver = (WebDriver)result.getTestClass().getRealClass().getDeclaredField("fieldName").get(result.getInstance());
			} 
			catch(Exception e)
			{
		
		    }
    	try {
			takescreenshot(testcase,driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
		}	  
    		

  		
    public void onTestSkipped(ITestResult arg0) {					
       				
        		
    }		

   	
    public void onTestStart(ITestResult arg0) {					
     			
        		
    }		

   	
    public void onTestSuccess(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

}
