package yadav;

public  abstract class  abtractclass    // type of class in which complete as well as incomlete methods are present
         {
	public  void test() 
	{
		System.out.println("test");               // complete method
	}
	public static void demo()
	{
		System.out.println("complete method");    //  complete method
	}
	
	public abstract void login();                 //  incomplete  method need to use abstract keyword in incomplet method
	
	
	// public  abstract static void test1 ();    // static method can not be abstarct
	 
	 public static void main(String[] args)
	 { 
		// abtractclass obj = new abtractclass();   // can not create the object for abstract class
		 abtractclass.demo();                       // no need to create obj for static element
	}
         }
      
       
	
		
	


