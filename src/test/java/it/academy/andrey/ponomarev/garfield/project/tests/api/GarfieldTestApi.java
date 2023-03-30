package it.academy.andrey.ponomarev.garfield.project.tests.api;

import it.academy.andrey.ponomarev.garfield.project.tests.ui.LoginTest;
import io.restassured.RestAssured;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static io.restassured.RestAssured.given;

public class GarfieldTestApi extends LoginTest {
    @Test
    public void testPostGarfieldCorrectDate() {
           String body = "{\"STATE\":\"SUCCESS\"}";
        String url = "https://garfield.by/";
            RestAssured.given().queryParam("?login=yes").contentType("application/json").body(body).
                    when().post(url + "?login=yes").
                    then().assertThat().statusCode(200).body(Matchers.equalTo(body));
    }

    @Test
    public void testPostGarfieldNotCorrectDate() {
        WebDriver driver = new ChromeDriver();
        String body = "{\"STATE\":\"FAILURE\",\"INCORRECT_FIELDS\":[\"email\",\"password\"]}";
        String url = "https://garfield.by/";
        RestAssured.given().queryParam("?login=yes").contentType("application/json").body(body).
                when().post(url + "?login=yes").
                then().assertThat().statusCode(200).body(Matchers.equalTo(body));
    }

    @Test
    public void testPostGarfieldInputProduct() {
        String url = "https://garfield.by/local/ajax/getMultisearch_new.php";
                RestAssured.given().when()
                .post(url).
                then().statusCode(200).log().body();
    }
}
