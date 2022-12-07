package MavenTest.Browser;


import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Browser {
	@Test
	public void ds() throws IOException
	{
		File f=new File("C:\\Users\\MyPC\\eclipse-workspace\\Browser\\config.properties");
		FileInputStream read=new FileInputStream(f);
		Properties prop=new Properties();
		prop.load(read);
		String browswername=System.getProperty("browser");
		if(browswername.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MyPC\\BalaJar\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    driver.close();
		}
		if(browswername.equals("firefox"))
		{
		 System.out.print("Firefox openend");
		}
	}
	}
	
