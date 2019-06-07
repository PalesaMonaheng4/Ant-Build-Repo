package TestNGFiles2;

import org.testng.annotations.Test;

public class DependancyAttributes 
{
	@Test
	public void OpeningBrowser()
	{
		System.out.println("Executing Opening browser method");
	}
	
	@Test(dependsOnMethods = {"OpeningBrowser"}) 
	public void FlightBooking()
	{
		System.out.println("Executing Flight booking method");
	}
	
	@Test(enabled=false)
	public void Payment()
	{
		System.out.println("Executin payment method");
	}
	
	@Test(timeOut=5000)
	public void TimeRelated()
	{
		System.out.println("Executing time related method");
	}
}
