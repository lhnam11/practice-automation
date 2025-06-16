package com.anhtester.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	private WebDriver driver;

	@FindBy(className = "title") // ví dụ tiêu đề trang Home sau login
	private WebElement pageTitle;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String getPageTitleText() {
		return pageTitle.getText();
	}
	
	public HomePage addItemToCart(String productName) throws Exception {
		Thread.sleep(2000);
        // Dò theo tên sản phẩm → nút Add to cart
        WebElement addButton = driver.findElement(By.xpath("//div[text()='" + productName + "']/ancestor::div[@class='inventory_item']//button"));
        addButton.click();
        return this;
    }

    public CartPage goToCart() throws Exception {
    	Thread.sleep(2000);
        WebElement cartButton = driver.findElement(By.className("shopping_cart_link"));
        cartButton.click();
        return new CartPage(driver);
    }


	
}
