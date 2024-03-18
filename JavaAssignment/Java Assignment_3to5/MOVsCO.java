package JavaAutoFirstPro;

public class MOVsCO 
{

	// Method Overloading of static and non static methods
	void MethodOverloading()
	{
		System.out.println("This is non parameterized non static method");
	}
	
	void MethodOverloading(int a, char b)
	{
		System.out.println("This is parameterized non static method with int and char arguments");
	}
	
	void MethodOverloading(String a, char b)
	{
		System.out.println("This is parameterized non static method with String and char arguments");
	}
	
	static int MethodOverloading(int a)
	{
		System.out.println("This is parameterized static method with int return type with int argument");
		return 1;
	}
	
	//Constructor Overloading
	MOVsCO()
	{
		System.out.println("This is non parameterized constructor");

	}
	
	MOVsCO(char a, int b)
	{
		System.out.println("This is parameterized constructor with char and int arguments");

	}
	
	MOVsCO(int a, int b)
	{
		System.out.println("This is parameterized constructor with int and int arguments");

	}
	
	
	public static void main(String[] args)
	{
		//Non Static Method calling
		
		MOVsCO m1=new MOVsCO();//object creation
		m1.MethodOverloading();
		m1.MethodOverloading(10, 's');
		m1.MethodOverloading("Sarswi", 's');
		
		//Static method calling
		
		MethodOverloading(7);
		
		//Constructor calling
		
		new MOVsCO();
		new MOVsCO('k',65);
		new MOVsCO(90,54);
		
		
		

	}

}
