package org.max.lesson3.hWork;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.max.lesson3.seminar.accuweather.weather.Weather;

import static io.restassured.RestAssured.given;

public class FiveDaysTest extends AccuweatherAbstractTest {

    @Test
    void rest5Days() {
        Weather weather = given().queryParam("apikey", getApiKey())
                .when()
                .get(getBaseUrl() + "/forecasts/v1/daily/5day/295982")
                .then()
                .statusCode(200)
                .extract()
                .body().as(Weather.class);

        Assertions.assertEquals(5, weather.getDailyForecasts().size());
    }
}
