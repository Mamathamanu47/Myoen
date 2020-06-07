package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadUsingSendKeys {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
    // we can handle file upload using AUTOIT, SendKeys and Robot Class
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mamatha BN\\eclipse-workspace\\Internet_Banking\\Drivers1\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.naukri.com/mnjuser/profile?id=&altresid");
		 driver.findElement(By.id("attachCV")).sendKeys("C:\\\\Users\\\\Mamatha BN\\\\Desktop\\\\Mamatha B N_RESUME.docx");
		 String value=driver.findElement(By.xpath("//b[@class='truncate exten']")).getAttribute("title");
		 if(value.equals("Mamatha B N_RESUME.docx"))
          {
	         System.out.print("file uploaded sccessfully");
         }
		 
	}
	

}
