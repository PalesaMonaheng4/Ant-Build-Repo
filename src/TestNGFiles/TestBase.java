 package TestNGFiles;

import java.io.FileInputStream;
import java.util.Properties;

import javax.swing.JOptionPane;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class TestBase
{
	public WebDriver driver = null;
	@Test
	public void LogIn() throws Exception
	{
		
		Properties prop=new Properties();
		FileInputStream file= new FileInputStream("C:\\Users\\PMonaheng\\eclipse-workspace\\TestNGFramework\\src\\TestNGFiles\\datadriven.properties");
		prop.load(file);  

		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		
		if(prop.getProperty("browser").contains("FireFox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		else if(prop.getProperty("browser").contains("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\PMonaheng\\Desktop\\selenium tools\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(prop.getProperty("browser").contains("IE"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		else
		{
			JOptionPane.showMessageDialog(null, "This browser is not recognised");
		}
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void Software()
	{
		System.out.println("Execute the test case");
	}
	
	@AfterSuite
	public void deinstallSoftware()
	{
		System.out.println("execute last");
	}
}
