import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddProject extends Main {
    private By projectsTab = By.xpath("//span[normalize-space()='Projects']");
    private By addProject = By.xpath("//span[normalize-space()='Add Project']");
    private By projectName = By.name("project_name");
    private By licenseNumber = By.name("license_no");
    private By projectNumber = By.name("project_no");
    private By startingPrice = By.name("starting_price");
    private By DeveloperCompany = By.xpath("//input[@placeholder='Developer Company']");
   // private By firstOption = By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and normalize-space(text())='OMNIYAT']");
    private By country= By.xpath("//*[@placeholder='Select Country']");
    private By state= By.xpath("//*[@placeholder='Select State']");
    private By city= By.xpath("//*[@placeholder='Select City']");
    private By community= By.xpath("//*[@placeholder='Select Community']");
    private By subcommunity= By.xpath("//*[@placeholder='Select Sub Community']");

    public AddProject(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Generic method to wait for an element to be clickable and then click it
    public void clickWhenReady(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    // Generic method to wait for an element to be visible and then send keys
    private void enterTextWhenReady(By locator, String text) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(text);
    }

    public void openProjectsTab() {
        clickWhenReady(projectsTab);
    }

    public void clickAddProject() {
        clickWhenReady(addProject);
    }

    public void enterProjectName(String name) {
        enterTextWhenReady(projectName, name);
    }

    public void enterLicenseNumber(String license) {
        enterTextWhenReady(licenseNumber, license);
    }

    public void enterProjectNumber(String number) {
        enterTextWhenReady(projectNumber, number);
    }

    public void enterStartingPrice(String price) {
        enterTextWhenReady(startingPrice, price);
    }
    public void devopercompany(String devop){
        enterTextWhenReady(DeveloperCompany,devop);
     //   wait.until(ExpectedConditions.presenceOfElementLocated(firstOption));

        // Click the first option
     //   clickElement(firstOption);

    }
    public void clickElement(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).click();
    }
    public void selectcountry(String cou){
        enterTextWhenReady(country,cou);
    }
    public void selectstate(String st){
        enterTextWhenReady(state,st);
    }
    public void selectcity(String ct){
        enterTextWhenReady(city,ct);
    }
    public void selectcommunity(String comm){
        enterTextWhenReady(community,comm);
    }
    public void selectsubcommunity(String subcom){
        enterTextWhenReady(subcommunity,subcom);
    }
}
