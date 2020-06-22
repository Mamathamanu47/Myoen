package TestCases;

import java.util.Random;

import org.testng.annotations.Test;

import PageObjects.LoginPageObjects;
import PageObjects.NewCousterPage;
import org.apache.commons.lang3.RandomStringUtils;

public class TestCase02 extends BaseClass{
	
	
	
	@Test
	public void newCustomer()
	
	{
		extent.createTest("newCustomer");
		driver.get("URL");
		LoginPageObjects lp=new LoginPageObjects(driver);
		lp.enterUserName(username);
		lp.enterPassword(password);
		lp.login();
		NewCousterPage np=new NewCousterPage(driver);
		np.getCustmername("Mamatha B N");
		np.getCusgender();
		np.getDate("12", "01", "2020");
		np.getAddress("Mamatha D/O Nagaraj b Barahihalli");
		np.getCity("Bangalore");
		np.getState("Karnataka");
		np.getPin("560066");
		np.getMobile("1234567890");
		
		String email=getRanEmail()+".gmail.com";
		np.getemailid(email);
	    np.getPassword("Manumamatha");
	    np.getSubmit();
	    if(driver.getPageSource().contentEquals("Customer Registered Successfully!!!"))
	    {
	    	System.out.println("Customer Registered successfully ");
	    	
	    }
	    else
	    {
	    	System.out.print("Customer registration failed");
	    }
	    extent.flush();
	    
		
	}

   


public String getRanEmail()
{ 
	String str=RandomStringUtils.randomAlphabetic(7);
	return str;
	
}
}
