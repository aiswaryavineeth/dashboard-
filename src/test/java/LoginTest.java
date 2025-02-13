import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends Main {
    @Test(priority = 1)
    public void testLogin() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);

        // Step 1: Open Login Page
        loginPage.openLoginPage("http://192.168.1.193:3000");

        // Step 2: Perform Login
        loginPage.clickLoginButton();
        Thread.sleep(1000);
        loginPage.enterUsername("superadmin");
        loginPage.enterPassword("123456");
        loginPage.clickSubmitButton();

        // Step 3: Verify Login
        String expectedMessage = "Good Morning, Super Admin";
        String actualMessage = loginPage.getWelcomeMessage();
        Assert.assertEquals(actualMessage, expectedMessage);

        System.out.println(driver.getTitle());
        System.out.println("Login successful!");

    }
}
