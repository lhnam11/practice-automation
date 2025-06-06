package Day2_BasicofElement;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoRadioQA {
	public static void scrollToElement(WebDriver driver, WebElement element)
	{
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoview(true)", element); 
		// nếu trường hợp bạn không thể bị khuất quảng cáo có thể sử dụng này thường dùng các trường hợp sổ xuống phần tử 
	}
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\LeHoaiNam\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/radio-button");
		Thread.sleep(2000);
		
		WebElement yesRadio = driver.findElement(By.xpath("//label[normalize-space()='Yes']"));
		yesRadio.click();
		Thread.sleep(2000);
		

		WebElement yesInput = driver.findElement(By.id("yesRadio"));
		if(yesInput.isSelected()){
			System.out.println("Radio Yes vừa được check");
		}else {
			System.out.println("Radio Yes chưa được check");
		}
		Thread.sleep(2000);
		WebElement impressiveRadio = driver.findElement(By.cssSelector("label[for='impressiveRadio']"));
	    impressiveRadio.click();
	    
	    WebElement noRadio = driver.findElement(By.id("noRadio"));
	    
	    String dissabledAtr = noRadio.getAttribute("disabled"); // kiểm tra thuộc tính 
	    if(dissabledAtr != null)
	    {
	    	System.out.println("Radio no đã được khóa vì có thuộc tính disabled");
	    }
	    if(noRadio.isEnabled()) {
	    	System.out.println("No radio đang bật ");
	    }else {
	    	System.out.println("No radio đã khóa ");
	    }
	    
	    
	    WebElement resultText = driver.findElement(By.className("text-success"));
	    String actualText = resultText.getText();
	    if(actualText.equals("Yes"))
	    {
	    	System.out.println("Click radio Yes thành công ");
	    }
	    else if(actualText.equals("Impressive"))
	    {
	    	System.out.println("Click radio Impressive thành công");
	    }else {
	    	System.out.println("bạn chưa click vào bất kỳ radio nào ");
	    }
	    Thread.sleep(2000);
		driver.quit();

		
	}

}
