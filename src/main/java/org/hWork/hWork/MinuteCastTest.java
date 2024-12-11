package org.hWork.hWork;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@Epic("AccuWeather API")
@Feature("Минутный прогноз")
public class MinuteCastTest extends AccuweatherAbstractTest {

    @Test
    @Description("Проверка получения минутного прогноза по названию города")
    @Severity(SeverityLevel.CRITICAL)
    void minuteCast() {
        given()
                .queryParam("apikey", getApiKey())
                .pathParam("q", "Tula")
                .when()
                .get(getBaseUrl() + "/forecasts/v1/minute")
                .then()
                .statusCode(200);
    }
}