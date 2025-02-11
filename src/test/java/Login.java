import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends Main {
    @Test(priority=1)
    public void login(){
        driver.get("http://192.168.1.193:3000");
        clicked(By.xpath("//*[@id=\"main\"]/div/div/div[2]/a/button"));
        enterText(By.xpath("//input[@id=':r0:']"), "superadmin");
        enterText(By.name("password"), "123456");
        clicked(By.xpath("/html/body/div/div[2]/form/button"));
        String expected = "Good Evening, Super Admins";
        WebElement welcome = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='user MuiBox-root mui-0']")));
        String wel = welcome.getText();
        Assert.assertEquals(wel,expected);

    }
}
