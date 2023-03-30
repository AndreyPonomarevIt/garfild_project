package it.academy.andrey.ponomarev.garfield.project.unit;

import it.academy.andrey.ponomarev.garfield.project.driver.DriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static it.academy.andrey.ponomarev.garfield.project.constants.Constants.EXPLICITLY;

public  class Unit {
    public static void waitTimeFor(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
        public static void waitPresenceElement(String xPath) {
            new WebDriverWait(DriverSetup.driver, Duration.ofSeconds(EXPLICITLY)).
                    until(ExpectedConditions.
                            presenceOfElementLocated(By.xpath(xPath)));
        }
        public static void waitVisibilityOf(WebElement element){
            new WebDriverWait(DriverSetup.driver, Duration.ofSeconds(EXPLICITLY)).until(ExpectedConditions.
                    visibilityOfAllElements(element));
        }
    public static void waitStalenessOf(WebElement element){
        new WebDriverWait(DriverSetup.driver, Duration.ofSeconds(EXPLICITLY)).until(ExpectedConditions.
                stalenessOf(element));
    }



}
