package linnProject.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import linnProject.pages.*;
import linnProject.utilities.ConfigReader;
import linnProject.utilities.Driver;
import linnProject.utilities.ReusableMethods;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class smokeTest_Demo_StepDefinitions {

    Actions actions = new Actions(Driver.getDriver());
    US001Page registrationPage = new US001Page();
    US004Page page = new US004Page();
    US017Page us0017Page=new US017Page();
    US009Page us009Page = new US009Page();
    US015Page us015Page = new US015Page();
    US018Page us018Page = new US018Page();

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
        ReusableMethods.waitFor(2);
        registrationPage.firstName.sendKeys(ConfigReader.getProperty("r_firstName"));
        ReusableMethods.waitFor(2);
        registrationPage.lastName.sendKeys(ConfigReader.getProperty("r_lastName"));
        ReusableMethods.waitFor(2);
        registrationPage.address.sendKeys(ConfigReader.getProperty("r_address"));
        ReusableMethods.waitFor(2);
        registrationPage.mobilePhoneNumber.sendKeys(ConfigReader.getProperty("r_mobilPhoneNumber"));
        ReusableMethods.waitFor(2);
        registrationPage.username.sendKeys(ConfigReader.getProperty("r_username"));
        ReusableMethods.waitFor(2);
        registrationPage.email.sendKeys(ConfigReader.getProperty("r_email"));
        ReusableMethods.waitFor(2);
        registrationPage.password.sendKeys(ConfigReader.getProperty("r_password"));
        ReusableMethods.waitFor(2);
        registrationPage.confirmPassword.sendKeys(ConfigReader.getProperty("r_password"));
        ReusableMethods.waitFor(2);
        registrationPage.registerButton.click();
        ReusableMethods.waitFor(2);
    }

    @Then("admin anasayfaya gider ab")
    public void admin_anasayfaya_gider_ab() {
        Driver.getDriver().get(ConfigReader.getProperty("url_home"));

    }

    @When("admin login sayfasına tiklar ab")
    public void admin_login_sayfasına_tiklar_ab() {
        registrationPage.humonicon.click();
        page.signin.click();
        ReusableMethods.waitFor(2);

    }

    @When("admin olarak username ve password bilgilerini girip login olur ab")
    public void admin_olarak_username_ve_password_bilgilerini_girip_login_olur_ab() {
        page.username_kutusu.sendKeys(ConfigReader.getProperty("a_username"));
        ReusableMethods.waitFor(2);
        page.password_kutusu.sendKeys(ConfigReader.getProperty("a_password"));
        ReusableMethods.waitFor(2);
        page.signin_butonu.click();
        ReusableMethods.waitFor(2);

    }

    @When("kayit olunan kullanicin bilgileri active eder ab")
    public void kayit_olunan_kullanicin_bilgileri_active_eder_ab() throws InterruptedException {
        us0017Page.administration.click();
        Thread.sleep(5000);
        us0017Page.userManagement.click();
        Thread.sleep(3000);
        us009Page.createdDate.click();
        ReusableMethods.waitFor(2);
        us0017Page.editButonu.click();
        Thread.sleep(2000);
        us009Page.activated.click();
        ReusableMethods.waitFor(2);
        Select select = new Select(us0017Page.profiles);
        select.deselectAll();
        select.selectByValue("ROLE_CUSTOMER");
        Thread.sleep(3000);
        us0017Page.save.click();
        ReusableMethods.waitFor(2);


    }

    @When("admin hesabindan cikis yapar ab")
    public void admin_hesabindan_cikis_yapar_ab() {
        us009Page.insanFigur.click();
        ReusableMethods.waitFor(2);
        us009Page.signOutButton.click();
        ReusableMethods.waitFor(2);

    }

    @When("employee olarak username ve password bilgilerini girip login olur ab")
    public void employee_olarak_username_ve_password_bilgilerini_girip_login_olur_ab() {
        registrationPage.humonicon.click();
        page.signin.click();
        ReusableMethods.waitFor(2);
        page.username_kutusu.sendKeys(ConfigReader.getProperty("Employee_username"));
        ReusableMethods.waitFor(2);
        page.password_kutusu.sendKeys(ConfigReader.getProperty("Employee_password"));
        ReusableMethods.waitFor(2);
        page.signin_butonu.click();
        ReusableMethods.waitFor(2);

    }

    @When("kayit olunan kullaniciya banka hesaplarini entegre eder ab")
    public void kayit_olunan_kullaniciya_banka_hesaplarini_entegre_eder_ab() throws InterruptedException {
        us015Page.myOperations.click();
        ReusableMethods.waitFor(3);
        us018Page.manageCustomersButton.click();
        ReusableMethods.waitFor(3);
        us018Page.editButton.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        Select select = new Select(us009Page.account);
        select.deselectAll();
        select.selectByValue("279-74-1800 nolu SSN numarali sahis icin olusturlan CHECKING hesap numarasi");
        actions.keyDown(Keys.CONTROL ).perform();
        select.selectByValue("279-74-1800 nolu SSN numarali sahis icin olusturlan SAVING hesap numarasi");
        actions.keyUp(Keys.CONTROL).perform();
        Thread.sleep(3000);
        us0017Page.save.click();
        Thread.sleep(3000);

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
