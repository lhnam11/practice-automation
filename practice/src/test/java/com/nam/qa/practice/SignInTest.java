package com.nam.qa.practice;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.nam.qa.POM.BaseClass;
import com.nam.qa.POM.ValidateHelper;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Listeners({ io.qameta.allure.testng.AllureTestNg.class })
@Epic("Login")
@Feature("Login Page Functionality")
public class SignInTest extends BaseClass {

	private ValidateHelper validateHelper;
	private SignInPage signInPage;
	private WebDriverWait wait;
    
	@Test
	@Severity(SeverityLevel.CRITICAL)
    public void testlogin()
    {
		driver.get("https://www.saucedemo.com/");
		ProductPage productPage = signInPage.signin("avc", "sdfas");
    }
	@Story("Đăng nhập với thông tin hợp lệ ")
	@Test(priority = 0)
	public void LoginValid() throws Exception {
		signInPage = new SignInPage(driver);
		driver.get("https://www.saucedemo.com/");
		signInPage.signin("standard_user", "secret_sauce");
		String currentUrl = driver.getCurrentUrl();
		assertTrue(currentUrl.contains("inventory.html"), "Login Failed");
	}

	@Test(priority = 1)
	public void LoginwithInvalidName() throws Exception {
		signInPage = new SignInPage(driver);
		driver.get("https://www.saucedemo.com/");
		signInPage.signin("wewe", "secret_sauce");
		assertEquals(signInPage.getErrorMessage(),
				"Epic sadface: Username and password do not match any user in this service");
	}

	@Test(priority = 2)
	public void LoginwithInvalidPassWord() throws Exception {
		signInPage = new SignInPage(driver);
		driver.get("https://www.saucedemo.com/");
		signInPage.signin("standard_user", "avcv");
		assertEquals(signInPage.getErrorMessage(),
				"Epic sadface: Username and password do not match any user in this service");
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

	@Test(priority = 5)
	public void LoginWithLockedOutUser() {
		signInPage = new SignInPage(driver);
		driver.get("https://www.saucedemo.com/");
		signInPage.signin("locked_out_user", "secret_sauce");
		assertEquals(signInPage.getErrorMessage(), "Epic sadface: Sorry, this user has been locked out.");
	}

	@Test(priority = 6)
	public void LoginwithProblemUser_ErrorUI() throws Exception {
		signInPage = new SignInPage(driver);
		driver.get("https://www.saucedemo.com/");
		signInPage.signin("problem_user", "secret_sauce");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("inventory_item_img")));

		String imgSrc = driver.findElement(By.className("inventory_item_img")).getAttribute("src");
		assertTrue(imgSrc.contains("sl-404"), "Problem User image is not broken as expected");
	}

	@Test(priority = 7)
	public void LoginwithPerformanceglitch() {
		signInPage = new SignInPage(driver);
		driver.get("https://www.saucedemo.com/");

		long startTime = System.currentTimeMillis();
		signInPage.signin("performance_glitch_user", "secret_sauce");
		long duration = System.currentTimeMillis() - startTime;

		// nếu không có 2 dòng dưới đây là sai mục đích test vì nếu kh vào được trang
		// login chỉ xác nhận thời gian thất bại
		// mà không xác nhận được thời gian đăng nhập thành công
		assertTrue(driver.getCurrentUrl().contains("inventory.html"));
		System.out.println("Login duration: " + duration + " ms");

		assertTrue(duration > 2000, "Login was fast");
	}
	
	@Test(priority = 8)
	public void LoginWithVisualUser_ShouldHaveVisualIssues() throws Exception {
		signInPage = new SignInPage(driver);
		driver.get("https://www.saucedemo.com/");
		signInPage.signin("visual_user", "secret_sauce");

		WebElement img = driver.findElement(By.className("inventory_item_img"));
		String imgSrc = img.getAttribute("src");
		assertTrue(imgSrc.contains("sl-404"), "Expected broken image for visual_user");
	}

}
