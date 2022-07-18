package yadav;

public class overloading
{
 public void test()
    {
	 System.out.println("hello im test method with no argumentes");
	 
	}
 public void test(int a,int b)
    {
	 System.out.println(a+b);
	 System.out.println("same nam ki test method overload hui hai");
	 
	}
 public void test(int a,int b,int c)
    {
	 
	 System.out.println( "3rd time overloaded with difrrent arguments");
	}
 public static void main(String[] args) 
 {  
	 overloading obj= new overloading();
			 obj.test();
			 obj.test(5,5);
			 obj.test(10,10,10);  // this is calling of overloaded methodes
			
}
}
              /// in  overloading in method declaration method name should be same  but there is variance in argument   
               // variance is in term of diffrent data type and numbers of parameters