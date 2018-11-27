package RestExamples;

import static org.hamcrest.CoreMatchers.containsString;

import static com.jayway.restassured.RestAssured.given;

import org.testng.annotations.Test;

/*
GET URL : https://reqres.in/api/users/2

 */

public class SimpleRestCallsRestAssured {

    @Test
    public void makeSureThatGoogleIsUp() {
        String expectedJson = "{\"data\":{\"id\":2,\"first_name\":\"Janet\",\"last_name\":\"Weaver\",\"avatar\":\"https://s3.amazonaws.com/uifaces/faces/twitter/josephstein/128.jpg\"}}";
        String getEndPoint = "https://reqres.in/api/users/2";
        given().when().get(getEndPoint).then().statusCode(200);
        given().when().get(getEndPoint).then().body(containsString("Janet"));
    }

}
