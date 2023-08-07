import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;
import java.time.Duration;
import java.util.List;
import static java.awt.SystemColor.text;

public class selenium {
    String str=("Performance");
    public static void main(String[] args)  {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.get("https://www.facebook.com/login/");
        driver.manage().window().maximize();
        PageFactory.initElements(driver,pom.class);
        pom.username.sendKeys("asdfghjk");
        pom.password.sendKeys("mnbvcx");
        pom.login.click();


            }
        }

