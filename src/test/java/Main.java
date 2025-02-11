import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

import static java.awt.SystemColor.text;

public class Main {
public static WebDriver driver;
public static WebDriverWait wait;
@BeforeSuite
    public void setUpsuit(){
    driver = new ChromeDriver();
    wait=new WebDriverWait(driver, Duration.ofSeconds(20));
}
@AfterSuite
    public void tearDown() throws InterruptedException{
    if(driver!= null){
        Thread.sleep(3000);
        driver.quit();
    }
}
public void clicked(By locator)
{
    WebElement element=wait.until(ExpectedConditions.elementToBeClickable(locator));
    element.click();
}
public void enterText(By locator, String number)
{
    WebElement element= wait. until(ExpectedConditions.elementToBeClickable(locator));
    element.sendKeys(number);
}
}

