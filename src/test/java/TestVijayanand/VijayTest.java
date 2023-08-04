package TestVijayanand;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import pkgmaven.VijayAnand;

public class VijayTest {

	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.vrlbus.in/#/");
	}
	@Test
	public void test1()
	{
		VijayAnand ob=new VijayAnand (driver);
		 ob.setvalues("kerala","Banglore","30-07-2023");
		ob.search();
		
		
}
	
		
	
		
	
	}


