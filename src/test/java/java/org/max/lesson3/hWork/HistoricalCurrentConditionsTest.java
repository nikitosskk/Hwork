package org.max.lesson3.hWork;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class HistoricalCurrentConditionsTest extends AccuweatherAbstractTest{

    @Test
    void historical() {
        given().queryParam("apikey", getApiKey())
                .when()
                .get(getBaseUrl() + "/currentconditions/v1/295928/historical/24")
                .then()
                .statusCode(200);
    }
}


