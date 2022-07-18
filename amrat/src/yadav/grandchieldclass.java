package yadav;

public class grandchieldclass extends chiledclass
{
public void gchield() 
     {
	System.out.println("im gchield method");
      }
public static void main(String[] args)
     {
	grandchieldclass obj =  new grandchieldclass ();
	obj.gchield();   // method of current class
	obj.demo();      // by using same objet wecan acquire property of chiled class
	obj.test();      // this is method of parent class 
     }
                    // this is called as multilevel inheritance
	
}
              // multiple inheritance is not suported like  due to diomond ambiguity problem
                //grandchieldclass extends chiledclass,parentclass  ***
