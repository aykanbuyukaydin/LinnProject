package linnProject.stepdefinitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import linnProject.pages.US009Page;
import linnProject.utilities.ConfigReader;
import linnProject.utilities.Driver;
import linnProject.utilities.ReusableMethods;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class US009StepDefinitions {
    US009Page us009Page = new US009Page();
    Actions actions = new Actions(Driver.getDriver());

    @Given("Web sayfasina git ab")
    public void web_sayfasina_git_ab() {
        Driver.getDriver().get(ConfigReader.getProperty("url_home"));
    }

    @Then("Insan Butuna tikla ab")
    public void insan_butuna_tikla_ab() {
        us009Page.insanFigur.click();
    }

    @Then("Sign in tikla ab")
    public void sign_in_tikla_ab() {
        us009Page.signinButon.click();
    }

    @Then("User Name gir \\(customer olarak) ab")
    public void user_name_gir_customer_olarak_ab() {
        us009Page.usernameTextBox.sendKeys(ConfigReader.getProperty("Employee_username"));
    }

    @When("Password gir \\(customer olarak) ab")
    public void password_gir_customer_olarak_ab() {
        us009Page.passwordTextBox.sendKeys(ConfigReader.getProperty("Employee_password"));
    }

    @When("Sign in click yap ab")
    public void sign_in_click_yap_ab() {
        us009Page.signinButton.click();
    }

    @When("Cikan sayfada sag uste My Operations a tikla ab")
    public void cikan_sayfada_sag_uste_my_operations_a_tikla_ab() {
        us009Page.myOperations.click();
    }

    @When("Manage Customers a tikla ab")
    public void manage_customers_a_tikla_ab() {
        us009Page.manageCustomers.click();
    }

    @When("Sag uste cikan Create a new Customer butonuna tikla ab")
    public void sag_uste_cikan_create_a_new_customer_butonuna_tikla_ab() {
        us009Page.createANewCustomer.click();
    }

    @When("SSN textbox a kayıtlı bir SSN no gir ab")
    public void ssn_textbox_a_kayıtlı_bir_ssn_no_gir_ab() {
        us009Page.ssnTextBox.sendKeys(ConfigReader.getProperty("Kayitli_SNN"));
    }

    @When("Search butonuna tikla ab")
    public void search_butonuna_tikla_ab() {
        us009Page.searchButton.click();
    }

    @Then("SSN no nun geldiğini test et ab")
    public void ssn_no_nun_geldiğini_test_et_ab() {
        ReusableMethods.waitFor(5);
        System.out.println(us009Page.searchBasariliUyarisi.isDisplayed());
        Assert.assertTrue(us009Page.searchBasariliUyarisi.isDisplayed());
    }

    @Then("SSN search yapildiginda diger bilgilerin geldigini test et ab")
    public void ssn_search_yapildiginda_diger_bilgilerin_geldigini_test_et_ab() {
        System.out.println(us009Page.mobilePhoneNumberTextBox.getAttribute("value"));
        Assert.assertTrue(us009Page.mobilePhoneNumberTextBox.getAttribute("value").contains("555-555-5553"));
    }

    //@Then("sayfayi kapatin ab")
    //public void sayfayi_kapatin_ab() {
//Driver.closeDriver();
  //  }

    @Then("Middle Initial textbox a data gir ab")
    public void middleInitialTextboxADataGirAb() {
        us009Page.middleInitialTextBox.sendKeys(ConfigReader.getProperty("Middle_Initial_textbox_data"));
    }

    @And("Phone Number textbox a data gir ab")
    public void phoneNumberTextboxADataGirAb() {
        us009Page.phoneNumberTextBox.sendKeys(ConfigReader.getProperty("Phone_Number_textbox_data"));
    }

    @And("Zip Code textbox a data gir ab")
    public void zipCodeTextboxADataGirAb() {
        us009Page.zipCodeTextBox.sendKeys(ConfigReader.getProperty("Zip_Code_textbox_data"));
    }

    @And("City textbox a data gir ab")
    public void cityTextboxADataGirAb() {
        ReusableMethods.waitFor(3);
        us009Page.cityTextBox.sendKeys(ConfigReader.getProperty("City_textbox_data"));
    }

    @Then("Create Date textbox a şu andaki tarihi data gir ab")
    public void createDateTextboxAŞuAndakiTarihiDataGirAb() {
        ReusableMethods.waitFor(5);
        us009Page.createDateTextBox.click();
        us009Page.createDateTextBox.sendKeys("08" + "23" + "2021" + Keys.TAB + "03" + "03" );
        System.out.println(us009Page.createDateTextBox.getAttribute("value")); // "2021-08-23T03:03"
        String value = us009Page.createDateTextBox.getAttribute("value");
        //value yi ekrandaki formata cevir  08/23/2021 03:03 AM
        String actualDate = value.substring(5, 7) + "/" + value.substring(8, 10) + "/" + value.substring(0,4) + " " + value.substring(11);
        String expectedDate = "08/23/2021 03:03";
        Assert.assertEquals(expectedDate, actualDate);
    }
/*
    public static void main(String[] args) {
        System.out.println(us009Page.createDateTextBox.getAttribute("value")); // "2021-08-23T03:03"
        String value = us009Page.createDateTextBox.getAttribute("value");
        //value yi ekrandaki formata cevir  08/23/2021 03:03 AM
        String actualDate = value.substring(5, 7) + "/" + value.substring(8, 10) + "/" + value.substring(0,4) + " " + value.substring(11);
        String expectedDate = "08/23/2021 03:03";
        Assert.assertEquals(expectedDate, actualDate);   //olayi anlamak icinmain de bu sekilde calistirabiliriz
    }
*/
    @And("Account dropdrowndan bir hesap sec ab")
    public void accountDropdrowndanBirHesapSecAb() {
        ReusableMethods.waitFor(5);
        WebElement accountDropDrown = us009Page.accountSelect;
        Select select = new Select(accountDropDrown);
        select.selectByVisibleText("Vadeli Hesap");
    }

    @And("Zelle Enrolled box a tik at ab")
    public void zelleEnrolledBoxATikAtAb() {
        us009Page.zelleBox.click();
    }

    @And("Save botonuna tikla ab")
    public void saveBotonunaTiklaAb() {
        //ReusableMethods.waitFor(5);
        us009Page.saveButton.click();
    }

    @And("translation-not-found yazısının geldigini test et ab")
    public void translationNotFoundYazısınınGeldiginiTestEtAb() {
        System.out.println(us009Page.saveBasariliUyarisi.isDisplayed());
        Assert.assertTrue(us009Page.saveBasariliUyarisi.isDisplayed());
    }

    @Then("Create Date textbox a gecmiş bir tarih data gir ab")
    public void createDateTextboxAGecmişBirTarihDataGirAb() {
        //ReusableMethods.waitFor(5);
        us009Page.createDateTextBox.click();
        us009Page.createDateTextBox.sendKeys("06" + "20" + "2019" + Keys.TAB + "03" + "03" );
        System.out.println(us009Page.createDateTextBox.getAttribute("value"));
        String value = us009Page.createDateTextBox.getAttribute("value");
        String actualDate = value.substring(5, 7) + "/" + value.substring(8, 10) + "/" + value.substring(0,4) + " " + value.substring(11);
        String expectedDate = "06/20/2019 03:03";
        Assert.assertEquals(expectedDate, actualDate);

    }

    @And("translation-not-found yazısının gelmedigini test et ab")
    public void translationNotFoundYazısınınGelmediginiTestEtAb() {
        System.out.println(us009Page.saveBasariliUyarisi.isDisplayed());
        Assert.assertFalse(us009Page.saveBasariliUyarisi.isDisplayed());
    }

    @And("Create Date textbox a eksik tarih gir ab")
    public void createDateTextboxAEksikTarihGirAb() {
        //ReusableMethods.waitFor(5);
        us009Page.createDateTextBox.click();
        us009Page.createDateTextBox.sendKeys(Keys.DELETE);
        System.out.println(us009Page.createDateTextBox.getAttribute("class"));


    }

    @And("Tarih Text Box class degerinin invalid oldugunu test et ab")
    public void tarihTextBoxClassDegerininInvalidOldugunuTestEtAb() {
        ReusableMethods.waitFor(5);
        System.out.println(us009Page.createDateTextBox.getAttribute("class").contains("invalid"));
        Assert.assertTrue(us009Page.createDateTextBox.getAttribute("class").contains("invalid"));
    }
}
