package Bai10_6AlertPopupIframe;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Initialization.Init;

public class Popup extends Init {
    @Test
    public void PopupWindowDemo()
    {
    	driver.get("https://demoqa.com/browser-windows");
    	
        driver.findElement(By.id("windowButton")).click();
        
        // lưu lại lớp windown đầu tiên - mã ID hơi dài
        String MainWindow = driver.getWindowHandle();
        System.out.println(MainWindown);
        
        //Get allnew open Window.
        //set là một collection không thể chứa các ký tự trùng lợp 
        
    }

}
