package ScannerClassAssignment;

import java.util.Scanner;

public class Circle_area 
{
	double r;
	double area;
	double pi=3.14;
	
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		Circle_area c1=new Circle_area();
		
		System.out.println("Enter radius of circle r: ");
		c1.r=s1.nextDouble();
		
		c1.area=c1.pi*c1.r*c1.r;
		System.out.println("Area of circle is:"+c1.area);
		
	}
}
