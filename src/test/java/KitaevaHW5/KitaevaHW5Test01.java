package KitaevaHW5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class KitaevaHW5Test01 extends AbstractTest {

    @Test

    void myActiontest() throws InterruptedException {
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("https://www.bookvoed.ru/"));
        Assertions.assertTrue(getDriver().getTitle().contains("книги"), "The main page of the website is not found.");
//
//        WebElement webElement1 = driver.findElement(By.name("q"));
//        WebElement webElement2 = driver.findElement(By.id("searchBar"));
//
//        webElement1.sendKeys("китайский язык");
//        webElement2.submit();

        Actions search = new Actions(getDriver());

        search.click(getDriver().findElement(By.name("q")))
                .pause(1000l)
                .sendKeys(getDriver().findElement(By.id("searchBar")),"китайский язык")
                .click(getDriver().findElement(By.className("cu")))
                .pause(1000l)
                .build()
                .perform();

            Thread.sleep(1000);


            JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
            long windowWidth = (long) jsExecutor.executeScript("return window.innerWidth");
            jsExecutor.executeScript("window.scrollBy(0,800)");

            Thread.sleep(1000);

        }

    }
