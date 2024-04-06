package JavaAutoAssignments;

public class SIB_IIB 
{
		public static void main(String[] args) 
		{
			
			System.out.println("I am main method!");
			new SIB_IIB();
			new SIB_IIB(10);
			
		}
		
		{
			System.out.println("I am IIB1!");
		}
		{
			System.out.println("I am IIB2!");
		}
		static
		{
			System.out.println("I am SIB!");
		}
		
		SIB_IIB(int a)
		{
			System.out.println("Constructor is int parameterized!");
		}
		
		SIB_IIB()
		{
			System.out.println("I am constructor!");
		}
		
		
}
