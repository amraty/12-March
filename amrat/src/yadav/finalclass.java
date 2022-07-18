package yadav;

public final class  finalclass
{
       public void test()
{
	System.out.println("test is final we cannot changes in this method");
}
      public final void test1() 
      {
    	  System.out.println("demo");
    	  
      }
      public static void main(String[] args)
      {
		final int a=10;
		int v=20;
		 v=10-5;
		 System.out.println(v);
		 a=30;// we cannot change the  value of final variable
		
	}
}
