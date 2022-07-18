package yadav;

public class ladder {
	public static void main(String[] args) {
		int mark=50;// ladder is where we can put if after else
		if (mark<=100 && mark>=0) 
		{
		if (mark>=90)
		{
			System.out.println("a+ grade");
		}	
		else if(mark>=80 && mark<90) 
		{
			System.out.println("b grade");
		}
		else if(mark>=70 && mark<80) 
		{
			System.out.println("c grade");
		}
		else if(mark>=60 && mark<70) 
		{
			System.out.println("d grade");
		}
		else if(mark>=50 && mark<60) 
		{
			System.out.println("e grade");
		}
		else if(mark>=40 && mark<=50);
		{
			System.out.println("f grade");
		}
		}
		else
		{
			System.out.print("invalid input ");
		}
		
	}

}
