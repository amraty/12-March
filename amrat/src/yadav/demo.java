package yadav;

public class demo {                        // demo is class name
	int a=10; int b=20;                    // class body till last closing bracket // that are non static veriables
	public void amrat()                    // amrat is  non static method
	{
		System.out.println("BHIM JAYNTICHYA HARDIK SUBHECHA");  // method body
	}
	public static void yadav()               // yadav is static method
	{
		System.out.print("2022");
	}
	
 public static void main(String[] args)        // main method execute program 
 {
	demo r= new demo();                        // object of same class
r.amrat();                                     // calling method by using object
demo.yadav();                                  // calling static method by using class name
                       
 }
 }


