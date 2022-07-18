package yadav;
public class object // here object is class name
{
public	int a=10;  // here public is  modifier
public	int b=20;
public int mark=101;
public String c ="wlecome";
public static void main(String[] args) // this is main methode
{
	object amrat= new object();    // this is syntax of object creaction ( class name refrance veriable = new classname (); )
	                               // an object can  call the member of same class
	System.out.println(amrat.a);
	System.out.println(amrat.mark);
    System.out.println(amrat.c);
    Test g = new Test();           // here Test is other class so we can call to the other class by using object
    System.out.println(g.a);
   
    
}
}
