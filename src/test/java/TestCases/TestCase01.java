package TestCases;




import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.LoginPageObjects;

public class TestCase01 extends BaseClass {
	 
	
	
	
	@Test(dataProvider="getdata")
	public void loginTest(String username, String password)
	
	{
		extent.createTest("loginTest");
	    Logger log=LogManager.getLogger(BaseClass.class.getName());
		driver.get(URL);
		log.info("User is enter and login  page is opened"); 
		LoginPageObjects lp=new LoginPageObjects(driver);
		lp.enterUserName(username);
	    log.info("Username is entered");
		lp.enterPassword(password);
		log.info("password is ntered");
		lp.login();
		log.info("Login successfully");
		extent.flush();
	}
	
	
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] Ob=new Object[2][2];
		Ob[0][0]="mngr266553";
		Ob[0][1]="jabUhaq";
		Ob[1][0]="manger123";
		Ob[1][1]="manama";
		
		return Ob;
		
	}
}


