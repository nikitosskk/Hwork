package org.max.lesson3.hWork;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class TenDaysTest extends AccuweatherAbstractTest {

    @Test
    void getTenDays_shouldReturn401() {
        given()
                .queryParam("apikey", getApiKey())
                .pathParam("version", "v1")
                .pathParam("location", 295982)
                .when()
                .get(getBaseUrl() + "/forecasts/{version}/daily/10day/{location}")
                .then()
                .statusCode(401);
    }
}