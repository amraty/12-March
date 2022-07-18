package yadav;

public class chiledclass extends parentclass     //  extends keyword is used to acquire properties of parentclass into chiledclass 
{
    final int a=100;
     String c="this is a chiled class";
   
     public void demo() 
    {
    	 System.out.println(super.a);
    	 System.out.println(super.a+a);         // super is used to call the property of parent class
	System.out.println("this is ademo method");
	}
     
    public void test() 
    {
    	System.out.println("hello im test method from parent class");
    } 
    public void demo1()
    {
    	super.test(); // super is used to call the property of parent class
    	this.test();  // this is used to call the property of current class
    }
    
    
static public void main(String[] args) 
{
  final int	a=100;
	chiledclass obj = new chiledclass();
	obj.demo();
	obj.test(); // property (test method) of parent class is aquire due to inheritance
	parentclass obj1= new parentclass();
	obj.test();
	obj.test();  // this is overrided method from parent class
	obj.demo1();
	
}
}
