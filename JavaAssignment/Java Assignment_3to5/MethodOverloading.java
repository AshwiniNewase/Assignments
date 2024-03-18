package JavaAutoFirstPro;

public class MethodOverloading 
{

	//Method Overloading of non static methods
	void method(int a, int b, double c)
	{
		System.out.println(a);
	}
	
	void method(double a, int b, int c)
	{
		a=a+b;
		System.out.println(a);
	}
	
	void method(int a, double b, int c)
	{
		b=a+c;
		System.out.println(b);
	
	}

	//Method Overloading of static methods
	static void method(String a, char b)
	{
		System.out.println(a+b);
	}
	
	static void method(char a, String b)
	{
		System.out.println(a+b);
	
	}
	
	
	
	public static void main(String[] args) 
	{
		method("Sarswi ",'S');
		
		method('K'," Shinde");
		
		MethodOverloading mo=new MethodOverloading();
		
		mo.method(1,2,3.5);
		mo.method(3.9,7,8);
		mo.method(5,7.4,80);
		

	}

}
