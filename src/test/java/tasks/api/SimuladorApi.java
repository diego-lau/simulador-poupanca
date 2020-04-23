package tasks.api;

import io.restassured.http.ContentType;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class SimuladorApi {

    @Test
    public void conexaoSimulador() {
        String uriBase = "http://5b847b30db24a100142dce1b.mockapi.io/api/v1/simulador";
        given()
                .when()
                .get(uriBase)
                .then()
                .statusCode(200) // O status http retornado foi 200
                .contentType(ContentType.JSON) // O response foi retornado no formato JSON
                .body("id", is(1)) //A chave "id" contém o valor "1"
                .body("meses")
    }
}
