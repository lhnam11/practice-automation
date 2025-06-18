package com.nam.qa.practice;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.nam.qa.POM.BaseClass;
import com.nam.qa.POM.ValidateHelper;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;

@Listeners({io.qameta.allure.testng.AllureTestNg.class})
@Epic("Đăng nhập")
@Feature("Kiểm thử chức năng đăng nhập")
public class SingInTest extends BaseClass {

	private ValidateHelper validateHelper;
	private SignInPage signInPage;


	@Test(priority = 0)
	public void LoginValid() throws Exception {
		signInPage = new SignInPage(driver);
		driver.get("https://www.saucedemo.com/");
		signInPage.signin("standard_user", "secret_sauce");
		String currentUrl = driver.getCurrentUrl();
		assertTrue(currentUrl.contains("inventory.html"),"Login Failed");
	}
	@Test(priority = 1)
	public void LoginwithInvalidName() throws Exception {
		signInPage = new SignInPage(driver);
		driver.get("https://www.saucedemo.com/");
		signInPage.signin("wewe", "secret_sauce");
		assertEquals(signInPage.getErrorMessage(), "Epic sadface: Username and password do not match any user in this service");
	}
	
	@Test(priority = 2)
	public void LoginwithInvalidPassWord() throws Exception {
		signInPage = new SignInPage(driver);
		driver.get("https://www.saucedemo.com/");
		signInPage.signin("standard_user", "avcv");
		assertEquals(signInPage.getErrorMessage(), "Epic sadface: Username and password do not match any user in this service");
	}
	
	
	@Test(priority = 3)
	public void LoginwithEmptyName() throws Exception {
		signInPage = new SignInPage(driver);
		driver.get("https://www.saucedemo.com/");
		signInPage.signin("", "secret_sauce");
		assertEquals(signInPage.getErrorMessage(), "Epic sadface: Username is required");
	}
	@Test(priority = 4)
	public void LoginwithEmptyPassWord() throws Exception {
		signInPage = new SignInPage(driver);
		driver.get("https://www.saucedemo.com/");
		signInPage.signin("standard_user", "");
		assertEquals(signInPage.getErrorMessage(), "Epic sadface: Password is required");
	}
}
