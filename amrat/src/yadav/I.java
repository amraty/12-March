package yadav;

public class I
{
	 static public void loop()
	{for(int a=1; a<=4; a++)//1 2 3
	{
		for(int b=1; b<=a ;b++)
		{
			System.out.print("*"); //1
		}
		System.out.println();
	}
}
	public static void main(String[] args) 
	{
	 I.loop();I.loop();I.loop();
	}
		
	
}


	