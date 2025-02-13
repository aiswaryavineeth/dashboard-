import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddProject extends Main {
    private By projectstab= By.xpath("//span[normalize-space()='Projects']");
    private By addproject= By.xpath("//span[normalize-space()='Add Project']");
    private By projectName = By.name("project_name");
    private By licenseNumber = By.name("license_no");
    private By projectNumber = By.name("project_no");
    private By startingPrice = By.name("starting_price");

    public AddProject(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public void projecttab()
    {
        driver.findElement(projectstab).click();

    }
    public void addproject(){
        driver.findElement(addproject).click();
    }

    public void enterProjectName(String name) {
        driver.findElement(projectName).sendKeys(name);
    }

    public void enterLicenseNumber(String license) {
        driver.findElement(licenseNumber).sendKeys(license);
    }

    public void enterProjectNumber(String number) {
        driver.findElement(projectNumber).sendKeys(number);
    }

    public void enterStartingPrice(String price) {
        driver.findElement(startingPrice).sendKeys(price);
    }
}
