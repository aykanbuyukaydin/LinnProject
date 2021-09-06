package linnProject.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import linnProject.pages.US015Page;
import linnProject.utilities.ConfigReader;

public class US015StepDefinitions {


    US015Page us015Page = new US015Page();

    @Given("insan simgesine tiklar")
    public void insan_simgesine_tiklar() {
        us015Page.insanSimgesi.click();

    }
    @Then("sign in butonuna tiklar")
    public void sign_in_butonuna_tiklar() {
        us015Page.ilkLoginLinki.click();
    }
    @Given("username boxina kullanici ismini girer")
    public void username_boxina_kullanici_ismini_girer() {
        us015Page.userTextBox.sendKeys(ConfigReader.getProperty("gmbnk_valid_username"));

    }
    @Given("password boxina sifresini girer")
    public void password_boxina_sifresini_girer() {
        us015Page.passwordTextBox.sendKeys(ConfigReader.getProperty("gmbnk_valid_password"));
    }
    @Then("sign in boxina click yapar")
    public void sign_in_boxina_click_yapar() {
        us015Page.loginButonu.click();
    }
    @Given("my operations'a tiklar")
    public void my_operations_a_tiklar() {
        us015Page.myOperations.click();

    }
    @Given("my accounts'a tiklar")
    public void my_accounts_a_tiklar() {
        us015Page.myAccounts.click();

    }
    @Then("hesaplardan birinin hesap turunu gorur")
    public void hesaplardan_birinin_hesap_turunu_gorur() {
        us015Page.hesapTuru.isDisplayed();

    }
    @Then("hesaplardan birinin hesap bakiyesini gorur")
    public void hesaplardan_birinin_hesap_bakiyesini_gorur() {
        us015Page.hesapBakiyesi.isDisplayed();

    }


    @Then("New Transaction butonunu click yapar")
    public void newTransactionButonunuClickYapar() {
        us015Page.viewTransaction.click();
    }

    @Then("Description altinda yer alan aciklamayi gorur")
    public void descriptionAltindaYerAlanAciklamayiGorur() {
        System.out.println("Islem aciklamasi :" + us015Page.islemAciklamasi.getText());
    }

}
