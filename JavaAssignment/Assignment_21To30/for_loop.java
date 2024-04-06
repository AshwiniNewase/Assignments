package ScannerClassAssignment;

import java.util.Scanner;

public class for_loop 
{
	static int i;
	static int j;
	static int a;

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter i: ");
		i=s1.nextInt();
		System.out.println("Enter j: ");
		j=s1.nextInt();
		
		for(a=i;i<=j;++i)
		{
			System.out.println(i);
		}
		

	}

}
