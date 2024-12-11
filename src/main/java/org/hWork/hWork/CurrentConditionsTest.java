package org.hWork.hWork;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Test;

@Epic("AccuWeather API")
@Feature("Текущие условия")
public class CurrentConditionsTest extends AccuweatherAbstractTest {

    @Test
    @Description("Проверка получения текущих условий по ID города")
    @Severity(SeverityLevel.CRITICAL)
    void currentCond() {
        given().queryParam("apikey", getApiKey())
                .when()
                .get(getBaseUrl() + "/currentconditions/v1/295928")
                .then()
                .statusCode(200);
    }
}