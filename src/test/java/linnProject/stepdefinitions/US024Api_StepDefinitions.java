package linnProject.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class US024Api_StepDefinitions {


    @Given("Kullanici {string} endpointi kullanarak yeni bir eyalet olusturur.SU")
    public void kullaniciEndpointiKullanarakYeniBirEyaletOlusturur(String api_endpoint) {

    }

    @And("Kullanici tum eyaletleri {string} endpointini kullanarak okur.SU")
    public void kullaniciTumEyaletleriEndpointiniKullanarakOkur(String api_endpoint) {

    }

    @Then("Kullanici yeni olusturdugu eyaleti validate eder.SU")
    public void kullaniciYeniOlusturduguEyaletiValidateEder() {
    }
}
