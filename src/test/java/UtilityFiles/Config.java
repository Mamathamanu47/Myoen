package UtilityFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Config {
	
	Properties pro;
	public Config() 
	{
		String path="./Configurations/Config.properties";
		
		try{
			FileInputStream fis=new FileInputStream(path);
		    pro=new Properties();
		pro.load(fis);
		}
		catch(Exception e) {
			
			System.out.println("Exception is" + e.getMessage());
		}
		
	}
	public String applicationUrl()
	{
		String url=pro.getProperty("URL");
		return url;
	
	}
	public String getUsername()
	{
		String username=pro.getProperty("username");
		return username;
		
	}
	public String getPassword()
	{
		String password=pro.getProperty("password");
		return password;
	}
  public String broserName() {
	  String browser=pro.getProperty("browser");
	  return browser;
  }
	public String chromePath()
	{
		String chropath=pro.getProperty("chromepath");
	return chropath;
	}
}
