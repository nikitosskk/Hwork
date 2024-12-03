package org.max.lesson3.hWork;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class OneHundredTest extends AccuweatherAbstractTest{

    @Test
    void test120Hours() {
        given().queryParam("apikey", getApiKey())
                .when()
                .get(getBaseUrl() + "/forecasts/v1/hourly/120hour/295928")
                .then()
                .statusCode(200);
    }
}
