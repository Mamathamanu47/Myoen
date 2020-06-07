package TestCases;




import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import PageObjects.LoginPageObjects;

public class TestCase01 extends BaseClass {
	 
	
	
	@Test
	public void loginTest()
	{
	     Logger log=LogManager.getLogger(BaseClass.class.getName());
		driver.get(URL);
		log.info("User is enter and login  page is opened"); 
		LoginPageObjects lp=new LoginPageObjects(driver);
		lp.enterUserName(username);
	    log.info("Username is entered");
		lp.enterUserName("manumanatha");
		log.info("password is ntered");
		lp.login();
		log.info("Login successfully");
	}
}

