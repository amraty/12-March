package yadav;

public class elseif {
	public static void main(String[] args) {
		int a=101;
		if (a>0) 
		{
			if(a<=100)
			{
			System.out.println("pass");
		    }
			else if(a<=101)
			{
				System.out.println("fail");
			}
			else if (a<102)
			{
				System.out.println("a+ grade");
			}
	     } 
		else 
		{
			System.out.println("invalid");
		}
	
	}
}
