package org.max.lesson3.hWork;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class TwentyFourHoursTest extends AccuweatherAbstractTest{

    @Test
    void test24Hours() {
        given().queryParam("apikey", getApiKey())
                .when()
                .get(getBaseUrl() + "/forecasts/v1/hourly/24hour/295928")
                .then()
                .statusCode(200);
    }
}
