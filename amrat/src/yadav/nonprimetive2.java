package yadav;

public class nonprimetive2 
{ 
	public static void main(String[] args) 
	{
	int[] a= {10,20,30,40,50,60};               // array of integer value
	
	String b[] = {"velocity","katraj","pune"};  // array of string
	
	System.out.println(a[1]);                   // print value at index 1 in  array a
	
	System.out.println(b[2]);                   //print value at index 2 in string b
	
	int c[] =  new int [] {10,20,30,40,50,60};     // decleration using new keyword
	
	int d[]=new int[100];                          // fixed size arry
	
	d[50]=700;
	d[30]=500;
	System.out.println(d[50]);
	String g=b[1];                                // string b mai se index 1 position ki string store hogi g variable mai
	  int len = b[1].length();
	  for (int i=len-1;i>=0;i--)                  // reverse of substring 
		  
	System.out.print(g.charAt(i));                // output is jartak
	
	
	}
	
	
	
	
	
	}

