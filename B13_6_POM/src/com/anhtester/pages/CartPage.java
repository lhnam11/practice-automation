package com.anhtester.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    private WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public CheckoutPage proceedToCheckout() {
        WebElement checkoutButton = driver.findElement(By.id("checkout"));
        checkoutButton.click();
        return new CheckoutPage(driver);
    }

}


