package TestAutoCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

//import org.openqa.selenium.*;
public class RunFirstCodeSelenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\LeHoaiNam\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// 1- Maximize browser
		driver.manage().window().maximize();
		// 2- Đi đến url\
		driver.get("https://www.saucedemo.com/");

        // Login
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        // Chọn dropdown "Price (low to high)"
        Select sortDropdown = new Select(driver.findElement(By.className("product_sort_container")));
        sortDropdown.selectByVisibleText("Price (low to high)");

        // Lấy danh sách giá sản phẩm sau khi sắp xếp
        List<WebElement> priceElements = driver.findElements(By.className("inventory_item_price"));

        List<Double> actualPrices = priceElements.stream()
                .map(el -> Double.parseDouble(el.getText().replace("$", "")))
                .collect(Collectors.toList());

        // Tạo danh sách đã sort để so sánh
        List<Double> expectedSortedPrices = new ArrayList<>(actualPrices);
        Collections.sort(expectedSortedPrices); // Sắp xếp tăng dần

        // So sánh
        Assert.assertEquals(actualPrices, expectedSortedPrices);

        driver.quit();
	}

}
