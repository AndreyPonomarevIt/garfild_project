package it.academy.andrey.ponomarev.garfield.project.tests.api;


import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static it.academy.andrey.ponomarev.garfield.project.user.UserData.URL;

public class GarfieldTestApi {


/*
    @Test
    public void testPostGarfieldCorrectDate() {
        String body = "{\"STATE\":\"SUCCESS\"}";
        String url = URL + "?login=yes";
            given().contentType("application/json").when()
                    .post(url).then().assertThat().statusCode(200).body(Matchers.equalTo(body));
    }

    @Test
    public void testPostGarfieldNotCorrectDate() {
        WebDriver driver = new ChromeDriver();
        String body = "{\"STATE\":\"FAILURE\",\"INCORRECT_FIELDS\":[\"email\",\"password\"]}";
        String url = "https://garfield.by/";
        given().queryParam("?login=yes").contentType("application/json").body(body).
                when().post(url + "?login=yes").
                then().assertThat().statusCode(200).body(Matchers.equalTo(body));
    }

 */
 
    @Test
    public void testGetRequest() {
        String url = "https://garfield.by";
                when()
                .get(url).
                then().
                        statusCode(200);
    }

}
