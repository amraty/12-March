package yadav;

public class constructor
{
	constructor(int a, String b)                         // user difine parameterized cons
	{
		System.out.println("hello im constructor");
		System.out.println(a);                          // first 5 print then 10 print
	} 
	public void test()                                  // nonstatic test method
	
	
	{
		System.out.println("hello this is test method");
	}
	public static void main(String[]args)                // main method
	{
	constructor obj = new constructor(5, "amratrao");      //constructor can be only called during  object creation
	obj.test();
	obj.test();
	obj.test();
	constructor obj2= new constructor(10 ,"yadav");
	}
}      

                 // constructor help to load class member to the object, which help to call nonstatic member of class
                 // constructor help to allocate memory to object of class
                 // consructor name must be same as class name
                 // it is not compulsoury to write cons because java provoid default cons by itself
                 // cons have no return type
                 // cons can not be static, abtract, final
        //  zero argument  cons means jo bracket hai usme aurgument  nahi rahate