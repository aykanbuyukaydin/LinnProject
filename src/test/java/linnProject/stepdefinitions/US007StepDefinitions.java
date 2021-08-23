package linnProject.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import linnProject.pages.US006Page;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US007StepDefinitions {

    US006Page us006Page = new US006Page();

    @Given("Email butun a tiklanir")
    public void email_butun_a_tiklanir() {
        us006Page.emailDegistir.click();
        us006Page.emailDegistir.clear();
        us006Page.emailDegistir.sendKeys("can-gmail.com");
    }


    @Then("Email adresinde {string} olmadan harf veya karakter gir")
    public void email_adresinde_olmadan_harf_veya_karakter_gir(String string) {
        us006Page.emailDegistir.sendKeys("can-gmail.com");


    }

    @Then("{string} yazisinin alindigini check et")
    public void yazisinin_alindigini_check_et(String string) {

        System.out.println("us006Page.emailKabuledilmedi.getText() = " + us006Page.emailKabuledilmedi.getText());
        String expectedYazisi = "This field is invalid";

        Assert.assertEquals(expectedYazisi,us006Page.emailKabuledilmedi.getText());

    }


    @Given("Language box click yap")
    public void languageBoxClickYap() {
        us006Page.languageBox.click();
    }


    @Given("Email adresinde {string} Nokta olmadan harf veya karakter gir")
    public void emailAdresindeNoktaOlmadanHarfVeyaKarakterGir(String arg0) {
        us006Page.emailDegistir.click();
        us006Page.emailDegistir.clear();
        us006Page.emailDegistir.sendKeys("can@gmailcom");

    }

    @And("kutuda ingilizce ve turkce disinda bil secenek olmamali")
    public void kutudaIngilizceVeTurkceDisindaBilSecenekOlmamali() {

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
    }

}
