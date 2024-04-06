package JavaAutoAssignments;

public class ModulusAssignment 
{

	public static void main(String[] args) 
	{
		for(int i=1;i<=500;i++)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.println(i+ " Computer and Mouse");
			}
			else
				{
					if(i%3==0)
						{
							System.out.println(i+ " Computer");
						}
			
					if(i%5==0)
						{
							System.out.println(i+ " Mouse ");
						}
				}
			System.out.println();
		}
		

	}

}
