package ScannerClassAssignment;

import java.util.*;

public class Calc_Single_Scanner 
{
	int a;
	int b;
	int c;
	
	public static void main(String[] args) 
	{
		Calc_Single_Scanner c1=new Calc_Single_Scanner();//object
		Scanner s1=new Scanner(System.in);//scanner class
		
		
		//Addition calculation
		System.out.println("Enter number 1:");
		c1.a=s1.nextInt();
		
		System.out.println("Enter number 2:");
		c1.b=s1.nextInt();
		
		c1.c=c1.a+c1.b;
		System.out.println("Addition is:"+c1.c);
		
		
		//Subtraction calculation
		System.out.println("Enter number 1:");
		c1.a=s1.nextInt();
		
		System.out.println("Enter number 2:");
		c1.b=s1.nextInt();
		
		c1.c=c1.a-c1.b;
		System.out.println("Subtraction is:"+c1.c);
		
		
		
		//Multiplication calculation
		System.out.println("Enter number 1:");
		c1.a=s1.nextInt();
				
		System.out.println("Enter number 2:");
		c1.b=s1.nextInt();
				
		c1.c=c1.a*c1.b;
		System.out.println("Multiplication is:"+c1.c);
		
		

		//Division calculation
		System.out.println("Enter number 1:");
		c1.a=s1.nextInt();
				
		System.out.println("Enter number 2:");
		c1.b=s1.nextInt();
				
		c1.c=c1.a/c1.b;
		System.out.println("Division is:"+c1.c);
		
		
		

	}

}
