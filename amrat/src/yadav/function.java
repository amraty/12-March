package yadav;

public class function // here function is name of class in this class we are going to discuss methods
{
  final int a=10;
 int b=20;
 String d= "velocity";
 public void agile() // this is the methode diclearation void is thr return type agile is method name it can be anything
                     // user difined method
 {
	 System.out.println("hello im  agile method"); //  body of the method
}
 public void   vmodule()  // 2nd method 
 {
	 int a=20;
	 System.out.println(a);
	 System.out.println("hello im  vmodule method");
	 
 }
 public static void main(String[] args){
 {
	 function g = new function();  //object of class
	 System.out.println(g.a);System.out.println(g.b);
	 g.agile();  // calling method with object
	 g.vmodule(); // calling method with object
	 
	 
}
 }
 }
