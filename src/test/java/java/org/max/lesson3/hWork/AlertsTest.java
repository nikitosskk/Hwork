package org.max.lesson3.hWork;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class AlertsTest extends AccuweatherAbstractTest{

    @Test
    void testAlerts() {
        //метод getApiKey() не импортирован
        given().queryParam("apikey", getApiKey())
                .when()
            //метод getBaseUrl() не импортирован
                .get(getBaseUrl() + "/alerts/v1/295928")
                .then()
                .statusCode(200);
    }
}
