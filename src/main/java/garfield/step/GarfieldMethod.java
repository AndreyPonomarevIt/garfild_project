package garfield.step;

import org.openqa.selenium.WebDriver;

import static garfield.page.GarfieldPage.*;
import static garfield.text.GarfieldText.EMAIL;
import static garfield.text.GarfieldText.PASSWORD;

public class GarfieldMethod extends GarfieldStep {
    public GarfieldMethod(WebDriver driver) {
        super(driver);
    }

    public void openPage() {


  }
  public GarfieldMethod inputEmailPassword (String email, String password) {
      driver.findElement(BUTTON_CLICK_LOGIN).click();
      driver.findElement(BUTTON_CLICK_ENTER).click();
      driver.findElement(BUTTON_CLICK_LOGIN_FROM_EMAIL).click();
      driver.findElement(FIELD_CLICK_LOGIN_FROM_EMAIL).sendKeys(email);
      driver.findElement(FIELD_CLICK_LOGIN_FROM_PASSWORD).sendKeys(password);
      driver.findElement(CLICK_BUTTON_ENTER_WITH_FILL_DATA).click();
      return this;
  }
}
