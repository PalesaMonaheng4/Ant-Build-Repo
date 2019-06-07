package TestNGFiles2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Annotations
{
	//method under @BeforeTest annotation is executed first before any test case
	//@Test annotaion indicates a testcase 
	@BeforeTest
	public void cookies()
	{
		System.out.println("Delete cookies before starting the tests");
	}
	
	//method under @BeforeMethod annotation is executed before each and every test case
	@BeforeMethod
	public void UserIdGeneration()
	{
		System.out.println("UserId generation is executed before every test case");
	}
	
	@AfterTest
	public void CookiesClose()
	{
		System.out.println("Delete cookies after the tests has completed");
	}
	
	@Test
	public void OpeningBrowser()
	{
		System.out.println("Execute test 2");
	}
	
	
	/*
	 * @Test
	 * 
	 * @Parameters({"adminUserid"}) public void FlightBooking(String Userid) {
	 * System.out.println(Userid); System.out.println("Execute test 1"); }
	 */
	
	@AfterMethod
	public void ReportEnding()
	{
		System.out.println("Block is executed after every test case");
	}
}
