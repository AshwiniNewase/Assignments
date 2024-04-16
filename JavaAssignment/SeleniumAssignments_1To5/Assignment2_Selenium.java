package seleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2_Selenium 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();//Launching empty chrome browser
		driver.get("https://www.flipkart.com/");//Navigating to flipkart website
		driver.findElement(By.name("q")).sendKeys("Shoes");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.quit();
	}

}
