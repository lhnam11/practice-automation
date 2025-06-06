package Day1_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openBrowser {

	  protected static WebDriver driver;
	 
	  public static void setupBrowser() {
	        System.setProperty("webdriver.chrome.driver", "D:\\LeHoaiNam\\Selenium\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.navigate().to("https://anhtester.com");
	    }
}
