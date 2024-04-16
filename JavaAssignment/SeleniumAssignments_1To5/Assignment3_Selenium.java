package seleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment3_Selenium 
{
	public static void main(String[] args) throws InterruptedException 
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dnav_custrec_signin%26adgrpid%3D155259815513%26hvpone%3D%26hvptwo%3D%26hvadid%3D676742245123%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D5680203939004614045%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9062041%26hvtargid%3Dkwd-10573980%26hydadcr%3D14453_2367553%26gad_source%3D1&prevRID=A7ASM1J11D586DX37WHE&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		
		driver.manage().window().maximize();
		
		WebElement Cust_Name=driver.findElement(By.name("customerName"));
		Cust_Name.sendKeys("Ashwini Newase");
		
		WebElement Mobile_Num=driver.findElement(By.name("email"));
		Mobile_Num.sendKeys("97304697176");
		
		WebElement Password=driver.findElement(By.name("password"));
		Password.sendKeys("ashwinI!2");
		
		WebElement Verify_Mob=driver.findElement(By.id("continue"));
		Verify_Mob.click();
		
		Thread.sleep(1000);
		
		driver.quit();	
		
	}

}
