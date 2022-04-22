package KitaevaHW3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class KitaevaHW3Test4 {

        public static void main(String[] args) {

            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized");


            WebDriver driver = new ChromeDriver(options);
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            driver.get("https://www.bookvoed.ru/");

            WebElement webElement1 = driver.findElement(By.name("q"));
            WebElement webElement2 = driver.findElement(By.id("searchBar"));

            webElement1.sendKeys("туве янсон мумми троль");
            webElement2.submit();

            WebElement webElement3 = driver.findElement(By.className("hs"));

            webElement3.click();

            driver.navigate().to("https://www.bookvoed.ru/book?id=9318004");

            WebElement webElement4 = driver.findElement(By.id("book_buttons"));

            webElement4.click();

           // WebElement webElement5 = driver.findElement(By.className("Uf"));

            //webElement5.click();

            WebElement webElement6 = driver.findElement(By.id("bottom_action-bac"));

            webElement6.click();

            driver.navigate().to("https://www.bookvoed.ru/book?id=9318004");

            WebElement webElement7 = driver.findElement(By.className("Js"));

            webElement7.submit();

            driver.navigate().to("https://www.bookvoed.ru/my/cart/ishop");
            // driver.quit();

        }
    }


