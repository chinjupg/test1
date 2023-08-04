package pkgmaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VijayAnand {
	WebDriver driver;
	
	By source=By.xpath("//*[@id=\"FromCity\"]");
	By destination=By.xpath("//*[@id=\"ToCity\"]");
	By departure=By.xpath("//*[@id=\"txtFromDate\"]");
	By search=By.xpath("//*[@id=\"demo\"]/section[2]/div/div/div[1]/div/div/div/div/div[3]/button");
	
	
	public VijayAnand(WebDriver driver)
	{
		this.driver=driver;
	}
	
  
	public void setvalues(String start ,String  stop ,String date )
	{
		driver.findElement(source).sendKeys(start);
		driver.findElement(destination).sendKeys(stop);
		driver.findElement(departure).sendKeys(date);
		
		
	}
	public void search()
	{
		driver.findElement(search).click();
	}
}
