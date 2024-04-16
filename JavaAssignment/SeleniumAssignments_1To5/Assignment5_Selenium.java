package seleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment5_Selenium 
{
	public static void main(String[] args) 
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		WebElement CustName_textbox=driver.findElement(By.xpath("//input[@id='ap_customer_name']"));
		CustName_textbox.sendKeys("Ashwini Newase");
		WebElement Mobile_textbox=driver.findElement(By.xpath("//input[@name='email']"));
		Mobile_textbox.sendKeys("9730467176");
		WebElement password_textbox=driver.findElement(By.xpath("//input[@id='ap_password']"));
		password_textbox.sendKeys("ashwini123");
		WebElement VerifyMobile_button=driver.findElement(By.xpath("//input[@id='continue']"));
		VerifyMobile_button.click();
		driver.quit();
	}

}
