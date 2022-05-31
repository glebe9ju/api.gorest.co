package in.co.gorest.restfulinfo;

import in.co.gorest.model.TokenPojo;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class CreateBearerToken {

    String bearerToken;

    public String gettingBearerToken(){
        TokenPojo tokenPojo = new TokenPojo();
        tokenPojo.setBearerToken("536ea844ae5b2495510205bd3d00e91048cec1a3a7d9b7c888c81773be1f1954");
        Response response = given()
                .header("Content-Type", "application/json")
                .body(tokenPojo)
                .when()
                .post();
        response.then().statusCode(200);
        bearerToken = (response.path("BearerToken"));
        response.prettyPrint();
        return bearerToken;

    }

}
