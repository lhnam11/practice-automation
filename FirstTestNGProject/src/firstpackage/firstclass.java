package firstpackage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class firstclass {
	@Test (groups = "smoke")
	public void FirstMethod() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\LeHoaiNam\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("    ");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		
		Thread.sleep(5000);
		driver.quit();
	}
	
	@Test(groups = "regression")
	public void SecondtMethod()
	{
		System.out.println("This is Second Method of first class");
		assertEquals("hoainam", "lehoainam");
	}
}
