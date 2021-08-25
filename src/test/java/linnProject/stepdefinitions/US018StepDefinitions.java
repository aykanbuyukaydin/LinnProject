package linnProject.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import linnProject.pages.US018Page;
import linnProject.utilities.ConfigReader;
import linnProject.utilities.Driver;
import linnProject.utilities.ReusableMethods;
import org.junit.Assert;

public class US018StepDefinitions {

    US018Page us018Page = new US018Page();

    @Given("kullanci {string} sayfasina gider")
    public void kullanci_sayfasina_gider(String url_home) {

        Driver.getDriver().get(ConfigReader.getProperty("url_home"));

    }

    @Given("insan butonuna tiklar")
    public void insan_butonuna_tiklar() {

        us018Page.insanButton.click();

    }

    @Given("sign in click yapar")
    public void sign_in_click_yapar() {

        us018Page.firstSignInButton.click();

    }

    @And("kulanici username girer")
    public void kulaniciUsernameGirer() {

        us018Page.usernameTextBox.sendKeys(ConfigReader.getProperty("kr_gecerli_username"));

    }

    @And("kulanici password girer")
    public void kulaniciPasswordGirer() {

        us018Page.passwordTextBox.sendKeys(ConfigReader.getProperty("kr_gecerli_password"));
    }


    @And("kulanici Signin tiklar")
    public void kulaniciSigninTiklar() {

        us018Page.secondSignInButton.click();
    }


    @Given("My operations yazisina click yap")
    public void my_operations_yazisina_click_yap() {

        us018Page.myOperationsButton.click();

    }

    @Given("Manage Customers yazisina click yap")
    public void manage_customers_yazisina_click_yap() {

        us018Page.manageCustomersButton.click();

    }

    @Then("Customers yazisin görünür mü check et")
    public void customers_yazisin_görünür_mü_check_et() {

        Assert.assertTrue(us018Page.customersYazisi.isDisplayed());

    }

    @Given("View butonuna click yap")
    public void view_butonuna_click_yap() {

        us018Page.viewButton.click();

    }

    @Given("Customer yazisi görülmeli")
    public void customer_yazisi_görülmeli() {

        Assert.assertTrue(us018Page.customerText.isDisplayed());

    }

    @Given("Edit butonuna click yap")
    public void edit_butonuna_click_yap() {

        us018Page.editButton.click();

    }

    @Then("Create or edit a user yazisi görünür olmali")
    public void create_or_edit_a_user_yazisi_görünür_olmali() {

        Assert.assertTrue(us018Page.createodEditYazisi.isDisplayed());

    }

    @Given("lastname degistir")
    public void lastname_degistir() {

        us018Page.lastnameTextBox.clear();
        us018Page.lastnameTextBox.sendKeys(ConfigReader.getProperty("kr_lastname_degis"));

    }

    @And("Save butonuna click yap")
    public void saveButonunaClickYap() {

        us018Page.saveButton.click();
    }

    @Given("translation-not-found[gmiBankBackendApp.tPCustomer.updated] yazisi görülmeli")
    public void translation_not_found_gmi_bank_backend_app_t_p_customer_updated_yazisi_görülmeli() {

        ReusableMethods.waitForVisibility(us018Page.editOlduYazisi,5000);
        Assert.assertTrue(us018Page.editOlduYazisi.isDisplayed());


    }

    @Given("Delete butonuna click yap")
    public void delete_butonuna_click_yap() {

        us018Page.firstdeleteButton.click();

    }

    @Given("confirmDeleteOperation yazisi görülmeli")
    public void confirm_delete_operation_yazisi_görülmeli() {

        System.out.println(us018Page.confirmDeleteOperationYazisi.getAttribute("innerHTML"));
        Assert.assertEquals("Confirm delete operation",us018Page.confirmDeleteOperationYazisi.getAttribute("innerHTML"));

    }

    @Given("Acilan penceredeki delete butonuna click yap")
    public void acilan_penceredeki_delete_butonuna_click_yap() throws InterruptedException {

        Thread.sleep(5000);
        us018Page.secondDeleteButton.click();



    }

    @Given("translation-not-found[gmiBankBackendApp.tPCustomer.deleted] yazisi görülmeli")
    public void translation_not_found_gmi_bank_backend_app_t_p_customer_deleted_yazisi_görülmeli() {

        System.out.println(us018Page.silindiYazisi.getText());
        System.out.println("================================");
        System.out.println(us018Page.silindiYazisi.getAttribute("innerHTML"));
        //Assert.assertTrue(us018Page.silindiYazisi.isDisplayed());

    }

}
