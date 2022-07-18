package yadav;

public class nonpremtive_string 
{
	
	public static void main(String [] args) 
	{
		String a= "Velocity"; // this is regular way to declare string variable this type of deceleration saved in string constant pool area this is a memory efficient way
		String b= new String("velocity");        // decleration by new keyword it is saved in nonpool area
		System.out.println(a.charAt(2));  // index 2 ki value print hogi that is l
		
		  int len=a.length();                    // calculate length by using lenght method
		  
		  System.out.println(len);               // 8
		  
		  System.out.println(a.toUpperCase());   // VELOCITY
		  
		  System.out.println(a);                 // original result Velocity thats why it is called as  immutable
		  
		  System.out.println(a.toLowerCase());// Velocity
		  
		  System.out.println(a.toUpperCase()); //VELOCITY
		  
		  boolean result= a.equals(b);           // compaire between a and b
		  
		  System.out.println(result);            // false
		  
		  boolean result1= a.equalsIgnoreCase(b); // case ignore
		  
		  System.out.println(result1);            // true
		  
		  System.out.println(a.concat(" katraj")); //  katraj  add hoga
		  
		  System.out.println(a);                   // "Velocity katraj"
		  
		  boolean d= a.contains("ity");            // to check ity is present in string
		  
		  System.out.println(d);                   // true
		  
		  System.out.println(b.substring(3));      //print only from  index 3 ocity
		  
		  
		  
		  
	}
}
