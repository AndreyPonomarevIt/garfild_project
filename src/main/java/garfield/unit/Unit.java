package garfield.unit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

    public  class Unit {
    public static void waitTimeFor(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
        public static void waitForPresenceElementByXPath(WebDriver driver, String xPath, int millis) {
            new WebDriverWait(driver, Duration.ofMillis(millis))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath(xPath)));
        }
}
