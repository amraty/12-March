package automation1;


import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import io.netty.handler.codec.DateFormatter;


public class takescreenshot
         { 
	        public static void screeenshots(WebDriver driver,String name ) throws IOException
	        { 
	        	  String d=takescreenshot.date();
	        	  
	        	  File    source=(( TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);// here upcast the TakesScreenshot interface by reference variable of webdriver interface
	        	  
	              File destination= new File("C:\\Users\\AMRAT\\Desktop\\screenshotes by automation\\" +name+" "+ d +".jpg");
	              
	              FileHandler.copy(source, destination);
			}
	        
	        public static  String date()
	        {
	        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-mm-dd hh-mm-ss");
	        LocalDateTime     currenttime   = LocalDateTime.now();
	                   String    d = dtf.format(currenttime);
	        
			return d;

}}
