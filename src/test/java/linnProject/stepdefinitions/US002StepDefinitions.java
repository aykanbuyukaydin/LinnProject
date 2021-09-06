package linnProject.stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import linnProject.pages.US002Page;
import linnProject.utilities.ConfigReader;
import linnProject.utilities.Driver;
import linnProject.utilities.ReusableMethods;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

public class US002StepDefinitions {

    Faker fake = new Faker();
    US002Page us02page = new US002Page();
    String pw = fake.name().fullName();

    @Given("kullanici Linn Bank sayfasina gider")
    public void kullanici_linn_bank_sayfasina_gider() {

        Driver.getDriver().get(ConfigReader.getProperty("url_home"));
    }

    @Given("kullanici sag ustteki insan simgesine tiklar")
    public void kullanici_sag_ustteki_insan_simgesine_tiklar() {
        us02page.anasayfaInsanIkonu.click();
    }

    @When("kullanici register butonuna tiklar")
    public void kullanici_register_butonuna_tiklar() {
        us02page.anasayfaRegisterButton.click();
    }

    @Then("kullanici SSN Textboxuna SSN numarasi bilgisini girer")
    public void kullanici_ssn_textboxuna_ssn_numarasi_bilgisini_girer() {
        us02page.registerSayfasiSsnTextBox.sendKeys(fake.number().digits(3) +
                "-" + fake.number().digits(2) + "-" + fake.number().digits(4));
    }

    @Then("kullanici First Name Textboxuna First Name bilgisini girer")
    public void kullanici_first_name_textboxuna_first_name_bilgisini_girer() {
        us02page.registerSayfasiFirstnameTextBox.sendKeys(fake.name().firstName());
    }

    @Then("kullanici Last Name Textboxuna Last Name bilgisini girer")
    public void kullanici_last_name_textboxuna_last_name_bilgisini_girer() {
        us02page.registerSayfasiLastnameTextBox.sendKeys(fake.name().lastName());
    }

    @Then("kullanici Adress Name Textboxuna Adress Name bilgisini girer")
    public void kullanici_adress_name_textboxuna_adress_name_bilgisini_girer() {
        us02page.registerSayfasiAddressTextBox.sendKeys(fake.address().fullAddress());
    }

    @Then("kullanici Phone Number Textboxuna Mobile Phone Number bilgisini girer")
    public void kullanici_phone_number_textboxuna_mobile_phone_number_bilgisini_girer() {
        us02page.registerSayfasiMobilePhoneTextBox.sendKeys(fake.number().digits(3) +
                "-" + fake.number().digits(3) + "-" + fake.number().digits(4));
    }

    @Then("kullanici Username Textboxuna Username bilgisini girer")
    public void kullanici_username_textboxuna_username_bilgisini_girer() {
        us02page.registerSayfasiUsernameTextBox.sendKeys(fake.name().username());
    }

    @Then("kullanici Email Textboxuna Email bilgisini girer")
    public void kullanici_email_textboxuna_email_bilgisini_girer() {
        us02page.registerSayfasiEmailTextBox.sendKeys ( fake.name().username() + "@gmail.com");
    }

    @Then("kullanici New Password Textboxuna New Password bilgisini girer")
    public void kullanici_new_password_textboxuna_new_password_bilgisini_girer() {
        us02page.registerSayfasiPasswordTextBox.sendKeys(pw);
    }

    @Then("kullanici New password confirmation Textboxuna New password confirmation bilgisini girer")
    public void kullanici_new_password_confirmation_textboxuna_new_password_confirmation_bilgisini_girer() {
        us02page.registerSayfasiPasswordConfirmationTextBox.sendKeys(pw);
    }

    @Then("kullanici Registration saved! Please check your email for confirmation yazisi alir")
    public void kullanici_registration_saved_please_check_your_email_for_confirmation_yazisi_alir() {
        ReusableMethods.waitForVisibility(us02page.registrationSavedYazisi,5000);
        Assert.assertTrue(us02page.registrationSavedYazisi.isDisplayed());
    }

    @When("kullanici SSN Textboxuna - yerine _ ozel karakterini kullanir")
    public void kullanici_ssn_textboxuna_yerine_ozel_karakterini_kullanir() {
        us02page.registerSayfasiSsnTextBox.sendKeys(fake.number().digits(3) +
                "_" + fake.number().digits(2) + "_" + fake.number().digits(4));
        us02page.registerSayfasiRegisterYazisi.click();
    }

    @Then("kullanici Your SSN is invalid yazisi alir")
    public void kullanici_your_ssn_is_invalid_yazisi_alir() {
        Assert.assertTrue(us02page.SSNinvalidYazisi.isDisplayed());
    }

    @When("kullanici Mobile Phone Number Textboxuna - yerine _ ozel karakterini kullanir")
    public void kullanici_mobile_phone_number_textboxuna_yerine_ozel_karakterini_kullanir() {
        us02page.registerSayfasiMobilePhoneTextBox.sendKeys(fake.number().digits(3) +
                "_" + fake.number().digits(3) + "_" + fake.number().digits(4));
        us02page.registerSayfasiRegisterYazisi.click();
    }

    @Then("kullanici Your mobile phone number is invalid yazisi alir")
    public void kullanici_your_mobile_phone_number_is_invalid_yazisi_alir() {
        Assert.assertTrue(us02page.PhoneNumberInvlaidYazisi.isDisplayed());
    }

    @When("kullanici Email Textboxuna @ isaretini koymadan bir mail adresi yazar")
    public void kullanici_email_textboxuna_isaretini_koymadan_bir_mail_adresi_yazar() {
        ((JavascriptExecutor)Driver.getDriver()).executeScript("scroll(0,400)");
        us02page.registerSayfasiEmailTextBox.sendKeys ( fake.name().username() + "gmail.com");
        us02page.registerSayfasiEmailYazisi.click();
    }

    @Then("kullanici @ isareti olmadigi icin This field is invalid yazisi alir")
    public void kullanici_isareti_olmadigi_icin_this_field_is_invalid_yazisi_alir() {
        Assert.assertTrue(us02page.EmailInvalidYazisi.isDisplayed());
    }

    @When("kullanici Email Textboxuna . isaretini koymadan bir mail adresi yazar2")
    public void kullanici_email_textboxuna_isaretini_koymadan_bir_mail_adresi_yazar2() {
        ((JavascriptExecutor)Driver.getDriver()).executeScript("scroll(0,400)");
        us02page.registerSayfasiEmailTextBox.sendKeys ( fake.name().username() + "@gmailcom");
        us02page.registerSayfasiEmailYazisi.click();
    }

    @Then("kullanici . isareti olmadigi icin This field is invalid yazisi alir2")
    public void kullanici_isareti_olmadigi_icin_this_field_is_invalid_yazisi_alir2() {
        Assert.assertTrue(us02page.EmailInvalidYazisi.isDisplayed());
    }

    @When("kullanici Register butonuna tiklar")
    public void kullaniciRegisterButonunaTiklar() {
        us02page.registerSayfasiRegisterButton.click();
    }
}
