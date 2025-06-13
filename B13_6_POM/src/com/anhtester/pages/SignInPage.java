package com.anhtester.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInPage {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(id = "user-name")
    private WebElement usernameInput;
    
    @FindBy(id = "password")
    private WebElement passwordInput;
    
    @FindBy(id = "login-button")
    private WebElement  loginBtn;
    
    @FindBy(css = "[data-test='error']")
    private WebElement errorMsg;
    
    public SignInPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 10);
    }
    // trước tiên click hay nhập vào thì phải kiểm tra nó 
    // nếu mà lâu quá thì wait vào xài explicit wait dùng webDriverWait 
    
    public void enterUsername(String username) {
    	   wait.until(ExpectedConditions.visibilityOf(usernameInput));
    	   
    	   wait.until(ExpectedConditions.elementToBeClickable( usernameInput));
    	   
           usernameInput.sendKeys(username);
       
    }

    public void enterPassword(String password) {
        passwordInput.sendKeys(password);
    }

    public void clickLoginButton() {
        loginBtn.click();
    }

    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLoginButton();
    }

    public String getErrorMessage() {
        WebElement errorElement = errorMsg;
        return errorElement.isDisplayed() ? errorElement.getText() : "";
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public boolean isLoginButtonDisplayed() {
        return loginBtn.isDisplayed();
    }
    
 

}
