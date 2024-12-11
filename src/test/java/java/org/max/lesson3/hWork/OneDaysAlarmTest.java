package org.max.lesson3.hWork;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@Epic("AccuWeather API")
@Feature("Предупреждения на 1 день")
public class OneDaysAlarmTest extends AccuweatherAbstractTest {

    @Test
    @Description("Проверка получения предупреждений на 1 день по ID города")
    @Severity(SeverityLevel.CRITICAL)
    void test1DayAlarm() {
        given().queryParam("apikey", getApiKey())
                .when()
                .get(getBaseUrl() + "/alarms/v1/1day/295928")
                .then()
                .statusCode(200);
    }
}