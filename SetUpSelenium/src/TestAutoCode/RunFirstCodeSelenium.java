package TestAutoCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.*;
public class RunFirstCodeSelenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\LeHoaiNam\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// 1- Maximize browser
		driver.manage().window().maximize();
		// 2- Đi đến url\
		driver.navigate().to("https://anhtester.com");
		// 3- Lấy title và in ra console
		System.out.println("Title trang web: " + driver.getTitle());
		// 4- Lấy URL hiện tại
		System.out.println("URL hiện tại: " + driver.getCurrentUrl());
		// 12- Đóng trình duyệt sau 5 giây
		Thread.sleep(2000);
		
		// Đối tượng của Ư
		driver.quit();
	}

}
