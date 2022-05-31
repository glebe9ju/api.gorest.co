package in.co.gorest.restfulinfo;

import in.co.gorest.restfulinfo.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class RestApiGetTest extends TestBase {
    @Test
    public void getAllIDInfo() {
        Response response = given()
                .when()
                .get();
        response.prettyPrint();
        response.then().statusCode(200);
    }


}