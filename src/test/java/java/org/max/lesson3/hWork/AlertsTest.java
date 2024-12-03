package org.max.lesson3.hWork;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class AlertsTest extends AccuweatherAbstractTest{

    @Test
    void testAlerts() {
        given().queryParam("apikey", getApiKey())
                .when()
                .get(getBaseUrl() + "/alerts/v1/295928")
                .then()
                .statusCode(200);
    }
}
