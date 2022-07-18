package yadav;

public class class_c extends abtractclass
{
public void login() 
    {
	System.out.println("login with password and pin");  // updated that log in method from abtractclass
	}
}                                                       
       //As we know that we cannot create the object of abstract class because of abstract/incomplete method 
//present inside it, so when we inherit this Abstract a class in a subclass and provide implementation to its incomplete method, 
//this subclass where this incomplete method are completed is called as Concrete class.
//Or we can say that the class in which 
//the abstract methods/incomplete methods are completed are known as Concrete class.
//A class will called concrete class only 
//if it completing all the methods of abstract class.
//Note:- Abstract keyword is used to declare a abstract class, but there is no keyword for Concrete class.
//Abstract class does not have constructor in it, not even default constructor
