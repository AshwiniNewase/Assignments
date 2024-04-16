package seleniumAssignments;

import java.util.Arrays;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1_Selenium 
{
		public static void main(String[] args) 
		{
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.linkedin.com/");
			String title=driver.getTitle();
			System.out.println("Title is--> : "+title);
			System.out.println("Length of title is--> "+driver.getTitle().length());
			String titleS[]=new String[6];
			
			String s1=title.substring(0, 9);
			titleS[0]=s1;
			String s2=title.substring(10, 13);
			titleS[1]=s2;
			String s3=title.substring(14, 16);
			titleS[2]=s3;
			String s4=title.substring(17, 19);
			titleS[3]=s4;
			String s5=title.substring(20, 24);
			titleS[4]=s5;
			String s6=title.substring(25, 27);
			titleS[5]=s6;
			
			System.out.println();
			System.out.println(Arrays.toString(titleS));
			
			//Thread.sleep(3000);
			driver.quit();
			
		}


}
