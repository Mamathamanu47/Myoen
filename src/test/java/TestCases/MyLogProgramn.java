package TestCases;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


public class MyLogProgramn {

	public static void main(String[] args) {
		
	
		Logger logger=LogManager.getLogger(MyLogProgramn.class.getName());
		
		logger.info("Logger message information shpould be displayed");
		logger.error("logerr error message should be displayed");
		logger.debug("debug message should be displayed");
		logger.warn("waring message should be displayed");
		

	}

}
