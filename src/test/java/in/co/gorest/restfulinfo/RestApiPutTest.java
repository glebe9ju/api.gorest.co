package in.co.gorest.restfulinfo;

import in.co.gorest.model.GoRestPojo;
import in.co.gorest.restfulinfo.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class RestApiPutTest extends TestBase {

        @Test
        public void updateEmployeesWithPut() {
                GoRestPojo goRestPojo = new GoRestPojo();

                goRestPojo.setName("Bianaca Patric");
                goRestPojo.setGender("Female");
                goRestPojo.setEmail("Bianca16@yahoo.com");
                goRestPojo.setStatus("active");
                Response response = given()
                        .header("Content-Type", "application/json")
                        .header("Authorization","Bearer 536ea844ae5b2495510205bd3d00e91048cec1a3a7d9b7c888c81773be1f1954")
                        .pathParam("id", 9345)
                        .body(goRestPojo)
                        .when()
                        .put("/{id}");

                response.prettyPrint();
                response.then().statusCode(200);
        }
}
