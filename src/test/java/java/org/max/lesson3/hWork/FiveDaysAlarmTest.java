package org.max.lesson3.hWork;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class FiveDaysAlarmTest extends AccuweatherAbstractTest{

    @Test
    void test5DayAlarm() {
        given().queryParam("apikey", getApiKey())
                .when()
                .get(getBaseUrl() + "/alarms/v1/5day/295928")
                .then()
                .statusCode(200);
    }
}
