package org.hWork.hWork;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@Epic("AccuWeather API")
@Feature("Предупреждения на 10 дней")
public class TenDaysAlarmTest extends AccuweatherAbstractTest {

    @Test
    @Description("Проверка получения предупреждений на 10 дней по ID города")
    @Severity(SeverityLevel.CRITICAL)
    void test10DayAlarm() {
        given().queryParam("apikey", getApiKey())
                .when()
                .get(getBaseUrl() + "/alarms/v1/10day/295928")
                .then()
                .statusCode(200);
    }
}