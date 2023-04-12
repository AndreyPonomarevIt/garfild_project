package it.academy.andrey.ponomarev.garfield.project.tests.api;


import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static it.academy.andrey.ponomarev.garfield.project.user.UserData.URL;

public class GarfieldTestApi {

    @Test
    public void testPostGarfieldNotCorrectDate() {
        HashMap fParams = new HashMap();
        fParams.put("USER_LOGIN","7777777@gmail.com");
        fParams.put("USER_PASSWORD","фывываыа");
        fParams.put("backurl","/");
        fParams.put("AUTH_FORM","Y");
        fParams.put("TYPE","AUTH");
        String body = "{\"STATE\":\"SUCCESS\"}";
        String url = "https://garfield.by/?login=yes";
        given().formParams(fParams).contentType("application/json").
                when().post(url).
                then().log().body();                 //assertThat().statusCode(200).body(Matchers.equalTo(body));
    }

    @Test
    public void testGetRequest() {
        String url = "https://garfield.by";
                when()
                .get(url).
                then().
                        statusCode(200);
    }
}
