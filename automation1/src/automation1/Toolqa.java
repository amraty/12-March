package automation1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Toolqa {
	
	public static void main(String[] args) {
		 WebDriver driver=browser.openbrowser("https://demoqa.com/frames");
		 
		 driver.switchTo().frame("frame1");
		WebElement text= driver.findElement(By.xpath("(//h1[@id='sampleHeading'])[1]"));
		String value=text.getText();
		System.out.println(value);
		
	
		WebElement frame2=driver.findElement(By.xpath("//iframe[@id='frame2']"));
		driver.switchTo().frame(frame2);
		WebElement text2= driver.findElement(By.xpath("(//h2[@id='sampleHeading'])[2]"));
		 String value2=text2.getText();
		 System.out.println(value2);
		
		
	}
	
	
	

}
