package yadav;

import java.util.Scanner;

public class scanner
{
	public static void main(String[] args) 
	{
		Scanner scan =new Scanner (System.in);
		
		System.out.println("enter ur name");
		   String s=scan.nextLine();
		 System.out.println(s);
		 
		 System.out.println("enter your age");
		          int i = scan.nextInt();
		          System.out.println("u r age is"+i);
	}

}
