package automation1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class setsizeposition 
{
	 public static void main (String[] args) throws InterruptedException
	   {
	  
		   System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe" );
		   
	   WebDriver driver= new ChromeDriver();
	   driver.get("https://www.facebook.com/");
	   driver.manage().window().maximize();
	  Dimension s= new Dimension(2000,8000); // dimention class accept hight and width of broweser in its constructor argument this is a class of selenium
	  driver.manage().window().setSize(s);// setSize is methode of window interface which accept referance variable of dimention class as an argument
	  Thread.sleep(3000);
	  Point  p= new Point (800,900);   // point class accept coordinates in its constructor 
	  driver.manage().window().setPosition(p); // setPosition methodes belons to window interface which accept referance variable of point class as an argument
	  
	   

}
}
