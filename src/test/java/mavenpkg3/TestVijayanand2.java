package mavenpkg3;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import mavenpkg2.VijayAnand2;


public class TestVijayanand2
{
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.vrlbus.in/#/");
	}
	@Test
	public void test1()
	{
		
				
		
    	VijayAnand2 ob1=new VijayAnand2(driver);
		ob1.site();
		ob1.setvalues("Archa","archa@gmail.com","9876543210");
	}
			

}


