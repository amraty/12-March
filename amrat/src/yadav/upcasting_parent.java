package yadav;

public class upcasting_parent 

{
	public void test() 
	{    
		int s=100;
	
		System.out.println("this is test methode 1");
	}	
		public void test1() 
		{
	System.out.println("this is test 2 method");
		
		}
		public static void main(String[] args) 
		{
			upcasting_parent k= new upcasting_chield ();
			k.test();
		}


}
