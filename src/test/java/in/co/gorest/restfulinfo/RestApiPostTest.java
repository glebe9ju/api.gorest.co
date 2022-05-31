package in.co.gorest.restfulinfo;

import in.co.gorest.model.GoRestPojo;
import in.co.gorest.restfulinfo.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class RestApiPostTest extends TestBase {

    @Test
    public void createUserTest() {
        GoRestPojo goRestPojo = new GoRestPojo();

        goRestPojo.setName("Nasara Polo");
        goRestPojo.setGender("Female");
        goRestPojo.setEmail("nehal19@gmail.com");
        goRestPojo.setStatus("active");

        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization","Bearer 536ea844ae5b2495510205bd3d00e91048cec1a3a7d9b7c888c81773be1f1954")
                .body(goRestPojo)
                .when()
                .post();
        response.prettyPrint();
        response.then().statusCode(201);

    }

}




