package amarraj;
import yadav.Test; // this is the syntax of calling to all class from diffrent package
                // if we want to call perticuler class just type name of that class instead of star
public class google
{
 public int a=30;
public int b=40;
String k="google baba";
public static void main(String[] args)
{
	Test a= new Test();
	System.out.println(a.b);
}
}
