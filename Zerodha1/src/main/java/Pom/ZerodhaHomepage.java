package Pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaHomepage {
	
	
	@FindBy(xpath="//input[@icon='search']") private WebElement search;
	@FindBy(xpath="//span[@class='search']") private List<WebElement> shares;
	@FindBy(xpath="//button[@class='button-blue-buy']") private WebElement watchlistBuy;


	
   public ZerodhaHomepage(WebDriver driver) 
   {
	PageFactory.initElements( driver,this);
    }
    public void EnterStockTosearch(String nameofstock) {
    	search.sendKeys(nameofstock);
	
    }
    public void SelectShareFromWacthListandBuy(String ShareName,WebDriver driver) {
    	System.out.println(shares.size());
    	
    	for (int i=0;i<shares.size();i++) {
    		
    	
    	
 
		WebElement stock=shares.get(i);
    	String Stockname=stock.getText();
    	}
    }

    }
	
	


