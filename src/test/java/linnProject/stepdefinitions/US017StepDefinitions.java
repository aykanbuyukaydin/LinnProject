package linnProject.stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import linnProject.pages.US017Page;
import linnProject.utilities.ConfigReader;
import linnProject.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class US017StepDefinitions {

    US017Page us0017Page=new US017Page();
    @Given("kullanici url_home sayfasina gider z")
    public void kullanici_url_home_sayfasina_giderZ() {
        Driver.getDriver().get(ConfigReader.getProperty("url_home"));
    }

    @And("kullanici insan figurune tiklar z")
    public void kullaniciInsanFiguruneTiklarZ() {
        us0017Page.insanFiguru.click();
    }

    @And("kullanici sign_in sekmesine tiklar z")
    public void kullaniciSign_inSekmesineTiklarZ() {
        us0017Page.signYazisi.click();
    }

    @And("kullanici gecerli username girer z")
    public void kullaniciGecerliUsernameGirerZ() {
        us0017Page.usernametextbox.sendKeys(ConfigReader.getProperty("username"));
        
    }

    @And("kullanici gecerli password girer z")
    public void kullaniciGecerliPasswordGirerZ() {
        us0017Page.passwordtextbox.sendKeys(ConfigReader.getProperty("password"));
    }

    @And("sign_in ile giris yapar z")
    public void sign_inIleGirisYaparZ() {
        us0017Page.signInButonu.click();
    }

    @And("Administration bolumune tiklar z")
    public void administrationBolumuneTiklarZ() throws InterruptedException {
        us0017Page.administration.click();
        Thread.sleep(5000);
    }

    @And("userManagementa tiklar z")
    public void usermanagementaTiklarZ() throws InterruptedException {
        us0017Page.userManagement.click();
        Thread.sleep(3000);
    }

    @Then("kullanici edit sekmesine tiklar z")
    public void kullaniciEditSekmesineTiklarZ() throws InterruptedException {
        us0017Page.editButonu.click();
        Thread.sleep(2000);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.TAB).perform();
        Thread.sleep(2000);
    }

    @And("admin profilesden {string} secer ve save eder z")
    public void adminProfilesdenSecerVeSaveEderZ(String role) throws InterruptedException {
        Select select = new Select(us0017Page.profiles);
        select.deselectAll();
        select.selectByValue(role);
        //us0017Page.profiles.click();
        Thread.sleep(3000);
        us0017Page.save.click();
        Thread.sleep(3000);
        Assert.assertTrue(us0017Page.allert.isDisplayed());
    }

    @And("sayfayi kapatir z")
    public void sayfayiKapatirZ() {
        Driver.closeDriver();
    }

    @Then("kullanici view sekmesine tiklar z")
    public void kullaniciViewSekmesineTiklarZ() throws InterruptedException {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.TAB).perform();
        Thread.sleep(3000);
        us0017Page.view.click();
    }

    @And("secilen kisinin goruntuleme islemini dogrular z")
    public void secilenKisininGoruntulemeIsleminiDogrularZ() {
        Assert.assertTrue(us0017Page.viewTex.isDisplayed());
        us0017Page.back.click();
    }

    @And("secilen kisinin duzenlenebildigini dogrular z")
    public void secilenKisininDuzenlenebildiginiDogrularZ() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue(us0017Page.edittext.isDisplayed());
    }

    @Then("kullanici delete butonuna tiklar z")
    public void kullaniciDeleteButonunaTiklarZ() {
        us0017Page.delete.click();
    }

    @And("secilen kisinin silindigini dogrular z")
    public void secilenKisininSilindiginiDogrularZ() throws InterruptedException {
        Thread.sleep(3000);
        us0017Page.confirmDelete.click();
        Thread.sleep(3000);
        Assert.assertTrue(us0017Page.silindiMesaji.isDisplayed());
    }
}