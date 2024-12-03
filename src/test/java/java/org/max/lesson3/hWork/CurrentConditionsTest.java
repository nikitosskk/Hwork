package org.max.lesson3.hWork;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class CurrentConditionsTest extends AccuweatherAbstractTest{

    @Test
    void currentCond() {
        given().queryParam("apikey", getApiKey())
                .when()
                .get(getBaseUrl() + "/currentconditions/v1/295928")
                .then()
                .statusCode(200);
    }
}
