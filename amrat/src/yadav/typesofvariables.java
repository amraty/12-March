package yadav;

public class typesofvariables 
{ 
	int a=10;  // non static or instance variable global variable
	static int b=30; // static or class global variable
	public void test() 
	{
		System.out.println(a); //10
		System.out.println(b); // b is static variable can be directly accessed in class
	}
	public static void demo()
	{
		System.out.println(a); // we cannot call non static global  variable directly in static method
		System.out.println(b); //30
		
	}
	public static void main(String[] args)
	{
		typesofvariables obj= new typesofvariables();
		System.out.println(obj.b); // to call non static global member in static method we need object
		System.out.println(typesofvariables.b);
		typesofvariables.demo();
	}

}
