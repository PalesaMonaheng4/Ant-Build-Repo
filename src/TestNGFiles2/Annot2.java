package TestNGFiles2;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annot2
{
	@BeforeSuite
	public void installSoftware()
	{
		System.out.println("First to execute");
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
