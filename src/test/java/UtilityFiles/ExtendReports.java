package UtilityFiles;

import com.aventstack.extentreports.ExtentReports;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtendReports {
	
static ExtentReports extent;

static ExtentSparkReporter reporter;

public static ExtentReports gerintance()
{
	reporter=new ExtentSparkReporter("./Reports/testreports.html");
	reporter.config().setEncoding("uft-8");
	reporter.config().setReportName("Automation Reports");
	reporter.config().setDocumentTitle("My Project Reports");
	reporter.config().setTheme(Theme.STANDARD);
	
	extent=new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("Tester", "Mamatha B N");
	return extent;
	}
}
	
		
	
	


