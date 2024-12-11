package org.max.lesson3.hWork;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.max.lesson3.seminar.accuweather.location.Location;

import java.util.List;

import static io.restassured.RestAssured.given;

@Epic("AccuWeather API")
@Feature("Поиск местоположения")
public class GetLocationTest extends AccuweatherAbstractTest {

    @Test
    @Description("Проверка поиска местоположений по запросу")
    @Severity(SeverityLevel.CRITICAL)
    void getLocation() {
        List<Location> result = given()
                .queryParam("apikey", getApiKey())
                .pathParam("q", "Tula")
                .when()
                .get(getBaseUrl() + "/locations/v1/cities/autocomplete")
                .then()
                .statusCode(200)
                .extract()
                .body().jsonPath().getList(".", Location.class);

        Assertions.assertEquals(10, result.size());
    }
}