package UserInteractions;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Initialization.Init;

public class RobotClass extends Init {
	@Test
	public void inputSearch() throws AWTException, Exception
	{
		driver.get("https://anhtester.com/");
		
		Thread.sleep(1000);
		
		Robot robot = new Robot();
		
		WebElement inputCourseElement = driver.findElement(By.name("key"));
		inputCourseElement.click();
		
		robot.keyPress(KeyEvent.VK_T);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_S);
		robot.keyPress(KeyEvent.VK_T);
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		
	}
	
}
