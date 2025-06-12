package Initialization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Init {
	public WebDriver driver;
	@BeforeTest
	public void Setup()
	{
		 System.setProperty("webdriver.chrome.driver", "D:\\LeHoaiNam\\Selenium\\chromedriver.exe");
		 driver = new ChromeDriver();
//		 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		 driver.manage().window().maximize();

	}
	@AfterTest
	public void TearDown() throws Exception
	{
		Thread.sleep(2000);
		driver.quit();
	}

}
