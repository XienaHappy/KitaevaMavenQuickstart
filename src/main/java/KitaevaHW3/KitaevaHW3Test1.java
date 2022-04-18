package KitaevaHW3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;


public class KitaevaHW3Test1 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");


        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.bookvoed.ru/");

        WebElement webElement1 = driver.findElement(By.id("h_cab"));

        webElement1.click();

        driver.navigate().to("https://www.bookvoed.ru/my/auth?backTo=%2Fmy");

        WebElement webElement2 = driver.findElement(By.id("auth_form-login-input"));
        WebElement webElement3 = driver.findElement(By.id("auth_form-password-input"));


        webElement2.sendKeys("mariaivanova2022rus@mail.ru");
        webElement3.sendKeys("2022!+MI");

        WebElement webElement4 =driver.findElement(By.className("rv"));

        webElement4.click();

        // driver.quit();
    }
}
