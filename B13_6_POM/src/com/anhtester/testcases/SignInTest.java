package com.anhtester.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.anhtester.base.BaseSetup;
import com.anhtester.pages.SignInPage;

public class SignInTest extends BaseSetup {

    private WebDriver driver;
    public SignInPage signInPage;

    @BeforeClass
    public void setUp() {
        driver = getDriver();
        driver.get("https://www.saucedemo.com/");  // Truy cập trang login
        signInPage = new SignInPage(driver);
    }

    @Test
    public void testLoginWithValidCredentials() {
        signInPage.login("standard_user", "secret_sauce");
        Assert.assertTrue(driver.getCurrentUrl().contains("inventory.html"), "Login không thành công.");
    }

//    @Test
//    public void testLoginWithInvalidCredentials() {
//        driver.get("https://www.saucedemo.com/"); // Load lại trang nếu cần
//        signInPage.login("locked_out_user", "wrong_password");
//        String error = signInPage.getErrorMessage();
//        Assert.assertTrue(error.contains("Epic sadface"), "Không thấy lỗi khi đăng nhập sai.");
//    }
}
