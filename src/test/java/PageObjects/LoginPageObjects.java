package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects {
	
	
	WebDriver driver;
	
     public LoginPageObjects(WebDriver driver)
     {
    	 PageFactory.initElements(driver, this);
    	 
     }
     
	@FindBy(name="uid")
	private WebElement username;
	@FindBy(name="password")
	private WebElement password;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement login;
	
	public void enterUserName(String un)
	{
		username.sendKeys(un);
		
	}
	public void enterPassword(String pw)
	{
		password.sendKeys(pw);
	}
    public void login()
    {
    	login.click();
    }

	}


