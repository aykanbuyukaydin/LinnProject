package linnProject.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import linnProject.utilities.ConfigReader;

import java.io.IOException;

import static io.restassured.RestAssured.given;
import static linnProject.jsonModels.CountryJson_Ders_linn.creatCustomer;

public class Us_20_Tc_002StepDefinitions {
    Response response;

    @And("Yeni Musteri olusturun AK {string}")
    public void yeniMusteriOlusturunAK(String Api_CostumersEndPoint) throws IOException {


       /* response = given().headers("Authorization", "Bearer " + ConfigReader.getProperty("token"), "Content-Type",
                ContentType.JSON, "Accept", ContentType.JSON).when()
                .get(Api_CostumersEndPoint)
                .then().contentType(ContentType.JSON)
                .extract().response();
        response.prettyPrint();
        System.out.println("===================================");
        ObjectMapper objectMapper = new ObjectMapper();
        Customer_Us_20[] customer_us_20 = objectMapper.readValue(response.asString(), Customer_Us_20[].class);

        //Ilk musterinin ismi
        System.out.println(customer_us_20[0].getFirstName());

        // 5. musterinin email adresi
        System.out.println(customer_us_20[4].getEmail());

        System.out.println("========================================");

        //Butun musterilerin Ssn numaralarini getirme
        for (int i = 0; i < customer_us_20.length; i++) {
            System.out.println(customer_us_20[i].getSsn());
        }
        System.out.println("===============================");
        //Ismi M harfi ile baslayanlari getirme
        for (int i=0 ; i<customer_us_20.length ; i++){
            if (customer_us_20[i].getFirstName().startsWith("M")){
                System.out.println(customer_us_20[i].getFirstName());
            }
        }
        System.out.println("=============================");
        System.out.println(customer_us_20[0].getUser());
        System.out.println("===============================");

        //Butun kullanicilari firstName getirme
        for (int i=0 ; i< customer_us_20.length ; i++) {
            if (customer_us_20[i].getUser()!=null) {
                System.out.println(customer_us_20[i].getUser().getFirstName());
            }
        }*/

        //validate isleminde kullanmak icin tum musteri Id lerini bir listin icine atalim

        /*List<String> customerId=new ArrayList<>();

        //objectmapper kullanarak deserilazitoin yapiyoruz
        ObjectMapper objectMapper1 =new ObjectMapper();
        Customer_Us_20[] customerUs20sTum=objectMapper1.readValue(response.asString(),Customer_Us_20[].class);
        //for dungusu ile tum musteri id lerini daha once olusturdugumuz  listenin icine ekleyelim

        for (int i=0 ;i <customerUs20sTum.length ;i++){
            customerId.add(String.valueOf(customerUs20sTum[i].getFirstName()));
        }
        //tum musteri id lerini yazdiralim
        System.out.println("=============================");
        WriteToTxt.saveDataInFileWithCustomer_Us_20("customerId",customerUs20sTum);*/

        //Musteri olusturma
        response = (Response) given().headers("Authorization", "Bearer " + ConfigReader.getProperty("token"), "Content-Type",
                ContentType.JSON, "Accept", ContentType.JSON).when().
                body(creatCustomer).
                post(Api_CostumersEndPoint).then().
                contentType(ContentType.JSON)
                .extract().response();
        response.prettyPrint();


    }


    @Then("Olusan ve tum müşteri verilerini okuyu AK")
    public void olusan_ve_tum_müşteri_verilerini_okuyu_ak() {

    }

    @Then("Bunlari  data setinizden doğrulayın AK")
    public void bunlari_data_setinizden_doğrulayın_ak() {

    }


}
