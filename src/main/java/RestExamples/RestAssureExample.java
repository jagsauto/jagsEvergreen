package RestExamples;

import org.json.JSONObject;
import org.testng.annotations.Test;

import java.net.URI;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.StringContains.containsString;

public class RestAssureExample {
    String getJsonExample = "http://ergast.com/api/f1/2017/circuits.json";


    @Test
    public void makeSureThatGoogleIsUp() {
        given().when().get("http://www.google.com").then().statusCode(200);
    }

    @Test
    public void verifyNameOfGarage() {

        given().when().get(getJsonExample).then()
                .body(containsString("Acme garage"));
    }

    @Test
    public void givenUrl_whenSuccessOnGetsResponseAndJsonHasRequiredKV_thenCorrect() {

        given().when().get(getJsonExample).then().statusCode(200);

        //given().when().get(getJsonExample).body().

    }


    @Test
    public void test_NumberOfCircuitsFor2017Season_ShouldBe20() {

        given().
                when().
                get("http://ergast.com/api/f1/2017/circuits.json").
                then().
                assertThat().
                //body("MRData.CircuitTable.Circuits.circuitId",hasSize(20));
                       //https://github.com/rest-assured/rest-assured/wiki/Usage
                        //equalTo
                                //is(12.12f)
                                        //body(matchesJsonSchemaInClasspath("products-schema.json"))
                                             //   body(matchesJsonSchemaInClasspath("products-schema.json").using(jsonSchemaFactory));

                                                   //  .body("greeting.firstName", equalTo("John"), "greeting.lastName", equalTo("Doe"));

                                                     body("MRData.CircuitTable.Circuits.Location.locality.",hasItems("Melbourne"));
    }

}