package JavaAutoFirstPro;

public class ConstructorOverloading 
{
	
	ConstructorOverloading()
	{
		System.out.println("Constructor with no parameter");
	}
	
	ConstructorOverloading(int a)
	{
		System.out.println("Constructor with int parameter");
	}
	
	ConstructorOverloading(boolean a)
	{
		System.out.println("Constructor with boolean parameter");
	}
	
	ConstructorOverloading(String a)
	{
		System.out.println("Constructor with string parameter");
	}
	
	ConstructorOverloading(char a)
	{
		System.out.println("Constructor with char parameter");
	}

	public static void main(String[] args) 
	{
		
		new ConstructorOverloading();
		new ConstructorOverloading(9);
		new ConstructorOverloading(true);
		new ConstructorOverloading("ashwini");
		new ConstructorOverloading('S');
		
		
	}

}
