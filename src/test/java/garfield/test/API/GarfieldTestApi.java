package garfield.test.API;

import garfield.test.UI.GarfieldTestUI;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GarfieldTestApi extends GarfieldTestUI {
    @Test
    public void testPostGarfieldNotCorrectDate() {
           String body = "{\"STATE\":\"SUCCESS\"}";
        String url = "https://garfield.by/";
            given().queryParam("?login=yes").contentType("application/json").body(body).
                    when().post(url + "?login=yes").
                    then().assertThat().statusCode(200).body(equalTo(body));

        }


    @Test
    public void testPostGarfieldInputProduct() {
        String url = "https://garfield.by/local/ajax/getMultisearch_new.php";
                given().when()
                .post(url).
                then().statusCode(200).log().body();

    }
}
