package utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;



public class ScreenShot 
{
	
	public static void screenshots (WebDriver driver,String Name) throws IOException 
	{
		 String d=ScreenShot.date();
   	  
   	  File    source=(( TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);// here upcast the TakesScreenshot interface by reference variable of webdriver interface
   	  
      File destination= new File("C:\\Users\\AMRAT\\Desktop\\screenshotes by automation\\" +Name+" "+ d +".jpg");
         
      FileHandler.copy(source, destination);
	}
	public static  String date()
    {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-mm-dd hh-mm-ss");
    LocalDateTime     currenttime   = LocalDateTime.now();
    String    d = dtf.format(currenttime);
    
	return d;
		
	}

}
