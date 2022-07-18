package yadav;

public class logical {
	public static void main (String[] args) {// for comparison between two or more condition we have to use this logical operators
		int mobile=20;  // mobile price is 20k
		int laptop=60; ///  laptop price is 60k
		int watch=5;// watch price is 5k
		boolean result=(mobile<=30)&&(laptop<=60)&&(watch<=5); // if there is any one of the condition false then  ans is false
		System.out.println(result);
		boolean resultpro=(mobile<=30)||(laptop<=60)&&(watch<=5); // if there is any one of condition true then ans should be true
		System.out.println(resultpro);
		
	}
}
