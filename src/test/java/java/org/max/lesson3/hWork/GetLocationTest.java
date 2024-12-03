package org.max.lesson3.hWork;

import io.restassured.response.ValidatableResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.max.lesson3.seminar.accuweather.location.Location;

import java.util.List;

import static io.restassured.RestAssured.given;

public class GetLocationTest extends AccuweatherAbstractTest {

    @Test
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
