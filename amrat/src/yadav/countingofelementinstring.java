package yadav;

public class countingofelementinstring 
{

	public static void main(String [] args)
	{    
		 String a= "It is true that bananas have no bones, and I do like bananas, but I like bananas because they are tasty and healthy, not because they have no bones. I would thus say something false if I said “I like bananas because they have no bones.";
		 int len =a.length();
		  int count=0;
		  for (int i=0;i<=len-1;i++)
		  {
			if (a.charAt(i)=='b')  
			{
			  count++;
			}
		
		  }
		  System.out.print(count);
	  }
}

