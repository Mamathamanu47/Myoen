package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCousterPage {
	
	WebDriver driver;
	
	public NewCousterPage(WebDriver driver)
	{
	  PageFactory.initElements(driver, this);
	  
	}
	
   @FindBy(xpath="//a[text()='New Customer']")
   private WebElement newcustomer;
   @FindBy(xpath="//a[text()='New Customer']")
   private WebElement custname;
   @FindBy(xpath="//input[2]")
   private WebElement custGendr;
   @FindBy(xpath="//input[@type='date']")
   private WebElement date;
   @FindBy(xpath="//textarea[@name='addr']")
   private WebElement address;
   @FindBy(xpath="//input[@name='city']")
   private WebElement city;
   @FindBy(name="state")
   private WebElement state;
   @FindBy(xpath="//input[@name='pinno']")
   private WebElement pin;
   @FindBy(xpath="//input[@name='telephoneno']")
   private WebElement mobile;
   @FindBy(name="emailid")
   private WebElement emailid;
   @FindBy(css="input[type='password']")
   private WebElement password;
   @FindBy(xpath="//input[@type='submit']")
   private WebElement submit;
   
   public void getCustmername(String name)
   {
	   newcustomer.sendKeys(name);
   }
   public void getCusgender()
   {
	   custGendr.click();
   }
   public void getDate(String dd, String mm,String yyyy)
   {
	   date.sendKeys(dd);
	   date.sendKeys(mm);
	   date.sendKeys(yyyy);
   }
   public void getAddress(String add)
   {
	   address.sendKeys(add);
	   
   }
   public void getCity(String cityvalue)
   {
	   city.sendKeys(cityvalue);
   }
   public void getState(String statevalue)
   {
	   state.sendKeys(statevalue);
   }
   public void getPin(String pinvalue) 
	{
		pin.sendKeys(pinvalue);
	}
   public void getMobile(String getMobileno)
   {
	   mobile.sendKeys(getMobileno);
   }
   public void getemailid(String emailidvalue)
   {
	   emailid.sendKeys(emailidvalue);
	   
   }
   public void getPassword(String passwordvalue)
   {
	   password.sendKeys(passwordvalue);
   }
   public void getSubmit()
   {
	 submit.click();
   }
   }
   
   
   
   
   
   
   
   
