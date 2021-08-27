package linnProject.stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import linnProject.pages.US019Page;
import linnProject.utilities.ConfigReader;
import org.openqa.selenium.support.ui.Select;

public class US019StepDefinitions {

    US019Page us019Page = new US019Page();

    @And("Manage Accounts yazisina click yap")
    public void manageAccountsYazisinaClickYap() {

        us019Page.manageAccountsButton.click();
    }

    @Given("Create a new Account butonuna click yap")
    public void create_a_new_account_butonuna_click_yap() {

        us019Page.createanewAccountButton.click();

    }

    @Given("Description text box'una bir aciklama gir")
    public void description_text_box_una_bir_aciklama_gir() {

        us019Page.descriptionTextBox.sendKeys(ConfigReader.getProperty("kr_gecerli_aciklama"));


    }

    @And("Balance text box una gecerli bir bakiye girilmelidir")
    public void balanceTextBoxUnaGecerliBirBakiyeGirilmelidir() {

        us019Page.balanceTextBox.sendKeys(ConfigReader.getProperty("kr_gecerli_balance"));

    }

    @Given("Account Type kismindan bir hesap türü sec")
    public void account_type_kismindan_bir_hesap_türü_sec() {

        Select select = new Select(us019Page.accountTypeButton);
        select.selectByIndex(1);

    }

    @Given("Account Status Type kismindan hesap durumunu tanimla")
    public void account_status_type_kismindan_hesap_durumunu_tanimla() {

        Select select = new Select(us019Page.accountStatusTypeButton);
        select.selectByIndex(1);

    }

}

