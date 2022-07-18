package automation1;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class amezon
         {
	
	         public static void main(String[] args) throws IOException 
	         
	         {
	        	WebDriver driver=browser.openbrowser("https://www.amazon.in/");
	        	
	        	takescreenshot.screeenshots(driver, "amazon");
	        	
				
			}
	         }