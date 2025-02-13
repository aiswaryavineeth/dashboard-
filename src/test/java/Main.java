import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class Main {
    protected static WebDriver driver;  // Make it static
    protected static WebDriverWait wait;

    @BeforeTest
    public void setup() {
        if (driver == null) {  // Prevent reinitialization
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        }
    }

    @AfterTest
    public void teardown() throws InterruptedException {
        Thread.sleep(2000);
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
