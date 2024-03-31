package JavaAutoAssignments;

public class ORoperator 
{

	public static void main(String[] args) 
	{
		int a=25;
		int b=29;
		
		if(a>30 || a==b)
		{
			int c=7+a+b;
			System.out.println(c);
		}
		
		if(a<30 || a==b)
		{
			int c=7+a+b;
			System.out.println(c);
		}
		
		if(a>30 || b==29)
		{
			int c=7+a+b;
			System.out.println(c);
		}
		
		if(a==25 || b==29)
		{
			int c=7;
			System.out.println(c);
		}

	}

}
