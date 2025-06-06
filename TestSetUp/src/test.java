import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	public static void main(String[] args) throws InterruptedException {
		// Đặt đường dẫn driver
        System.setProperty("webdriver.chrome.driver", "D:\\LeHoaiNam\\Selenium\\chromedriver.exe");

        // Tạo đối tượng trình duyệt
        WebDriver driver = new ChromeDriver();

        // Mở trang login
        driver.get("https://practicetestautomation.com");

        // Maximize cửa sổ trình duyệt
        driver.manage().window().maximize();

        // Nhập email
        WebElement emailInput = driver.findElement(By.id("email"));
        emailInput.sendKeys("saiemail@gmail.com");

        // Nhập mật khẩu
        WebElement passwordInput = driver.findElement(By.id("passwd"));
        passwordInput.sendKeys("saimatkhau");

        // Click nút Sign in
        WebElement signInButton = driver.findElement(By.id("SubmitLogin"));
        signInButton.click();

        // Chờ 2s
        Thread.sleep(2000);

        // In ra thông báo lỗi nếu có
        WebElement errorBox = driver.findElement(By.xpath("//div[@class='alert alert-danger']//li"));
        System.out.println("Thông báo lỗi: " + errorBox.getText());

        // Đóng trình duyệt
        driver.quit();
	}
}
