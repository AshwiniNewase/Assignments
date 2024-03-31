package JavaAutoAssignments;

public class Nestedifelse 
{

	public static void main(String[] args) 
	{
		int a=121;
		
		if(a%2==0)
		{
			System.out.println("Given number is even!");
			if(a%4==0)
			{
				System.out.println("Given number is divisible by 4");	
			}
			
			if(a%6==0)
			{
				System.out.println("Given number is divisible by 6");
			}
			
			if(a%8==0) 
			{
				System.out.println("Given number is divisible by 8");
			}
		}
		else
		{
			System.out.println("Given number is odd!");
			
		}
	}

}
