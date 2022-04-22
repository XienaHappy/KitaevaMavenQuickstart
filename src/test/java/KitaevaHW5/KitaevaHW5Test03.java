package KitaevaHW5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class KitaevaHW5Test03 extends AbstractTest {

    @Test

    void myActiontest() throws InterruptedException {
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("https://www.bookvoed.ru/"));
        Assertions.assertTrue(getDriver().getTitle().contains("книги"), "The main page of the website is not found.");


        WebElement webElement1 = driver.findElement(By.id("h_cab"));

        webElement1.click();

        driver.navigate().to("https://www.bookvoed.ru/my/auth?backTo=%2Fmy");

//        WebElement webElement2 = driver.findElement(By.id("auth_form-login-input"));
//        WebElement webElement3 = driver.findElement(By.id("auth_form-password-input"));
//
//
//        webElement2.sendKeys("ivanivanov@mail.ru");
//        webElement3.sendKeys("12345678+");
//
//        WebElement webElement4 =driver.findElement(By.className("rv"));
//
//        webElement4.click();
        Actions search = new Actions(getDriver());

        search.click(getDriver().findElement(By.id("auth_form-login-input")))
                .pause(1000l)
                .sendKeys(getDriver().findElement(By.id("auth_form-login-input")),"ivanivanov@mail.ru")
                .pause(1000l)
                .sendKeys(getDriver().findElement(By.id("auth_form-password-input")),"12345678+")
                .click(getDriver().findElement(By.className("rv")))
                .pause(1000l)
                .build()
                .perform();
        Thread.sleep(1000);

    }


}
