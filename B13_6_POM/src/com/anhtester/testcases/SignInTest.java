package com.anhtester.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.anhtester.base.BaseSetup;
import com.anhtester.pages.CheckoutPage;
import com.anhtester.pages.HomePage;
import com.anhtester.pages.SignInPage;

public class SignInTest extends BaseSetup {

	private WebDriver driver;
	public SignInPage signInPage;
	public HomePage homePage;

	@BeforeClass
	public void setUp() {
		driver = getDriver();
		driver.get("https://www.saucedemo.com/");
		signInPage = new SignInPage(driver); // Truy cập trang login
	}
	@Test
	public void testLoginWithValidCredentials() throws Exception {
		 CheckoutPage checkoutPage = signInPage
			        .login("standard_user", "secret_sauce")
			        .addItemToCart("Sauce Labs Backpack")
			        .goToCart()
			        .proceedToCheckout();

			    Assert.assertEquals(checkoutPage.getCheckoutTitle(), "Checkout: Your Information");
	}

//    @Test
//    public void testLoginWithInvalidCredentials() {
//        driver.get("https://www.saucedemo.com/"); // Load lại trang nếu cần
//        signInPage.login("locked_out_user", "wrong_password");
//        String error = signInPage.getErrorMessage();
//        Assert.assertTrue(error.contains("Epic sadface"), "Không thấy lỗi khi đăng nhập sai.");
//    }
}
