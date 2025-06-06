package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	public static WebDriver openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\LeHoaiNam\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
}
