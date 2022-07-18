package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaLogInPage {
	
	@FindBy(xpath="//input[@type='text']")                           private WebElement userId;
    @FindBy(xpath="//input[@type='password']")                       private WebElement password;
    @FindBy(xpath="//button[@type='submit']")                        private WebElement login;
    
    @FindBy(xpath="//a[text()='Forgot user ID or password?']")       private WebElement forgot;
    @FindBy(xpath="//input[@type='text']")                           private WebElement signup;
    @FindBy(xpath="//img[@alt='Kite Android']")                      private WebElement downloadAndroid;
    @FindBy(xpath="//img[@alt='Kite iOS'] ")                         private WebElement downloadIos;
    @FindBy(xpath="//input[@type='password']")                       private WebElement pin;
    @FindBy(xpath="//button[@type='submit']")                        private WebElement submit; 
    
    public ZerodhaLogInPage(WebDriver driver)
    {
    	PageFactory.initElements(driver,this);
    }
    public void enterUserId(String user) 
    {
    	userId.sendKeys(user);
    }
    public void enterPassword(String Pass) 
    {
    	password.sendKeys(Pass);
    }
    public void clickOnlogin() 
    {
    	login.click();
    }
    public void clickOn() 
    {
    	login.click();
    }
    public void enterPin(  String pinnumber) 
    {
    	pin.sendKeys(pinnumber);
    }
    public void clickOncontinue()
    {
    submit.click();
    }
    }
    

