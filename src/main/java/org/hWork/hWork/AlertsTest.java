package org.hWork.hWork;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Test;

@Epic("AccuWeather API")
@Feature("Тестирование предупреждений")
public class AlertsTest extends AccuweatherAbstractTest {

    @Test
    @Description("Проверка получения предупреждений по ID города")
    @Severity(SeverityLevel.CRITICAL)
    void testAlerts() {
        given().queryParam("apikey", getApiKey())
                .when()
                .get(getBaseUrl() + "/alerts/v1/295928")
                .then()
                .statusCode(200);
    }
}