package TestCases;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DownloadFile {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mamatha BN\\eclipse-workspace\\Internet_Banking\\Drivers1\\chromedriver.exe");
		File folder=new File(UUID.randomUUID().toString());
		ChromeOptions option =new ChromeOptions();
		
		Map<String, Object> pref=new HashMap<String, Object>();
		pref.put("profile.default.content.settings.popups", 0);
		pref.put("download.default_directory", folder.getAbsolutePath());
		
		 
		 
		 
		 
		 
		 
		 
		 WebDriver driver=new ChromeDriver();

	}
	
	

}
