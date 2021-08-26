package linnProject.stepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import linnProject.pojos.Customer;
import linnProject.utilities.ConfigReader;

import java.io.IOException;

import static io.restassured.RestAssured.given;

public class Api_Ders_Linn {
    Response response;

    @Given("read all customer data using with api endpoint {string}")
    public void read_all_customer_data_using_with_api_endpoint(String api_endpoint)  {

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

        System.out.println("===================================================================================");


    }

    @Then("validate customer data")
    public void validate_customer_data() throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        Customer[] customer = objectMapper.readValue(response.asString(), Customer[].class);

        // ilk musterinin ismi
        System.out.println(customer[0].getFirstName());

        // 5. musterinin email adresi
        System.out.println(customer[4].getEmail());

        System.out.println("===================================================================================");

        // tum musterilerin SsN numaralari
        for(int i = 0 ; i < customer.length ; i++){
            System.out.println(customer[i].getSsn());
        }

        System.out.println("===================================================================================");

        // M harfi ile baslayan musteri isimleri
        for(int i = 0 ; i < customer.length ; i++){
            if(customer[i].getFirstName().startsWith("M")){
                System.out.println(customer[i].getFirstName());
            }
        }

        System.out.println("===================================================================================");

        //bos olmayan userlarin ilk isimleri
        for(int i = 0 ; i < customer.length ; i++ ) {
            if(customer[i].getUser() != null) {
                System.out.println(customer[i].getUser().getFirstName());
            }
        }


    }
}
