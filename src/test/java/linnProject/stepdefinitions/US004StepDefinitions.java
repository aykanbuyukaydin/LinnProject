package linnProject.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import linnProject.pages.US004Page;
import linnProject.utilities.ReusableMethods;
import org.junit.Assert;


public class US004StepDefinitions {

    US004Page page = new US004Page();



    String gecerli_username= "User3737";
    String gecerli_password="User3737.";
    String gecersiz_username="38user";
    String gecersiz_password="user38";


    @Then("US004 sign in linkine tikla")
    public void sign_in_linkine_tikla() {
        page.signin.click();
        ReusableMethods.waitFor(2);
    }

    @Then("US004 sign in basligini verify et dogrula")
    public void us004_sign_in_basligini_verify_et_dogrula() {
        String expected= "Sign in";
        Assert.assertEquals(page.signin_baslik.getText(),expected);

    }

    @Then("US004 Username basligini dogrula")
    public void us004_username_basligini_dogrula() {
        String expected= "Username";
        Assert.assertEquals(page.username_baslik.getText(),expected);

    }
    @Then("US004 Username kutucuguna gecerli bir Username gir")
    public void username_kutucuguna_gecerli_bir_username_gir() {
        page.username_kutusu.sendKeys(gecerli_username);
        ReusableMethods.waitFor(2);

    }
    @Then("US004 Password basligini dogrula")
    public void password_basligini_dogrula() {
        String expected= "Password";
        Assert.assertEquals(page.password_baslik.getText(),expected);

    }
    @Then("US004 Password kutucuguna gecerli bir password gir")
    public void password_kutucuguna_gecerli_bir_password_gir() {
        page.password_kutusu.sendKeys(gecerli_password);
        ReusableMethods.waitFor(2);
    }
    @When("US004 Did you forget your password? basligini dogrula")
    public void did_you_forget_your_password_basligini_dogrula() {
        String expected= "Did you forget your password?";
        Assert.assertEquals(page.didyouforgetyourpassword_yazisi.getText(),expected);


    }
    @When("US004 You don't have an account yet? Register a new account baslıgını dogrula")
    public void you_don_t_have_an_account_yet_register_a_new_account_baslıgını_dogrula() {
        String expected= "You don't have an account yet? Register a new account";
        Assert.assertEquals(page.youdonthaveaccount_yazisi.getText(),expected);

    }
    @Then("US004 sing in butonuna tıkla")
    public void sing_in_butonuna_tıkla() {
        page.signin_butonu.click();
        ReusableMethods.waitFor(2);
    }
    @Then("US004 fuat koca kullanıcı adını dogrula")
    public void fuat_koca_kullanıcı_adını_dogrula() {
        String expected= "fuat koca";
        Assert.assertEquals(page.fuat_koca_username.getText(),expected);

    }

    @Then("US004 Cancel butonunu verify et \\(dogrula)")
    public void us004_cancel_butonunu_verify_et_dogrula() {
        String expected= "Cancel";
        Assert.assertEquals(page.cancel_butonu.getText(),expected);

    }

    @Then("US004 Cancel butonunu tıkla")
    public void us004_cancel_butonunu_tıkla() {
      page.cancel_butonu.click();
    }

    @Then("US004 Username kutucuguna gecersiz bir Username gir")
    public void us004_username_kutucuguna_gecersiz_bir_username_gir() {
        page.username_kutusu.sendKeys(gecersiz_username);
        ReusableMethods.waitFor(2);
    }

    @Then("US004 Failed to sign in! Please check your credentials and try again. mesajini dogrula")
    public void us004_failed_to_sign_in_please_check_your_credentials_and_try_again_mesajini_dogrula() {
        String expected= "Failed to sign in! Please check your credentials and try again.";

        Assert.assertEquals(page.Failedtosignin_mesajı.getText(),expected);

    }

    @Then("US004 Password kutucuguna gecersiz bir password gir")
    public void us004_password_kutucuguna_gecersiz_bir_password_gir() {
        page.password_kutusu.sendKeys(gecersiz_password);
    }

    @Then("US004 Anasayfadaki Home basligini dogrula")
    public void us004_anasayfadaki_home_basligini_dogrula() {
       String expected= "Home";
       Assert.assertEquals(page.home_anasayfa.getText(),expected);
    }

    @Then("US004 fuat koca kullanıcı sign out cikis linkini tikla")
    public void us004_fuat_koca_kullanıcı_sign_out_cikis_linkini_tikla() {
        page.sign_out.click();
        ReusableMethods.waitFor(2);
    }


}
