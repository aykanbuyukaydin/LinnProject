package linnProject.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import linnProject.utilities.ConfigReader;

import static io.restassured.RestAssured.given;

public class US022Api_StepDefinitions {

    Response response;

    @Given("Kullanıcı {string} endpointe gider ve dataları okur ab")
    public void kullanıcı_endpointe_gider_ve_dataları_okur_ab(String endpoint) {
        response = given().headers("Authorization",
                "Bearer "+ ConfigReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,"Accept",ContentType.JSON)
                .when()
                .get(endpoint)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();

        response.prettyPrint();

    }

    @Then("Verilen eyaletlerin doğruluğunu kontrol eder ab")
    public void verilen_eyaletlerin_doğruluğunu_kontrol_eder_ab() {

    }
}
