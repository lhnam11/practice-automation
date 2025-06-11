package Bai10_6AlertPopupIframe;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Initialization.Init;

public class Iframe extends Init{

    @Test
    public void iFrame01() throws InterruptedException {

        driver.navigate().to("https://demoqa.com/frames");
        
        driver.switchTo().frame("frame2");
        String content = driver.findElement(By.id("sampleHeading")).getText();
        
        System.out.println("Nội dung trong iframe: " + content);
        
        driver.switchTo().defaultContent();
    }
}
