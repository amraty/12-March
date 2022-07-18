package automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Table {
	public static void main(String[] args) {
		WebDriver driver =browser.openbrowser("https://demo.guru99.com/test/web-table-element.php");
		WebElement preClose=driver.findElement(By.xpath("//table//tbody//tr[6]//td[3]"));
		String value =preClose.getText();
		System.out.println(value);
	}

}
