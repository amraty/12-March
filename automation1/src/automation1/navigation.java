package automation1;

import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebDriver.Options;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigation
      { 
	
	   public static void main (String[] args) throws InterruptedException
	   {
	  
		   System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe" );
		   
	   WebDriver driver= new ChromeDriver();
	   driver.get("https://www.youtube.com");
	   
	 // Navigation n=driver.navigate();           // here navigate is method of webdriver which retruns complete navigation interface 
	//  n.to("https://www.youtube.com/");         //    then we use this to() methode to get webpage
	   
	 // driver.navigate().to("https://www.youtube.com/");   or we can directly call like this
	  
	//Thread.sleep(3000) ;                       //it stop java execution for mentioned time
	   
	  // n.back();                              // back is method of navigation interface  to perform back action
	   
	  // Thread.sleep(3000) ;
	   
	  // n.forward();                           // it is also N i methode           
	   
	  // Thread.sleep(3000) ;
	   
	  // n.refresh();                           // to refresh the page we use this method
	   
	 //  driver.navigate().back();              // we can also write in this way all the methodes
	   
	   System.out.println(driver.getTitle());    //to get title of web page  this is the method of webdriver
	   System.out.println(driver.getCurrentUrl()); // to get current url of webpagethi also method of webdriver
	     
	   
	 // driver.manage().window().maximize();       // this is to maximize the window
	 
	         
  Options  op =driver.manage();   // manage is method of webdriver which return complete interface called options 
         Window win =op.window(); // then we use window method of options interface which return window interface
	           win.maximize();    //then we use maximize method of window interface to maximize the browser
	   
	  
	   driver.manage().window().minimize();
	   
	   
	   
	   
	   
	   
	   
	     
	   

      }
}