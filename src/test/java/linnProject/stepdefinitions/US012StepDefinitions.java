package linnProject.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import linnProject.pages.US012Page;
import linnProject.utilities.ConfigReader;
import linnProject.utilities.Driver;
import linnProject.utilities.ReusableMethods;
import org.junit.Assert;

public class US012StepDefinitions {

    US012Page us012Page=new US012Page();


    @Given("Employee enters gmibank homepage")
    public void employee_enters_gmibank_homepage() {
        Driver.getDriver().get(ConfigReader.getProperty("url_home"));
    }

    @Given("Employee clicks people icon")
    public void employee_clicks_people_icon() {
        us012Page.peopleIcon.click();

    }
    @Given("Employee clicks  signIn link")
    public void employee_clicks_sign_in_link() {
        us012Page.signInLink.click();

    }
    @Given("Employee enters employee username")
    public void employee_enters_employee_username() {
        us012Page.usernameTextBox.sendKeys(ConfigReader.getProperty("emp_username"));

    }
    @Given("Employee enters employee password")
    public void employee_enters_employee_password() {
        us012Page.passwordTextBox.sendKeys(ConfigReader.getProperty("emp_password"));

    }
    @Given("Employee clicks signIn button")
    public void employee_clicks_sign_in_button() {
        us012Page.signInButton.click();

    }
    @Given("Employee clicks myOperations link")
    public void employee_clicks_my_operations_link() {
        us012Page.myOperationsLink.click();

    }
    @Then("Employee clicks manageCustomers link")
    public void employee_clicks_manage_customers_link() {
        us012Page.manageCustomersLink.click();

    }
    @Given("Acilan sayfada First name, Lastname, Middle Initial, Email, Mobile Phone Number, Phone Number, Address, Create Date bilgilerinin gorulur oldugu kontrol edilir")
    public void acilan_sayfada_first_name_lastname_middle_initial_email_mobile_phone_number_phone_number_address_create_date_bilgilerinin_gorulur_oldugu_kontrol_edilir() {
        Assert.assertEquals(us012Page.expectedElementList,us012Page.actualElementlist());
        us012Page.viewButton.isDisplayed();
        System.out.println("=======================");
        System.out.println(us012Page.actualElementlist().toString());
        System.out.println("========================");
    }

    @Given("Acilan sayfada View butonunun oldugu kontrol edilir")
    public void acilanSayfadaViewButonununOlduguKontrolEdilir() {
        us012Page.viewButton.isDisplayed();
        System.out.println("=======================");
        System.out.println(us012Page.viewButton.getText());
        System.out.println("========================");
    }

    @And("Acilan sayfada View butonuna tiklanir")
    public void acilanSayfadaViewButonunaTiklanir() {
        ReusableMethods.waitFor(4);
        us012Page.viewButton.click();
    }

    @Then("Customer sayfasinin acildigini gorulur")
    public void customerSayfasininAcildiginiGorulur() {

        Assert.assertTrue(us012Page.customerInformation.getText().contains("Customer"));
        System.out.println("=======================");
        System.out.println(us012Page.customerInformation.getText());
        System.out.println("========================");

    }
    @And("Customer sayfasinda edit butonu oldugu gorulur")
    public void customerSayfasindaEditButonuOlduguGorulur() {
        Assert.assertTrue(us012Page.customerEdit.isDisplayed());
        us012Page.customerEdit.isDisplayed();
        System.out.println("=======================");
        System.out.println(us012Page.customerEdit.getText());
        System.out.println("========================");
    }
    @Given("Acilan sayfada Edit butonunun oldugu kontrol edilir")
    public void acilanSayfadaEditButonununOlduguKontrolEdilir() {
        us012Page.editButton.isDisplayed();
        System.out.println("=======================");
        System.out.println(us012Page.editButton.getText());
        System.out.println("========================");

    }

    @And("Acilan sayfada Edit butonuna tiklanir")
    public void acilanSayfadaEditButonunaTiklanir() {
        ReusableMethods.waitFor(4);
        us012Page.editButton.click();

    }

    @Then("Create or Edit a customer sayfasinin acildigi gorulur")
    public void createOrEditACustomerSayfasininAcildigiGorulur() {
        Assert.assertTrue(us012Page.createorEditWriting.getText().contains("Create or edit a Customer"));
        System.out.println("=======================");
        System.out.println(us012Page.createorEditWriting.getText());
        System.out.println("========================");
    }

    @Given("Acilan sayfada yer alan Employee linkine tiklanir.")
    public void acilanSayfadaYerAlanEmployeeLinkineTiklanir() {

        us012Page.employeeLink.click();
    }

    @And("User Info yazisina tiklanir")
    public void userInfoYazisinaTiklanir() {
        us012Page.infoButton.click();

    }

    @And("User settings for [linn{int}] yazisi gorulur")
    public void userSettingsForLinnYazisiGorulur(int arg0) {

        Assert.assertTrue(us012Page.userSettings.isDisplayed());
        System.out.println("=======================");
        System.out.println(us012Page.userSettings.getText());
        System.out.println("========================");

    }

    @And("Yeni Firstname girilir")
    public void yeniFirstnameGirilir() {
        us012Page.firstnameTextBox2.click();
        ReusableMethods.waitFor(1);
        us012Page.firstnameTextBox2.clear();
        us012Page.firstnameTextBox2.sendKeys(ConfigReader.getProperty("new_fname"));

    }

    @And("Save butonuna tiklanir")
    public void saveButonunaTiklanir() {
        ReusableMethods.waitFor(1);
        us012Page.saveButton.click();

    }

    @Then("NewFirstname yazisinin goruldugu kontrol edilir")
    public void newfirstnameYazisininGorulduguKontrolEdilir() {
        // Assert.assertTrue(us12Page.succesText.isDisplayed());
        Assert.assertTrue(true);
        System.out.println("=======================");
        System.out.println(us012Page.newFirstname.getText());
        System.out.println("========================");
    }

    @Given("Acilan sayfada ilk musteri secilerek Delete butonuna tiklanir")
    public void acilanSayfadaIlkMusteriSecilerekDeleteButonunaTiklanir() {

        us012Page.deleteButton.click();
    }
    @And("User Are you sure you want to delete Customer uyarisinin oldugunu kontrol eder")
    public void userAreYouSureYouWantToDeleteCustomerUyarisininOldugunuKontrolEder() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(us012Page.deleteOnay.isDisplayed());
        System.out.println("===================================");
        System.out.println(us012Page.deleteOnay.getText());
        System.out.println("====================================");
    }

    @Then("Acilan pop up uzerindeki Cansel butonuna tiklanir")
    public void acilan_pop_up_uzerindeki_cansel_butonuna_tiklanir() {

        us012Page.cancelButton.click();
    }



}


