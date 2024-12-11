package org.max.lesson3.hWork;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@Epic("AccuWeather API")
@Feature("Исторические данные")
public class HistoricalCurrentConditionsTest extends AccuweatherAbstractTest {

    @Test
    @Description("Проверка получения исторических данных за последние 24 часа по ID города")
    @Severity(SeverityLevel.CRITICAL)
    void historical() {
        given().queryParam("apikey", getApiKey())
                .when()
                .get(getBaseUrl() + "/currentconditions/v1/295928/historical/24")
                .then()
                .statusCode(200);
    }
}