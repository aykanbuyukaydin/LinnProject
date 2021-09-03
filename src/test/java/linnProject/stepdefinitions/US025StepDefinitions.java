package linnProject.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import linnProject.utilities.ConfigReader;
import linnProject.utilities.WriteToTxt;
import org.junit.Assert;

import static io.restassured.RestAssured.given;
import static linnProject.jsonModels.CountryJson_Ders_linn.createCountry;

public class US025StepDefinitions {

    Response response;
    Response responseAll;
    int createdCountryId ;


    @Then("US025 Kullanıcısı tüm ülkeleri {string} endpointini kullanarak okur")
    public void us025_kullanıcısı_tüm_ülkeleri_endpointini_kullanarak_okur(String endpoint) {
        responseAll= given().headers(
                "Authorization",
                "Bearer " + ConfigReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .get(endpoint)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();
        responseAll.prettyPrint();
    }
    @Given("US025 Kullanici  {string} endpointi kullanarak yeni ulke olusturabilir")
    public void us025_kullanici_endpointi_kullanarak_yeni_ulke_olusturabilir(String endpoint) {
        response=given().headers(
                "Authorization",
                "Bearer " + ConfigReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when().body(createCountry)
                .post(endpoint)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();
        response.prettyPrint();
    }

    @Then("US025 kullanici olusturulan ulkeyi validate eder")
    public void us025_kullanici_olusturulan_ulkeyi_validate_eder() {
        response = given().headers("Authorization",
                "Bearer "+ConfigReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept", ContentType.JSON)
                .when()
                .get("https://www.gmibank.com/api/tp-countries")
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();

        JsonPath jsonPath = response.jsonPath();
        String stringIds = jsonPath.getString("id");

        String stringCreatedCountryId = String.valueOf(createdCountryId);

        Assert.assertTrue("not contain" ,stringIds.contains(stringCreatedCountryId));
        System.out.println("Validation is succesfull");
    }

}
