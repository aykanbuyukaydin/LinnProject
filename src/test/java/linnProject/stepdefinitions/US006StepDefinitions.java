

package linnProject.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import linnProject.pages.US006Page;
import linnProject.utilities.ConfigReader;
import linnProject.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US006StepDefinitions {
    US006Page us006Page = new US006Page();
    String firstName = "User078";
    String lastName = "adnan";
    String emailCheck = "celik@can.com";
    String expectedBeklenenDiller = "en";


    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String url_home) {

        Driver.getDriver().get(ConfigReader.getProperty("url_home"));
    }


    @And("insan tusuna tikla")
    public void insanTusunaTikla() {

        us006Page.insanButonu.click();
    }

    @Then("Giris tikla")
    public void girisTikla() {

        us006Page.signIn.click();
    }

    @Then("User Name gir")
    public void user_name_gir() {
        us006Page.username.sendKeys("User06");
    }

    @Then("Paswword gir")
    public void paswword_gir() {
        us006Page.password.sendKeys("User06.");
    }


   // @And("SignIn click yap")
    //public void signınClickYap() {
   //     us006Page.signInClick.click();
   // }

    @And("Giris butonuna bas")
    public void girisButonunaBas() {

        us006Page.signInClick.click();
    }


    @Then("cikan sayfada sag uste username ye tikla")
    public void cikan_sayfada_sag_uste_username_ye_tikla() {
        us006Page.signInClick.click();
    }

    @And("user yazan insan butonuna tikla")
    public void userYazanInsanButonunaTikla() {
        us006Page.usertikla.click();
    }

    @Then("User Info ya tikla")
    public void user_ınfo_ya_tikla() {
        us006Page.infoTikla.click();
    }

    @Then("First Name dolumu check et")
    public void first_name_dolumu_check_et() {

        Assert.assertTrue(us006Page.FirsNameGoruntule.isDisplayed());
        System.out.println("===========================================");
        System.out.println(us006Page.FirsNameGoruntule.getAttribute("value"));
        Assert.assertEquals(firstName, us006Page.FirsNameGoruntule.getAttribute("value"));
    }

    @Then("Last name dolumu check et")
    public void last_name_dolumu_check_et() {


        Assert.assertEquals(lastName, us006Page.lasNameDegistir.getAttribute("value"));
    }

    @Then("Email dolumu check et")
    public void email_dolumu_check_et() {

        Assert.assertEquals(emailCheck, us006Page.emailGoruntule.getAttribute("value"));
    }

    @Then("Language dolumu check et")
    public void language_dolumu_check_et() {

        //Assert.assertTrue(us006Page.languageGoruntule.isDisplayed());
        System.out.println("us006Page.languageGoruntule = " + us006Page.languageGoruntule.getAttribute("value"));
        Assert.assertEquals(expectedBeklenenDiller, us006Page.languageGoruntule.getAttribute("value"));
    }


    // us006Page.languageBox.click();
    @And("Cikan secenekte iki dil ingilizce ve Turkce seceneginin goruldugunu check yap")
    public void cikanSecenekteIkiDilIngilizceVeTurkceSecenegininGoruldugunuCheckYap() throws InterruptedException {
        Select options = new Select(us006Page.languageBox);

        List<WebElement> dilOptionlari = options.getOptions();
        //List<String> expectedBeklenenDiller= new ArrayList<>("English","Türkçe");

        String[] expectedBeklenenDiller = {"English", "Türkçe"};
        List<String> expectedDiller = Arrays.asList(expectedBeklenenDiller);
        List<String> actualDiller = new ArrayList<>();
        for (WebElement element : dilOptionlari) {
            System.out.println(element.getText());
            actualDiller.add(element.getText());

        }
        System.out.println(actualDiller);
        System.out.println(expectedDiller);
        Thread.sleep(2000);
        Assert.assertEquals(expectedDiller, actualDiller);
        // Assert.assertTrue(actualDiller.contains(expectedBeklenenDiller));

    }


    @And("First Name degistir")
    public void firstNameDegistir() throws InterruptedException {
        us006Page.firstNameDegistir.clear();
        Thread.sleep(2000);
        us006Page.firstNameDegistir.sendKeys(firstName);
    }

    @And("Save butun a click yap")
    public void saveButunAClickYap() {
        us006Page.saveButonu.click();
    }

    @And("{string} yazisinin goruldugunu check et")
    public void yazisininGoruldugunuCheckEt(String expextedyazisi) throws InterruptedException {
        String expectedYazsi = "Settings saved!";

        String actualKayitYazisi = us006Page.kayitedildiyazisi.getAttribute("innerHTML");

        System.out.println("Save yazisi =" + us006Page.kayitedildiyazisi.getAttribute("innerHTML"));


        Assert.assertEquals(expectedYazsi, us006Page.kayitedildiyazisi.getAttribute("innerHTML"));
        //Assert.assertTrue(us006Page.kayitedildiyazisi.isDisplayed());

    }


    @And("Last Name degistir")
    public void lastNameDegistir() {
        us006Page.lasNameDegistir.clear();
        us006Page.lasNameDegistir.sendKeys("adnan");


    }

    @And("Email de degisiklik yap email {string} icerecek sekilde email degistir")
    public void emailDeDegisiklikYapEmailIcerecekSekildeEmailDegistir(String arg0) {
        us006Page.emailDegistir.clear();
        us006Page.emailDegistir.sendKeys("celik@can.com");
    }
}

