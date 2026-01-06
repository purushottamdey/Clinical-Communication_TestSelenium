package myApp.util;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;
import java.util.logging.Logger;

import static myApp.hook.Hooks.driver;

public class Utilities {
    Alert alert;
    WebDriverWait wait;
    Logger logger = Logger.getLogger(Utilities.class.getName());

    public void sendKey(WebDriver driver, By locator, String value) {
        try {
            waitAndFindElement(driver, locator, Duration.ofSeconds(2));
            driver.findElement(locator).sendKeys(value);
        } catch (RuntimeException e) {
            logger.info("locator not found");
            throw new RuntimeException(e);
        }
    }

    public void doClick(WebDriver driver, By locator) {
        try {
            waitAndFindElement(driver, locator, Duration.ofSeconds(2));
            driver.findElement(locator).click();
            logger.info("Clicked on element %s".formatted(locator.toString()));

        } catch (RuntimeException e) {
            logger.info("locator not found");
            throw new RuntimeException(e);
        }
    }

    public WebElement waitAndFindElement(WebDriver driver, By locator, Duration timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public WebElement findElement(WebDriver driver, By locator) {
        waitAndFindElement(driver, locator, Duration.ofSeconds(10));
        return driver.findElement(locator);
    }

    public String getAlertText() {
        alert = driver.switchTo().alert();
        return alert.getText();
    }
}
