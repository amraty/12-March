package yadav;

public class nested {
	public static void main(String[] args) {
		int mark=101;
		if (mark>=100)// nested if  else is where we can write multiple if else condition under if condition
		{
			if(mark>40)
			{
				System.out.print("u are passed");
			}
			else {
				System.out.print("u are failed");
			}
			
		}
		else{
			System.out.print("invalid mark");
		}
	}

}
