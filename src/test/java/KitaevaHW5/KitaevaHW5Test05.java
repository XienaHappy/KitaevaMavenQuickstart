package KitaevaHW5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class KitaevaHW5Test05 extends AbstractTest {

    @Test

    void myActiontest() throws InterruptedException {
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("https://www.bookvoed.ru/"));
        Assertions.assertTrue(getDriver().getTitle().contains("книги"), "The main page of the website is not found.");


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

        Thread.sleep(1000);

    }


}
