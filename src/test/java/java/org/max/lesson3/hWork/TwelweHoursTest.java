package org.max.lesson3.hWork;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class TwelweHoursTest extends AccuweatherAbstractTest{

    @Test
    void test12Hours() {
        given().queryParam("apikey", getApiKey())
                .when()
                .get(getBaseUrl() + "/forecasts/v1/hourly/12hour/295928")
                .then()
                .statusCode(200);
    }
}
