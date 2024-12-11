package org.hWork.hWork;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Test;

@Epic("AccuWeather API")
@Feature("Предупреждения на 15 дней")
public class FifTeenDaysAlarmTest extends AccuweatherAbstractTest {

    @Test
    @Description("Проверка получения предупреждений на 15 дней по ID города")
    @Severity(SeverityLevel.CRITICAL)
    void test15DayAlarm() {
        given().queryParam("apikey", getApiKey())
                .when()
                .get(getBaseUrl() + "/alarms/v1/15day/295928")
                .then()
                .statusCode(200);
    }
}