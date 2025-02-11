import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Login extends Main {
    @Test(priority=1)
    public void login(){
        driver.get("http://192.168.1.193:3000");
    clicked(By.xpath("//*[@id=\"main\"]/div/div/div[2]/a/button"));
    enterText(By.xpath("//input[@id=':r0:']\"), \"superadmin"));

    }
}
