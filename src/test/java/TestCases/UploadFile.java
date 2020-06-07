package TestCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) throws AWTException {
		
      Robot robot=new Robot();
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mamatha BN\\eclipse-workspace\\Internet_Banking\\Drivers1\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.naukri.com/mnjuser/profile?id=&altresid");
	 driver.findElement(By.id("attachCV")).click();
     robot.setAutoDelay(3000);
     StringSelection string=new StringSelection("C:\\Users\\Mamatha BN\\Desktop\\Mamatha B N_RESUME.docx");
     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(string, null);
     robot.keyPress(KeyEvent.VK_CONTROL);
     robot.keyPress(KeyEvent.VK_V);
     robot.setAutoDelay(2000);
     robot.keyRelease(KeyEvent.VK_CONTROL);
     robot.keyRelease(KeyEvent.VK_V);
     
     robot.setAutoDelay(3000);
     robot.keyPress(KeyEvent.VK_ENTER);
     robot.keyRelease(KeyEvent.VK_CONTROL);
     
	}

}
