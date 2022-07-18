package yadav;

public class premtivecasting 

      {
	
	public static void main(String[] args)
	{
		short a= 10;
		  int b= a;
		 System.out.println(b);  // lower to higher conversion
		  
	   double d= b;
	   System.out.println(d);
	     
	    double e=10.9999;
	   int i= (int) e;
		System.out.println(i);  // explicit casting
		
		         short s=(short) i;
		         System.out.println(s); // higher to lower conversion
	}
	 
	 

	

	}

      
