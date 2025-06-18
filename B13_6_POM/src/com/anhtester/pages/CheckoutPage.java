package com.anhtester.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
    private WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        
        PageFactory.initElements(driver, this);
    }

    public String getCheckoutTitle() {
        
        return driver.findElement(By.className("title")).getText(); // "Checkout: Your Information"
    }
}
