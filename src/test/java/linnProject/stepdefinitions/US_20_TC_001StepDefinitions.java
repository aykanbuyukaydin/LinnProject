package linnProject.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import linnProject.utilities.ConfigReader;
import linnProject.utilities.ReadTxt;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class US_20_TC_001StepDefinitions {


    Response response;


    @Then("Tüm müşteri verilerini okuyun")
    public void tüm_müşteri_verilerini_okuyun() {
        response = given().headers("Authorization",
                "Bearer " + ConfigReader.getProperty("token"),
                "Content-Type", ContentType.JSON,
                "Accept", ContentType.JSON)
                .when()
                .get(ConfigReader.getProperty("Api_CostumersEndPoint"))
                .then()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .response();

        response.prettyPrint();


    }

    @Then("Bunları data setinizden doğrulayın")
    public void bunları_data_setinizden_doğrulayın() {

        given().headers("Authorization",
                "Bearer " + ConfigReader.getProperty("token"),
                "Content-Type", ContentType.JSON,
                "Accept", ContentType.JSON)
                .when()
                .get(ConfigReader.getProperty("Api_CostumersEndPoint"))
                .then()
                .contentType(ContentType.JSON)
                .statusCode(200);
        System.out.println("================================");

        List<String> actualFirstNameList = response.body().path("firstName");

        System.out.println(actualFirstNameList);

        System.out.println("===============================================================");
        List<String> expectedFirstNameList = ReadTxt.returnCountryIdList("C:\\Users\\admin\\Desktop\\LinnProject\\Expected-Data.txt");

        //iter  kisayol
        for (String s : expectedFirstNameList) {

            Assert.assertTrue(actualFirstNameList.contains(s));
            System.out.println("Foreach ile Liste dogrulandi");
        }



        System.out.println(expectedFirstNameList);

        //itar for kisayolu
        for ( int i=0 ; i<expectedFirstNameList.size() ;i++) {
            Assert.assertTrue(actualFirstNameList.contains(expectedFirstNameList.get(i)));
            System.out.println("For loop ile Liste dogrulandi");
        }

    }


}
