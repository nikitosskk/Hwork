package org.max.lesson3.hWork;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class OneDaysAlarmTest extends AccuweatherAbstractTest{

    @Test
    void test1DayAlarm() {
        given().queryParam("apikey", getApiKey())
                .when()
                .get(getBaseUrl() + "/alarms/v1/1day/295928")
                .then()
                .statusCode(200);
    }
}
