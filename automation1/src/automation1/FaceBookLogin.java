package automation1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FaceBookLogin {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		 WebDriver driver=browser.openbrowser("https://www.facebook.com/");
		 
		String emailid=Parameterization.getData("testdata", 2, 6);
		WebElement email =driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys(emailid);
		
		String password =Parameterization.getData("testdata", 3, 6);
		WebElement pass =driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys(password);
	}

}
