package dataDriven;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
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
	
	@Test(dataProvider="getData")
	public void UserId(String Username,String password,String id)
	{
		System.out.println("UserId generation is executed before every test case");
		System.out.println(Username);
		System.out.println(password);
		System.out.println(id);
	}
	
	@AfterTest
	public void CookiesClose()
	{
		System.out.println("Delete cookies after the tests has completed");
	}
	
	//@Test
	public void OpeningBrowser()
	{
		System.out.println("Execute test 2");
	}
	
	//@Test
	public void FlightBooking()
	{
		System.out.println("Execute test 1 with Priority1 group name");
	}
	
	//@Test
	public void FlightCancelling()
	{
		System.out.println("Execute test 3 with Priority2 group name");
	}
	@AfterMethod
	public void ReportEnding()
	{
		System.out.println("Block is executed after every test case");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		//Object[][] data=new Object[i][j];
		//i stands for number of times testcase should run/parameterize
		//j stands for number of parameters it should send for one go
		Object[][] data=new Object[3][3];
		data[0][0]="1abcd";
		data[0][1]="1xyz";
		data[0][2]="1";
		
		data[1][0]="2abcd";
		data[1][1]="2xyz";
		data[1][2]="2";
		
		data[2][0]="3abcd";
		data[2][1]="3xyz";
		data[2][2]="3";
		return data;
	}
}
