package it.academy.andrey.ponomarev.garfield.project.util;

import it.academy.andrey.ponomarev.garfield.project.driver.DriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static it.academy.andrey.ponomarev.garfield.project.constants.Constants.EXPLICITLY;

public  class Util {
    public static void waitTimeFor(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static boolean waitPresenceOfElement(By.ByXPath locator) {
        WebDriverWait webDriverWait = new WebDriverWait(DriverSetup.driver, Duration.ofSeconds(EXPLICITLY));
        try {
            webDriverWait.until(
                    ExpectedConditions
                            .presenceOfElementLocated(locator));
            return true;
        } catch (Exception exception) {
            return false;
        }
    }
    public static boolean waitStalenessOf(WebElement element) {
        try {
            new WebDriverWait(DriverSetup.driver, Duration.ofSeconds(EXPLICITLY))
                    .until(ExpectedConditions
                            .stalenessOf(element));
            return true;
        }catch (Exception exception){
            return false;
        }
    }
}
