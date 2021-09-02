package linnProject.stepdefinitions;

import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import linnProject.utilities.ConfigReader;
import org.junit.Assert;

import static io.restassured.RestAssured.given;

public class US27StepDefinitions {
    Response response;
    Response responseDeleted;
    @Given("Kullanici butun eyaletleri {string} endpointten okur")
    public void kullanici_butun_eyaletleri_endpointten_okur(String stateendpoint) {

        response = given().accept(ContentType.JSON).auth().oauth2(ConfigReader.getProperty("token"))
                .when()
                .get(stateendpoint);
        response.prettyPrint();


    }

    @Given("Kullanici bir eyaleti {string} siyle siler ve sildigini dogrular")
    public void kullanici_bir_eyaleti_siyle_siler_ve_sildigini_dogrular(String id) {

        String endpoint = "https://www.gmibank.com/api/tp-states";

        responseDeleted = given().headers(
                "Authorization",
                "Bearer " + ConfigReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .delete(endpoint + id)
                .then()
                .extract()
                .response();


        response = given().accept(ContentType.JSON).auth().oauth2(ConfigReader.getProperty("token"))
                .when()
                .get(endpoint)
                .then()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .response();

        JsonPath jsonPath;
        jsonPath= response.jsonPath();
        String stateId = jsonPath.getString("id");

        Assert.assertFalse("State is not deleted",stateId.contains("61746"));
        System.out.println(id + "no'lu eyalet silindi");

    }


    }


