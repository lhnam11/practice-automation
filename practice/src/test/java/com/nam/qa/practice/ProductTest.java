package com.nam.qa.practice;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.nam.qa.POM.BaseClass;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Listeners({ io.qameta.allure.testng.AllureTestNg.class })
@Epic("Product Page")
@Feature("Product Page Functionality")
public class ProductTest extends BaseClass {
	private SignInPage signInPage;

	@BeforeClass
	public void Login() {
		signInPage = new SignInPage(driver);
		driver.get("https://www.saucedemo.com/");
		signInPage.signin("standard_user", "secret_sauce");
	}

	@Story("Check list product is displayed")
	@Test(priority = 0)
	@Severity(SeverityLevel.CRITICAL)
	public void ProductListisDisplayed() {
		List<WebElement> productlist = driver.findElements(By.className("inventory_item"));

		assertTrue(productlist.size() > 0, "No product found after loggin in");
	}

	@Test(priority = 1)
	public void TestProductNameMatchBetweenDetailPage() {
		int productCount = driver.findElements(By.className("inventory_item_name")).size();
		for (int i = 0; i < productCount; i++) {
			List<WebElement> productList = driver.findElements(By.className("inventory_item_name"));
			WebElement product = productList.get(i);

			String productNameList = product.getText();

			product.click();
			String productNameDetail = driver.findElement(By.className("inventory_details_name")).getText();

			if (productNameList.equals(productNameDetail)) {
				System.out.println("Product name match: " + productNameList);
			} else {
				System.out.println(
						"Product name not match. List: " + productNameList + " | Detail: " + productNameDetail);
			}
			driver.findElement(By.id("back-to-products")).click();

		}
	}

	@Test(priority = 2)
	public void TestProductDescriptionMatchBetweenDetailPage() {
		int productCount = driver.findElements(By.className("inventory_item_desc")).size();
		for (int i = 0; i < productCount; i++) {
			List<WebElement> productList = driver.findElements(By.className("inventory_item_desc"));
			List<WebElement> productListC = driver.findElements(By.className("inventory_item_name"));
			WebElement product = productList.get(i);
			WebElement productC = productListC.get(i);

			String productDsc = product.getText();
			productC.click();
			String productDscDetail = driver.findElement(By.className("inventory_details_desc")).getText();

			if (productDsc.equals(productDscDetail)) {
				System.out.println("Product Description Match:  " + productDsc);
			} else {
				System.out.println(
						"Product Description Not Match. List:" + productDsc + " | Detail: " + productDscDetail);
			}
			driver.findElement(By.id("back-to-products")).click();
		}
	}

	@Test(priority = 3)
	public void TestProductPriceMatchBetweenDetailPage() {
		int productCount = driver.findElements(By.className("inventory_item_price")).size();
		for (int i = 0; i < productCount; i++) {
			List<WebElement> productListPrice = driver.findElements(By.className("inventory_item_price"));
			List<WebElement> productListC = driver.findElements(By.className("inventory_item_name"));
			WebElement productPrice = productListPrice.get(i);
			WebElement productC = productListC.get(i);

			String productP = productPrice.getText();
			productC.click();

			String productPriceDetail = driver.findElement(By.className("inventory_details_price")).getText();

			if (productP.equals(productPriceDetail)) {
				System.out.println("Product Price match: " + productP);
			} else {
				System.out.println("Prodcut Price not Match. List:" + productP + " | Detail: " + productPriceDetail);
			}
			driver.findElement(By.id("back-to-products")).click();
		}
	}

	@Test(priority = 4)
	public void TestProductImageMatchBetweenDetailPage() {
		int productCount = driver.findElements(By.cssSelector(".inventory_item_img img")).size();
		for (int i = 0; i < productCount; i++) {
			List<WebElement> productList = driver.findElements(By.cssSelector(".inventory_item_img img"));
			WebElement product = productList.get(i);

			String productImageList = product.getAttribute("src");

			product.click();
			String productImageDetail = driver.findElement(By.className("inventory_details_img")).getAttribute("src");

			if (productImageList.equals(productImageDetail)) {
				System.out.println("Product image match: " + productImageList);
			} else {
				System.out.println(
						"Product image not match. List: " + productImageList + " | Detail: " + productImageDetail);
			}
			driver.findElement(By.id("back-to-products")).click();

		}
	}

	@Test(priority = 5)
	public void TestAddtoCartFromProductPage()
	{
		int productCount = driver.findElements(By.xpath("//button[contains(text(),'Add to cart')]")).size();
		for(int i = 0 ; i < productCount ; i++)
		{
			List<WebElement> addButtons = driver.findElements(By.xpath("//button[contains(text(),'Add to cart')]"));
			
			addButtons.get(0).click();// quan trọng 
			
			WebElement badge = driver.findElement(By.className("shopping_cart_badge"));
			int badgeNumber = Integer.parseInt(badge.getText());

            if(badgeNumber == i + 1 ) {
            	System.out.println("Badge đúng sau lần thêm thứ: " + (i+1));
            }else {
            	System.out.println("Badge sai. expected: " + (i + 1) + " | Actual:" + badgeNumber);
            }
		}
	}
	@Test(priority = 6)
	public void TestAddtoCartFromDetailPage() throws Exception
	{
		List<WebElement> removeButtons = driver.findElements(By.xpath("//button[contains(text(),'Remove')]"));
		for(WebElement removebtn : removeButtons)
		{
			removebtn.click();
		}
		int productCount = driver.findElements(By.className("inventory_item_name")).size();
		for (int i = 0; i < productCount; i++) {
			List<WebElement> productClick = driver.findElements(By.className("inventory_item_name"));
			productClick.get(i).click();
			
			WebElement addButtons = driver.findElement(By.xpath("//button[contains(text(),'Add to cart')]"));
			addButtons.click();
			
			driver.findElement(By.id("back-to-products")).click();
			
			WebElement badge = driver.findElement(By.className("shopping_cart_badge"));
			int badgeNumber = Integer.parseInt(badge.getText());

			if (badgeNumber == i + 1) {
				System.out.println("Badge đúng sau lần thêm thứ: " + (i + 1));
			} else {
				System.out.println("Badge sai. expected: " + (i + 1) + " | Actual: " + badgeNumber);
			}
		}
		Thread.sleep(5000);
	}
	@Test(priority = 7)
	public void TestRemoveFromProductPage()
	{
		List<WebElement> removeButtons = driver.findElements(By.xpath("//button[contains(text(),'Remove')]"));
		for(WebElement removeBtn : removeButtons)
		{
			removeBtn.click();
		}
		
		int productCount =  driver.findElements(By.className("inventory_item_name")).size();
		for(int i = 0  ; i < productCount ; i++ )
		{		
			List<WebElement> addBtns = driver.findElements(By.xpath("//button[contains(text(),'Add to cart')]"));
			addBtns.get(0).click();
		}
		for(int i = 0  ; i < productCount ; i++ )
		{		
			List<WebElement> removeBtns = driver.findElements(By.xpath("//button[contains(text(),'Remove')]"));
			removeBtns.get(0).click();
			
			WebElement badge = driver.findElement(By.className("shopping_cart_badge"));
			int badgeNumber = Integer.parseInt(badge.getText());
			
			if(badgeNumber == productCount) {
				System.out.println("Badge đúng sau lần remove thứ: " + (productCount ));	
			}
			else {
				System.out.println("Badge sai. expected: " + (productCount ) + " | Actual: " + badgeNumber);
			}
		}
	}

}
