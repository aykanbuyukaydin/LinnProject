package linnProject.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import linnProject.pages.US010Page;
import linnProject.utilities.ConfigReader;
import linnProject.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class US010StepDefinitions {


    WebDriver driver;

    US010Page us010Page = new US010Page();

    @Given("{string} adresine giris yapilir")
    public void adresineGirisYapilir(String arg0) {

        Driver.getDriver().get(ConfigReader.getProperty("url_home"));
    }

    @Then("Anasayfada yer alan insan figurune tiklanir")
    public void anasayfada_yer_alan_insan_figurune_tiklanir() {

        us010Page.insanFiguru.click();
    }
    @Then("Acilan kutudaki Sing in sekmesine tiklanir")
    public void acilan_kutudaki_sing_in_sekmesine_tiklanir() {

        us010Page.singinButtonu.click();
    }
    @Then("Employee olarak giris yapilir")
    public void employee_olarak_giris_yapilir() {

        us010Page.username.sendKeys(ConfigReader.getProperty("employee_username"));
        us010Page.password.sendKeys(ConfigReader.getProperty("employee_password"));
        us010Page.kayitSayfasiSinginButton.click();
    }
    @Then("Acilan sayfadaki My Operations yazisina tiklanir")
    public void acilan_sayfadaki_my_operations_yazisina_tiklanir() {

        us010Page.myOperationsButtonu.click();
    }
    @Then("Acilan kutudaki Manage Customers sekmesine tiklanir")
    public void acilan_kutudaki_manage_customers_sekmesine_tiklanir() {

        us010Page.manageCustomersSekmesi.click();
    }
    @Then("Acilan sayfadaki Create a new Customer butonuna tiklanir")
    public void acilan_sayfadaki_create_a_new_customer_butonuna_tiklanir() {

        us010Page.createANewCustomersSekmesi.click();
    }
    @Then("SSN textbox'ina kayitli bir SSN no girilir.")
    public void ssn_textbox_ina_kayitli_bir_ssn_no_girilir() {

        us010Page.ssnTextbox.sendKeys(ConfigReader.getProperty("kayitli_ssn_no"));
    }
    @Then("Search butonuna tiklanir")
    public void search_butonuna_tiklanir() {

        us010Page.searchButtonu.click();
    }
    @Then("Middle Initial textbox'ina gecerli veri girilir.")
    public void middle_initial_textbox_ina_gecerli_veri_girilir() {

        us010Page.middleInitialTextbox.sendKeys(ConfigReader.getProperty("middle_initial"));
    }
    @Then("Phone Number textbox'ina gecerli veri girilir.")
    public void phone_number_textbox_ina_gecerli_veri_girilir() {

        us010Page.phoneNumberTextbox.sendKeys(ConfigReader.getProperty("phone_number"));
    }
    @Then("Zip Code textbox'ina gecerli veri girilir.")
    public void zip_code_textbox_ina_gecerli_veri_girilir() {

        us010Page.zipCodeTextbox.sendKeys(ConfigReader.getProperty("zip_code"));
    }
    @Then("City textbox'ina gecerli bir city girilir.")
    public void city_textbox_ina_gecerli_bir_city_girilir() {

        us010Page.cityTextbox.sendKeys(ConfigReader.getProperty("city"));
    }
    @Then("Address textbox'inin bos olup olmadigi kontrol edilir.")
    public void address_textbox_inin_bos_olup_olmadigi_kontrol_edilir() {

        String addressTextbox = us010Page.addressTextbox.getAttribute("value");

        if(addressTextbox.equals(" ")){
            System.out.println("Textbox address bilgisi icermiyor");
        }else{
            System.out.println("Textbox address bilgisi iceriyor; "+ addressTextbox);
        }

    }
    @Then("Address textbox bos ise gecerli bilgiler girilir.")
    public void address_textbox_bos_ise_gecerli_bilgiler_girilir() {

        String addressTextbox = us010Page.addressTextbox.getAttribute("value");
        if(addressTextbox.isEmpty()){
            us010Page.addressTextbox.sendKeys(ConfigReader.getProperty("address"));
        }
    }
    @Then("Save butonuna tiklanir.")
    public void save_butonuna_tiklanir() {

        us010Page.saveButtonu.click();
    }
    @Then("hata mesajinin geldigi test edilir.")
    public void hata_mesajinin_geldigi_test_edilir() {

        String hataMesaji = us010Page.hataMesaji.getText();
        Assert.assertEquals(hataMesaji, ConfigReader.getProperty("hata_mesaji"));

    }

    @And("Country dropdown menuden bir country secilir.")
    public void countryDropdownMenudenBirCountrySecilir() {

        us010Page.countryTextbox.click();
        us010Page.dropdownHandle(ConfigReader.getProperty("country"));

    }

    @And("Country bilgisinin USA olup olmadigi kontrol edilir.")
    public void countryBilgisininUSAOlupOlmadigiKontrolEdilir() {

        String countryValue = us010Page.countryTextbox.getAttribute("value");
        if(countryValue.equals("3")){
            Assert.assertEquals("3", countryValue);
            System.out.println("Country: USA");
        }else{
            System.out.println("Country USA degil");
        }

    }

    @And("Country bilgisi USA ise state bilgisi girilir aksi halde bos birakilir.")
    public void countryBilgisiUSAIseStateBilgisiGirilirAksiHaldeBosBirakilir() {

        String countryValue = us010Page.countryTextbox.getAttribute("value");
        if(countryValue.equals("3")){
            Assert.assertEquals("3", countryValue);
            us010Page.stateTextbox.sendKeys("Texsas");
        }else{
            us010Page.stateTextbox.sendKeys("");
        }

    }

    @Then("Sayfayi kapatir.")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }


}
