package mavenpkg2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VijayAnand2 {
	WebDriver driver;
	//By close =By.xpath("//*[@id=\"demopopup\"]/div[2]/div[1]/img");
	By contact=By.xpath("//*[@id=\"VRL_Header\"]/div/div/div/div/div[2]/div[2]/nav/ul/li[4]/a");
	By name=By.xpath("//*[@id=\"txtcontactPerson\"]");
	By emailid=By.xpath("//*[@id=\"txtEmail\"]");
	By number=By.xpath("//*[@id=\"txtMobileNo\"]");
	
	
	public VijayAnand2(WebDriver driver)
	{
		this.driver=driver;
	}
	public void site()
	{
		driver.findElement(contact).click();
		
	}
	public void setvalues(String nam,String email,String num)
	{
		//driver.findElement(close).sendKeys(clos);
		driver.findElement(name).sendKeys(nam);
		driver.findElement(emailid).sendKeys(email);
		driver.findElement(number).sendKeys(num);
		
		
		
	}
	

}
