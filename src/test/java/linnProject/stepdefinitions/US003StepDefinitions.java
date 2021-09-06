package linnProject.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import linnProject.pages.US003Page;
import linnProject.utilities.ConfigReader;
import linnProject.utilities.Driver;
import linnProject.utilities.ReusableMethods;
import org.junit.Assert;


public class US003StepDefinitions {
    US003Page page = new US003Page();

    @Given("US003 kullanici gmi bank websitesine gider")
    public void us003_kullanici_gmi_bank_websitesine_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("url_home"));
        ReusableMethods.waitFor(2);
    }

    @Given("US003 sag ust kosedekı ınsan sımgesıne tıkla")
    public void us003_sag_ust_kosedekı_ınsan_sımgesıne_tıkla() {
        page.dropdownMenu.click();
        ReusableMethods.waitFor(2);
    }
    @Then("US003 register tıkla")
    public void us003_register_tıkla() {
        page.register.click();
        ReusableMethods.waitFor(2);
    }
    @Then("US003 register dogrula")
    public void us003_register_dogrula() {
        String expected= "Register";
        Assert.assertEquals(page.register.getText(),expected);

    }
    @Then("US003 New password baslıgını dogrula")
    public void us003_new_password_baslıgını_dogrula() {
        String expected= "New password";
        Assert.assertEquals(page.password.getText(),expected);

    }
    @Given("US003 New password kutusuna bir tane kucuk harf gir")
    public void us003_new_password_kutusuna_bir_tane_kucuk_harf_gir() {
        page.password_kutusu.sendKeys("a");
        ReusableMethods.waitFor(2);
    }
    @Given("US003 registration sayfasindaki Register buttona tikla")
    public void us003_registration_sayfasindaki_register_buttona_tikla() {
        page.register_submit.click();
        ReusableMethods.waitFor(2);

    }
    @Then("US003 Your password is required to be at least dort characters. dogrula")
    public void us003_your_password_is_required_to_be_at_least_dort_characters_dogrula() {
        String expected= "Your password is required to be at least 4 characters.";
        Assert.assertEquals(page.password_hata_mesajı.getText(),expected);

    }
    @Then("US003 Password strength: dogrula")
    public void us003_password_strength_dogrula() {
        String expected= "Password strength:";
        Assert.assertEquals(page.password_strength.getText(),expected);

    }
    @Then("US003 uc tane daha harf gir")
    public void us003_uc_tane_daha_harf_gir() {
        page.password_kutusu.sendKeys("bcd");
        ReusableMethods.waitFor(2);
    }
    @Then("US003 strengthbar kırmızı bır cızgı dogrula")
    public void us003_strengthbar_kırmızı_bır_cızgı_dogrula() {
        Assert.assertTrue(page.strength_bar_seviye_kırmızı.isDisplayed());


    }

    @Then("US003 New password kutusuna dort tane kücük harf gir")
    public void us003_new_password_kutusuna_dort_tane_kücük_harf_gir() {
        page.password_kutusu.sendKeys("fuat");
        ReusableMethods.waitFor(2);
    }


    @Then("US003 New password kutusuna bir tane buyuk harf gir")
    public void us003_new_password_kutusuna_bir_tane_buyuk_harf_gir() {
        page.password_kutusu.sendKeys("B");
        ReusableMethods.waitFor(2);
    }
    @Then("US003 New password kutusuna iki tane buyuk harf gir")
    public void us003_new_password_kutusuna_iki_tane_buyuk_harf_gir() {
        page.password_kutusu.sendKeys("KL");
        ReusableMethods.waitFor(2);
    }

    @When("US003 strengthBar krımızı bir cızgı dogrula")
    public void us003_strength_bar_krımızı_bir_cızgı_dogrula() {
        Assert.assertTrue("US003 strengthBar krımızı bir cızgı DEGIL", page.strength_bar_seviye_kırmızı.isDisplayed());

    }

    @Then("US003 strengthBar turuncu iki cızgı dogrula")
    public void us003_strength_bar_turuncu_iki_cızgı_dogrula() {
    Assert.assertTrue(page.strength_bar_turuncu.isDisplayed());
    }

    @Then("US003 New password kutusuna bir Tane rakam gir")
    public void us003_new_password_kutusuna_bir_tane_rakam_gir() {
        page.password_kutusu.sendKeys(Integer.toString(2));
        ReusableMethods.waitFor(2);
    }

    @When("US003 strengthBar yesil dort cızgı dogrula")
    public void us003_strength_bar_yesil_dort_cızgı_dogrula() {

        Assert.assertTrue(page.strength_bar_seviye_4_yesil.isDisplayed());
    }

    @Then("US003 New password kutusuna bir Tane ozel karakter ? gir")
    public void us003_new_password_kutusuna_bir_tane_ozel_karakter_gir() {
        page.password_kutusu.sendKeys("?");
        ReusableMethods.waitFor(2);
    }
    @Then("US003 strengthBar yesil bes cızgı dogrula")
    public void us003_strength_bar_yesil_bes_cızgı_dogrula() {
    Assert.assertTrue(page.strength_bar_son_seviye.isDisplayed());
    }

    @Then("US003 New password kutusuna alti karakterli sifre gir")
    public void us003_new_password_kutusuna_alti_karakterli_sifre_gir() {
        page.password_kutusu.sendKeys("abc?E3");
        ReusableMethods.waitFor(2);
    }

    @When("US003 New password kutusuna bir harf ya da rakam daha gir")
    public void us003_new_password_kutusuna_bir_harf_ya_da_rakam_daha_gir() {
        page.password_kutusu.sendKeys("3");
        ReusableMethods.waitFor(2);
    }

}

