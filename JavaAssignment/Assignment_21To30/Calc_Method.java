package ScannerClassAssignment;

import java.util.Scanner;
public class Calc_Method
{
	
	void addition()
	{
		int a;
		int b;
		int c;
		
		Scanner s1=new Scanner(System.in);
		
		
		System.out.println("Enter number 1:");
		a=s1.nextInt();
		
		System.out.println("Enter number 2:");
		b=s1.nextInt();
		
		c=a+b;
		System.out.println("Addition is: ");
		System.out.println(c);
		
	}
	
	void Subtraction()
	{
		int a;
		int b;
		int c;
		
		Scanner s1=new Scanner(System.in);
		
		
		System.out.println("Enter number 1:");
		a=s1.nextInt();
		
		System.out.println("Enter number 2:");
		b=s1.nextInt();
		
		c=a-b;
		System.out.println("Subtraction is: ");
		System.out.println(c);
	}
	
	void Multiplication()
	{
		int a;
		int b;
		int c;
		
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter number 1:");
		a=s1.nextInt();
		
		System.out.println("Enter number 2:");
		b=s1.nextInt();
		
		c=a*b;
		System.out.println("Multiplication is: ");
		System.out.println(c);
	}
	
	void Division()
	{
		int a;
		int b;
		int c;
	
		Scanner s1=new Scanner(System.in);
		
	
		System.out.println("Enter number 1:");
		a=s1.nextInt();
	
		System.out.println("Enter number 2:");
		b=s1.nextInt();
	
		c=a/b;
		System.out.println("Division is: ");
		System.out.println(c);
	}
	public static void main(String[] args)
	{
		Calc_Method c1=new Calc_Method();
		c1.addition();
		c1.Subtraction();
		c1.Multiplication();
		c1.Division();
	}
}
