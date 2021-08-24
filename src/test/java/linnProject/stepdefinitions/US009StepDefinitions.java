<<<<<<< HEAD
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

    @Given("Web sayfasina git")
    public void web_sayfasina_git() {
        Driver.getDriver().get(ConfigReader.getProperty("url_home"));
    }

    @Then("Insan Butuna tikla")
    public void insan_butuna_tikla() {
        us009Page.insanFigur.click();
    }

    @Then("Sign in tikla")
    public void sign_in_tikla() {
        us009Page.signinButon.click();
    }

    @Then("User Name gir \\(customer olarak)")
    public void user_name_gir_customer_olarak() {
        us009Page.usernameTextBox.sendKeys(ConfigReader.getProperty("Employee_username"));
    }

    @When("Password gir \\(customer olarak)")
    public void password_gir_customer_olarak() {
        us009Page.passwordTextBox.sendKeys(ConfigReader.getProperty("Employee_password"));
    }

    @When("Sign in click yap")
    public void sign_in_click_yap() {
        us009Page.signinButton.click();
    }

    @When("Cikan sayfada sag uste My Operations a tikla")
    public void cikan_sayfada_sag_uste_my_operations_a_tikla() {
        us009Page.myOperations.click();
    }

    @When("Manage Customers a tikla")
    public void manage_customers_a_tikla() {
        us009Page.manageCustomers.click();
    }

    @When("Sag uste cikan Create a new Customer butonuna tikla")
    public void sag_uste_cikan_create_a_new_customer_butonuna_tikla() {
        us009Page.createANewCustomer.click();
    }

    @When("SSN textbox a kayıtlı bir SSN no gir")
    public void ssn_textbox_a_kayıtlı_bir_ssn_no_gir() {
        us009Page.ssnTextBox.sendKeys(ConfigReader.getProperty("Kayitli_SNN"));
    }

    @When("Search butonuna tikla")
    public void search_butonuna_tikla() {
        us009Page.searchButton.click();
    }

    @Then("SSN no nun geldiğini test et")
    public void ssn_no_nun_geldiğini_test_et() {
        ReusableMethods.waitFor(5);
        System.out.println(us009Page.searchBasariliUyarisi.isDisplayed());
        Assert.assertTrue(us009Page.searchBasariliUyarisi.isDisplayed());
    }

    @Then("SSN search yapildiginda diger bilgilerin geldigini test et")
    public void ssn_search_yapildiginda_diger_bilgilerin_geldigini_test_et() {
        System.out.println(us009Page.mobilePhoneNumberTextBox.getAttribute("value"));
        Assert.assertTrue(us009Page.mobilePhoneNumberTextBox.getAttribute("value").contains("555-555-5556"));
    }

    @Then("sayfayi kapatin")
    public void sayfayi_kapatin() {
//Driver.closeDriver();
    }

    @Then("Middle Initial textbox a data gir")
    public void middleInitialTextboxADataGir() {
        us009Page.middleInitialTextBox.sendKeys(ConfigReader.getProperty("Middle_Initial_textbox_data"));
    }

    @And("Phone Number textbox a data gir")
    public void phoneNumberTextboxADataGir() {
        us009Page.phoneNumberTextBox.sendKeys(ConfigReader.getProperty("Phone_Number_textbox_data"));
    }

    @And("Zip Code textbox a data gir")
    public void zipCodeTextboxADataGir() {
        us009Page.zipCodeTextBox.sendKeys(ConfigReader.getProperty("Zip_Code_textbox_data"));
    }

    @And("City textbox a data gir")
    public void cityTextboxADataGir() {
        ReusableMethods.waitFor(3);
        us009Page.cityTextBox.sendKeys(ConfigReader.getProperty("City_textbox_data"));
    }

    @Then("Create Date textbox a şu andaki tarihi data gir")
    public void createDateTextboxAŞuAndakiTarihiDataGir() {
        ReusableMethods.waitFor(5);
        us009Page.createDateTextBox.click();
        us009Page.createDateTextBox.sendKeys("08" + "23" + "2021" + Keys.TAB + "03" + "03" );
        System.out.println(us009Page.createDateTextBox.getAttribute("value"));
        String value = us009Page.createDateTextBox.getAttribute("value");
        //value yi ekrandaki formata cevir  08/23/2021 03:03 AM
    }

    @And("Account dropdrowndan bir hesap sec")
    public void accountDropdrowndanBirHesapSec() {
        ReusableMethods.waitFor(5);
        WebElement accountDropDrown = us009Page.accountSelect;
        Select select = new Select(accountDropDrown);
        select.selectByVisibleText("Vadeli Hesap");
    }

    @And("Zelle Enrolled box a tik at")
    public void zelleEnrolledBoxATikAt() {
        us009Page.zelleBox.click();
    }

    @And("Save botonuna tikla")
    public void saveBotonunaTikla() {
        //ReusableMethods.waitFor(5);
        us009Page.saveButton.click();
    }

    @And("translation-not-found yazısının geldigini test et")
    public void translationNotFoundYazısınınGeldiginiTestEt() {
        //server geliyor hep locate yapamiyorum
        //System.out.println(us009Page.);
        //Assert.assertTrue(us009Page.);
    }

    @Then("Create Date textbox a gecmiş bir tarih data gir")
    public void createDateTextboxAGecmişBirTarihDataGir() {
        //ReusableMethods.waitFor(5);
        us009Page.createDateTextBox.click();
        us009Page.createDateTextBox.sendKeys("06" + "20" + "2019" + Keys.TAB + "03" + "03" );
        System.out.println(us009Page.createDateTextBox.getAttribute("value"));
        String value = us009Page.createDateTextBox.getAttribute("value");
        //value yi ekrandaki formata cevir  08/23/2021 03:03 AM

    }

    @And("translation-not-found yazısının gelmedigini test et")
    public void translationNotFoundYazısınınGelmediginiTestEt() {
        //server geliyor hep locate yapamiyorum
        //System.out.println(us009Page.);
        //Assert.assertTrue(us009Page.);
    }

    @And("Create Date textbox a eksik tarih gir")
    public void createDateTextboxAEksikTarihGir() {
        //ReusableMethods.waitFor(5);
        us009Page.createDateTextBox.click();
        us009Page.createDateTextBox.sendKeys(Keys.DELETE);
        System.out.println(us009Page.createDateTextBox.getAttribute("class"));


    }

    @And("Tarih Text Box class degerinin invalid oldugunu test et")
    public void tarihTextBoxClassDegerininInvalidOldugunuTestEt() {
        ReusableMethods.waitFor(5);
        System.out.println(us009Page.createDateTextBox.getAttribute("class").contains("invalid"));
        Assert.assertTrue(us009Page.createDateTextBox.getAttribute("class").contains("invalid"));
    }


}
=======
//package linnProject.stepdefinitions;
//
//import io.cucumber.java.bs.A;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import linnProject.pages.US009Page;
//import linnProject.utilities.ConfigReader;
//import linnProject.utilities.Driver;
//import linnProject.utilities.ReusableMethods;
//import org.junit.Assert;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.NoSuchElementException;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//
//public class US009StepDefinitions {
//    US009Page us009Page = new US009Page();
//    Actions actions = new Actions(Driver.getDriver());
//
//    @Given("Web sayfasina git")
//    public void web_sayfasina_git() {
//        Driver.getDriver().get(ConfigReader.getProperty("url_home"));
//    }
//
//    @Then("Insan Butuna tikla")
//    public void insan_butuna_tikla() {
//        us009Page.insanFigur.click();
//    }
//
//    @Then("Sign in tikla")
//    public void sign_in_tikla() {
//        us009Page.signinButon.click();
//    }
//
//    @Then("User Name gir \\(customer olarak)")
//    public void user_name_gir_customer_olarak() {
//        us009Page.usernameTextBox.sendKeys(ConfigReader.getProperty("Employee_username"));
//    }
//
//    @When("Password gir \\(customer olarak)")
//    public void password_gir_customer_olarak() {
//        us009Page.passwordTextBox.sendKeys(ConfigReader.getProperty("Employee_password"));
//    }
//
//    @When("Sign in click yap")
//    public void sign_in_click_yap() {
//        us009Page.signinButton.click();
//    }
//
//    @When("Cikan sayfada sag uste My Operations a tikla")
//    public void cikan_sayfada_sag_uste_my_operations_a_tikla() {
//        us009Page.myOperations.click();
//    }
//
//    @When("Manage Customers a tikla")
//    public void manage_customers_a_tikla() {
//        us009Page.manageCustomers.click();
//    }
//
//    @When("Sag uste cikan Create a new Customer butonuna tikla")
//    public void sag_uste_cikan_create_a_new_customer_butonuna_tikla() {
//        us009Page.createANewCustomer.click();
//    }
//
//    @When("SSN textbox a kayıtlı bir SSN no gir")
//    public void ssn_textbox_a_kayıtlı_bir_ssn_no_gir() {
//        us009Page.ssnTextBox.sendKeys(ConfigReader.getProperty("Kayitli_SNN"));
//    }
//
//    @When("Search butonuna tikla")
//    public void search_butonuna_tikla() {
//        us009Page.searchButton.click();
//    }
//
//    @Then("SSN no nun geldiğini test et")
//    public void ssn_no_nun_geldiğini_test_et() {
//        ReusableMethods.waitFor(5);
//        System.out.println(us009Page.searchBasariliUyarisi.isDisplayed());
//        Assert.assertTrue(us009Page.searchBasariliUyarisi.isDisplayed());
//    }
//
//    @Then("SSN search yapildiginda diger bilgilerin geldigini test et")
//    public void ssn_search_yapildiginda_diger_bilgilerin_geldigini_test_et() {
//        System.out.println(us009Page.mobilePhoneNumberTextBox.getAttribute("value"));
//        Assert.assertTrue(us009Page.mobilePhoneNumberTextBox.getAttribute("value").contains("555-555-5556"));
//    }
//
//    @Then("sayfayi kapatin")
//    public void sayfayi_kapatin() {
////Driver.closeDriver();
//    }
//
//    @Then("Middle Initial textbox a data gir")
//    public void middleInitialTextboxADataGir() {
//        us009Page.middleInitialTextBox.sendKeys(ConfigReader.getProperty("Middle_Initial_textbox_data"));
//    }
//
//    @And("Phone Number textbox a data gir")
//    public void phoneNumberTextboxADataGir() {
//        us009Page.phoneNumberTextBox.sendKeys(ConfigReader.getProperty("Phone_Number_textbox_data"));
//    }
//
//    @And("Zip Code textbox a data gir")
//    public void zipCodeTextboxADataGir() {
//        us009Page.zipCodeTextBox.sendKeys(ConfigReader.getProperty("Zip_Code_textbox_data"));
//    }
//
//    @And("City textbox a data gir")
//    public void cityTextboxADataGir() {
//        ReusableMethods.waitFor(3);
//        us009Page.cityTextBox.sendKeys(ConfigReader.getProperty("City_textbox_data"));
//    }
//
//    @Then("Create Date textbox a şu andaki tarihi data gir")
//    public void createDateTextboxAŞuAndakiTarihiDataGir() {
//        ReusableMethods.waitFor(5);
//        us009Page.createDateTextBox.click();
//        us009Page.createDateTextBox.sendKeys("08" + "23" + "2021" + Keys.TAB + "03" + "03" );
//        System.out.println(us009Page.createDateTextBox.getAttribute("value"));
//        String value = us009Page.createDateTextBox.getAttribute("value");
//        //value yi ekrandaki formata cevir  08/23/2021 03:03 AM
//    }
//
//    @And("Account dropdrowndan bir hesap sec")
//    public void accountDropdrowndanBirHesapSec() {
//        ReusableMethods.waitFor(5);
//        WebElement accountDropDrown = us009Page.accountSelect;
//        Select select = new Select(accountDropDrown);
//        select.selectByVisibleText("Vadeli Hesap");
//    }
//
//    @And("Zelle Enrolled box a tik at")
//    public void zelleEnrolledBoxATikAt() {
//        us009Page.zelleBox.click();
//    }
//
//    @And("Save botonuna tikla")
//    public void saveBotonunaTikla() {
//        //ReusableMethods.waitFor(5);
//        us009Page.saveButton.click();
//    }
//
//    @And("translation-not-found yazısının geldigini test et")
//    public void translationNotFoundYazısınınGeldiginiTestEt() {
//        //server geliyor hep locate yapamiyorum
//        //System.out.println(us009Page.);
//        //Assert.assertTrue(us009Page.);
//    }
//
//    @Then("Create Date textbox a gecmiş bir tarih data gir")
//    public void createDateTextboxAGecmişBirTarihDataGir() {
//        //ReusableMethods.waitFor(5);
//        us009Page.createDateTextBox.click();
//        us009Page.createDateTextBox.sendKeys("06" + "20" + "2019" + Keys.TAB + "03" + "03" );
//        System.out.println(us009Page.createDateTextBox.getAttribute("value"));
//        String value = us009Page.createDateTextBox.getAttribute("value");
//        //value yi ekrandaki formata cevir  08/23/2021 03:03 AM
//
//    }
//
//    @And("translation-not-found yazısının gelmedigini test et")
//    public void translationNotFoundYazısınınGelmediginiTestEt() {
//        //server geliyor hep locate yapamiyorum
//        //System.out.println(us009Page.);
//        //Assert.assertTrue(us009Page.);
//    }
//
//    @And("Create Date textbox a eksik tarih gir")
//    public void createDateTextboxAEksikTarihGir() {
//        //ReusableMethods.waitFor(5);
//        us009Page.createDateTextBox.click();
//        us009Page.createDateTextBox.sendKeys(Keys.DELETE);
//        System.out.println(us009Page.createDateTextBox.getAttribute("class"));
//
//
//    }
//
//    @And("Tarih Text Box class degerinin invalid oldugunu test et")
//    public void tarihTextBoxClassDegerininInvalidOldugunuTestEt() {
//        ReusableMethods.waitFor(5);
//        System.out.println(us009Page.createDateTextBox.getAttribute("class").contains("invalid"));
//        Assert.assertTrue(us009Page.createDateTextBox.getAttribute("class").contains("invalid"));
//    }
//}
>>>>>>> main
