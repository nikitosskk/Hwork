package org.max.lesson3.hWork;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;

public class MinuteCastTest extends AccuweatherAbstractTest {

    @Test
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
