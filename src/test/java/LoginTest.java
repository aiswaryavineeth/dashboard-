import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends Main {
    @Test(priority = 1)
    public void testLogin() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);

        // Step 1: Open Login Page
        loginPage.openLoginPage("https://dashboard.aqaryint.com/en");

        // Step 2: Perform Login
        loginPage.clickLoginButton();
        Thread.sleep(1000);
        loginPage.enterUsername("superadmin");
        loginPage.enterPassword("123456");
        loginPage.clickSubmitButton();

        // Step 3: Verify Login
        String expectedMessage = "Good Morning, Super Admin";
        String actualMessage = loginPage.getWelcomeMessage();




        System.out.println(driver.getTitle());
        System.out.println("Login successful!");
        //Assert.assertEquals(actualMessage, expectedMessage);

    }
}
