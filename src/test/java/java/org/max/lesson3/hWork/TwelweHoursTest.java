package org.max.lesson3.hWork;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@Epic("AccuWeather API")
@Feature("Почасовой прогноз на 12 часов")
public class TwelveHoursTest extends AccuweatherAbstractTest {

    @Test
    @Description("Проверка получения почасового прогноза на 12 часов по ID города")
    @Severity(SeverityLevel.CRITICAL)
    void test12Hours() {
        given().queryParam("apikey", getApiKey())
                .when()
                .get(getBaseUrl() + "/forecasts/v1/hourly/12hour/295928")
                .then()
                .statusCode(200);
    }
}