import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LoginPage extends Main {

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Locators
    private By loginButton = By.xpath("//*[@id=\"main\"]/div/div/div[2]/a/button");
    private By usernameField = By.xpath("//input[@id=':r0:']");
    private By passwordField = By.name("password");
    private By submitButton = By.xpath("/html/body/div/div[2]/form/button");
    private By welcomeMessage = By.xpath("//div[@class='user MuiBox-root mui-0']");

    // Actions
    public void openLoginPage(String url) {
        driver.get(url);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickSubmitButton() {
        driver.findElement(submitButton).click();
    }


    public String getWelcomeMessage() {
        WebElement welcome = wait.until(ExpectedConditions.visibilityOfElementLocated(welcomeMessage));
        return welcome.getText();
    }
}
