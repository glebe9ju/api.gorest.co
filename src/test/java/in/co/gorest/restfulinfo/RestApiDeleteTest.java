package in.co.gorest.restfulinfo;

import in.co.gorest.restfulinfo.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class RestApiDeleteTest extends TestBase {

    @Test
    public void deleteUserRecord() {
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authoriation","Bearer 536ea844ae5b2495510205bd3d00e91048cec1a3a7d9b7c888c81773be1f1954")
                .pathParam("id", 10816)
                .when()
                .delete("/{id}");
        response.prettyPrint();
        response.then().statusCode(204);
    }
}
