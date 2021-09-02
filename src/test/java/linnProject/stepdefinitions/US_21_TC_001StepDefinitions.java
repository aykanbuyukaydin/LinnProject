package linnProject.stepdefinitions;

import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import linnProject.utilities.ConfigReader;

import static io.restassured.RestAssured.given;

public class US_21_TC_001StepDefinitions {

    Response response;
    int olusturlanUlkeId;
    @Given("Ulke olusturun {string}")
    public void ulkeOlusturun(String Name) {

        /*Country_Us_20 newCountry = new Country_Us_20();

        newCountry.setId(1);
        newCountry.setName("Alamanya");


        System.out.println(newCountry);
        response = (Response) given().headers("Authorization", "Bearer " + ConfigReader.getProperty("token"), "Content-Type",
                ContentType.JSON, "Accept", ContentType.JSON)
                .when()
                .body(newCountry)
                .post(ConfigReader.getProperty("Api_CountrysEndpoint"))
                .then().contentType(ContentType.JSON).extract().response();
        response.prettyPrint();*/

        // feature dan veri yollama
     String ulkeOlusturma="{\n" +
             "        \"name\": \""+ Name +"\",\n" +
             "        \"states\": null\n" +
             "    }";

        response = (Response) given().headers("Authorization", "Bearer " + ConfigReader.getProperty("token"), "Content-Type",
                ContentType.JSON, "Accept", ContentType.JSON)
                .when()
                .body(ulkeOlusturma)
                .post(ConfigReader.getProperty("Api_CountrysEndpoint"))
                .then().contentType(ContentType.JSON).extract().response();
        response.prettyPrint();

        response = (Response) given().headers("Authorization", "Bearer " + ConfigReader.getProperty("token"), "Content-Type",
                ContentType.JSON, "Accept", ContentType.JSON)
                .when().get(ConfigReader.getProperty("Api_CountrysEndpoint")).then()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .response();
        response.prettyPrint();
        String actualCountryList=response.body().path("id").toString();
        System.out.println("=========================================");
        System.out.println(actualCountryList);
        System.out.println("=================================");
        System.out.println(ulkeOlusturma.toString());
        JsonPath jsonPath=response.jsonPath();
      olusturlanUlkeId=jsonPath.getInt("id");
        System.out.println(olusturlanUlkeId);
    }



    @Given("Ulkeleri okuyun ve test edin")
    public void ulkeleri_okuyun_ve_test_edin() {


    }




}
