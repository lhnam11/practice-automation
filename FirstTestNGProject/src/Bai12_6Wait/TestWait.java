package Bai12_6Wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Initialization.Init;

public class TestWait extends Init {
	
	@Test
	public void DmWait()
	{
		driver.get("https://anhtester.com/");
		
		WebDriverWait wait = new WebDriverWait(driver, 2);
		
		// đợi nó tìm thấy 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn-login")));
		// đợi nó click được 
		WebElement btn = driver.findElement(By.id("btn-login"));
		WaitAndClick(btn, 1);
		
		
		
	}
	public void WaitAndClick(WebElement element, int timeOut)
	{
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}




   
}
