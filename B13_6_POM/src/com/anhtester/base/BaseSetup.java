package com.anhtester.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseSetup {

	private WebDriver driver; // khi private cái webdriver thì mình phải khởi tạo get để các class khác cần thì sử dụng 
	// nếu đã public webdriver thì không cần sử dụng  getDriver bên dưới
	
	static String driverPath = "resources\\drivers\\";

	public WebDriver getDriver() {
		return driver;
	}

	//Hàm này để tùy chọn Browser. Cho chạy trước khi gọi class này (BeforeClass)
	private void setDriver(String browserType, String appURL) {
		switch (browserType) {
		case "chrome":
			driver = initChromeDriver(appURL);
			break;
		case "firefox":
			driver = initFirefoxDriver(appURL);
			break;
		default:
			System.out.println("Browser: " + browserType + " is invalid, Launching Chrome as browser of choice...");
			driver = initChromeDriver(appURL);
		}
	}

	
	//Khởi tạo cấu hình của các Browser để đưa vào Switch Case
	
	private static WebDriver initChromeDriver(String appURL) {
		System.out.println("Launching Chrome browser...");
		System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(appURL);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}

	private static WebDriver initFirefoxDriver(String appURL) {
		System.out.println("Launching Firefox browser...");
		System.setProperty("webdriver.gecko.driver", driverPath + "geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to(appURL);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		return driver;
	}

	// Chạy hàm initializeTestBaseSetup trước hết khi class này được gọi
	@Parameters({ "browserType", "appURL" })
	@BeforeClass
	public void initializeTestBaseSetup(String browserType, String appURL) {
		try {
			// Khởi tạo driver và browser
			setDriver(browserType, appURL);
		} catch (Exception e) {
			System.out.println("Error..." + e.getStackTrace());
		}
	}

	@AfterClass
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}
}
