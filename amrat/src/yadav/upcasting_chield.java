package yadav;

public class upcasting_chield extends upcasting_parent
    {
	
	int a=200;
	public void demo()
	{
	System.out.println("this is demo");
	}
	public void demo1() 
	{
		System.out.println("this is demo1");
	}
	public void test()
	{
		int s=100;
		
		System.out.println("this is test methode 12 ");
	}
	
	
	
        public static void main(String[] args) 
        { 
        	upcasting_parent k= new upcasting_chield ();
			k.test();
			k.demo()

			
		}
    }
