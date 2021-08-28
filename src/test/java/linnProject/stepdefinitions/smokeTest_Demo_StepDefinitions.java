package linnProject.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import linnProject.pages.US001Page;
import linnProject.pages.US004Page;
import linnProject.utilities.ConfigReader;
import linnProject.utilities.Driver;
import linnProject.utilities.ReusableMethods;

public class smokeTest_Demo_StepDefinitions {

    US001Page registrationPage = new US001Page();
    US004Page page = new US004Page();

    @Given("kullanici anasayfaya gider ab")
    public void kullanici_anasayfaya_gider_ab() {
        Driver.getDriver().get(ConfigReader.getProperty("url_home"));
    }

    @Then("kullanici register sayfasına tiklar  ab")
    public void kullanici_register_sayfasına_tiklar_ab() {
        registrationPage.humonicon.click();
        registrationPage.register.click();
    }

    @Then("kullanici register sayfasinda kayit olur ab")
    public void kullanici_register_sayfasinda_kayit_olur_ab() {
        registrationPage.ssn.sendKeys(ConfigReader.getProperty("r_snn"));
        registrationPage.firstName.sendKeys(ConfigReader.getProperty("r_firstName"));
        registrationPage.lastName.sendKeys(ConfigReader.getProperty("r_lastName"));
        registrationPage.address.sendKeys(ConfigReader.getProperty("r_address"));
        registrationPage.mobilePhoneNumber.sendKeys(ConfigReader.getProperty("r_mobilPhoneNumber"));
        registrationPage.username.sendKeys(ConfigReader.getProperty("r_username"));
        registrationPage.email.sendKeys(ConfigReader.getProperty("r_email"));
        registrationPage.password.sendKeys(ConfigReader.getProperty("r_password"));
        registrationPage.confirmPassword.sendKeys(ConfigReader.getProperty("r_password"));
        registrationPage.registerButton.click();
    }

    @Then("admin anasayfaya gider ab")
    public void admin_anasayfaya_gider_ab() {
        Driver.getDriver().get(ConfigReader.getProperty("url_home"));
        registrationPage.humonicon.click();

    }

    @When("admin login sayfasına tiklar ab")
    public void admin_login_sayfasına_tiklar_ab() {
        registrationPage.humonicon.click();
        page.signin.click();
        ReusableMethods.waitFor(2);

    }

    @When("admin olarak username ve password bilgilerini girip login olur ab")
    public void admin_olarak_username_ve_password_bilgilerini_girip_login_olur_ab() {
        page.username_kutusu.sendKeys("a_username");
        ReusableMethods.waitFor(2);
        page.password_kutusu.sendKeys("a_password");
        ReusableMethods.waitFor(2);
        page.signin_butonu.click();
        ReusableMethods.waitFor(2);

    }

    @When("kayit olunan kullanicin bilgileri active eder ab")
    public void kayit_olunan_kullanicin_bilgileri_active_eder_ab() {

    }

    @When("admin hesabindan cikis yapar ab")
    public void admin_hesabindan_cikis_yapar_ab() {

    }

    @When("employee login sayfasına tiklar ab")
    public void employee_login_sayfasına_tiklar_ab() {

    }

    @When("employee olarak username ve password bilgilerini girip login olur ab")
    public void employee_olarak_username_ve_password_bilgilerini_girip_login_olur_ab() {

    }

    @When("kayit olunan kullaniciya banka hesaplarini entegre eder ab")
    public void kayit_olunan_kullaniciya_banka_hesaplarini_entegre_eder_ab() {

    }

    @Then("employee hesabindan cikis yapar ab")
    public void employee_hesabindan_cikis_yapar_ab() {

    }

    @Then("kullanici login sayfasına tiklar ab")
    public void kullanici_login_sayfasına_tiklar_ab() {

    }

    @Then("kullanici olarak username ve password bilgilerini girip login olur ab")
    public void kullanici_olarak_username_ve_password_bilgilerini_girip_login_olur_ab() {

    }

    @Then("kullanici hesap sayfasina tiklar ab")
    public void kullanici_hesap_sayfasina_tiklar_ab() {

    }

    @Then("kullanici para transferi yapar ab")
    public void kullanici_para_transferi_yapar_ab() {

    }

    @Then("kullanici para transferi yaptigini dogrular ab")
    public void kullanici_para_transferi_yaptigini_dogrular_ab() {

    }

}
