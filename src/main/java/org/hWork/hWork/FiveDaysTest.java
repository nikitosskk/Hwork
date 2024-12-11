package org.hWork.hWork;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.max.lesson3.seminar.accuweather.weather.Weather;

import static io.restassured.RestAssured.given;

@Epic("AccuWeather API")
@Feature("Прогноз на 5 дней")
public class FiveDaysTest extends AccuweatherAbstractTest {

    @Test
    @Description("Проверка получения прогноза на 5 дней по ID города")
    @Severity(SeverityLevel.CRITICAL)
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