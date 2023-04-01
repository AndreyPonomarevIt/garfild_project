package it.academy.andrey.ponomarev.garfield.project.tests.ui;

import it.academy.andrey.ponomarev.garfield.project.driver.DriverSetup;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

import static it.academy.andrey.ponomarev.garfield.project.user.UserData.URL_GARFIELD_BY;

public class BaseTest {
    @BeforeEach
    public void initObject() {
        WebDriver driver = DriverSetup.createDriver();
        driver.get(URL_GARFIELD_BY);
    }
    @AfterEach
    public void closeDriver() {
        DriverSetup.closeDriver();
    }
}
