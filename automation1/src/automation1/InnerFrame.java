package automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InnerFrame {
	
	public static void main(String[] args) {
		WebDriver driver=browser.openbrowser("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		WebElement DoubleFrame =driver.findElement(By.xpath("(//a[@data-toggle='tab'])[2]"));
		DoubleFrame.click();
		
		 WebElement Outerfrme=driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(Outerfrme);
		
		WebElement Innerfrme=driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		
		driver.switchTo().frame(Innerfrme);
		
		
		WebElement text=driver.findElement(By.xpath("(//input[@type='text'])"));
		text.sendKeys("velocity");
	}

}
