package org.wycliffe;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.StringContains.containsString;

@QuarkusTest
public class GreetingResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/tickets")
          .then()
             .statusCode(200)
             .body(
                     containsString("Phantom of the Opera"),
                     containsString("Chorus Line"),
                     containsString("Mamma mia")
             );
    }

}