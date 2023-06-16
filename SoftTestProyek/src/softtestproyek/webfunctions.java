package softtestproyek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webfunctions {
    public static void theme(WebDriver driver){
        WebElement seting = driver.findElement(By.xpath("//p[normalize-space()='Settings']"));
        seting.click();
        WebElement theme = driver.findElement(By.xpath("//a[@href='https://gruplm.com/user/theme/version']"));
        theme.click();
        WebElement two = driver.findElement(By.xpath("//img[@src='https://gruplm.com/assets/front/img/user/templates/home_two.png']"));
        two.click();
        WebElement update = driver.findElement(By.xpath("//button[@id='submitBtn']"));
        update.click();
    }
}
