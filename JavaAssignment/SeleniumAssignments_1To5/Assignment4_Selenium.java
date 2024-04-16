package seleniumAssignments;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment4_Selenium 
{
	public static void main(String[] args) throws InterruptedException 
	{
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement Mobilelink_homepage=driver.findElement(By.linkText("Mobiles"));
		Mobilelink_homepage.click();
		Thread.sleep(3000);
		driver.quit();
	}

}
