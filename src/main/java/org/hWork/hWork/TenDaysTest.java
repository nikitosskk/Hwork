package org.hWork.hWork;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@Epic("AccuWeather API")
@Feature("Десятидневный прогноз")
public class TenDaysTest extends AccuweatherAbstractTest {

    @Test
    @Description("Проверка получения десятидневного прогноза по ID города")
    @Severity(SeverityLevel.CRITICAL)
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