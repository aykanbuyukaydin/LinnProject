package linnProject.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import linnProject.utilities.ConfigReader;
import org.junit.Assert;

import static io.restassured.RestAssured.given;
import static linnProject.jsonModels.US024_StateJson.createState;

public class US024Api_StepDefinitions {


    Response response;

    int createStateId;

    @And("Kullanici tum eyaletleri {string} endpointini kullanarak okur.SU")
    public void kullaniciTumEyaletleriEndpointiniKullanarakOkur(String api_endpoint) {

        response = given().headers("Authorization",
                "Bearer "+ ConfigReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,"Accept",ContentType.JSON)
                .when()
                .get(api_endpoint)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();

        response.prettyPrint();


    }

    @Given("Kullanici {string} endpointi kullanarak yeni bir eyalet olusturur.SU")
    public void kullaniciEndpointiKullanarakYeniBirEyaletOlusturur(String api_endpoint) {

        response = given().headers("Authorization",
                "Bearer " + ConfigReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON, "Accept", ContentType.JSON)
                .when()
                .body(createState)
                .post(api_endpoint)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();

        response.prettyPrint();

        JsonPath jsonPath = response.jsonPath();
        createStateId = jsonPath.getInt("id");
        System.out.println("==================================");
        System.out.println(createStateId);


    }

    @Then("Kullanici yeni olusturdugu eyaleti validate eder.SU")
    public void kullaniciYeniOlusturduguEyaletiValidateEder() {

        response = given().headers("Authorization",
                "Bearer "+ ConfigReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,"Accept",ContentType.JSON)
                .when()
                .get(ConfigReader.getProperty("TC024_End_point"))
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();

        response.prettyPrint();

        JsonPath jsonPath = response.jsonPath();
        String stringStateIds = jsonPath.getString("id");

        String stringCreateStateId = String.valueOf(createStateId);
        Assert.assertTrue("not contain", stringStateIds.contains(stringCreateStateId));

        System.out.println("validation succesfull");
    }
}
