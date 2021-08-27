package linnProject.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import linnProject.pages.US001Page;
import linnProject.utilities.ConfigReader;
import linnProject.utilities.Driver;
import linnProject.utilities.ReusableMethods;
import org.junit.Assert;

public class US001StepDefinitions {

    US001Page registrationPage = new US001Page();

    @Given("is user on the home page")
    public void is_user_on_the_registration_page() {
        Driver.getDriver().get(ConfigReader.getProperty("bank_home_page_url"));

    }
    @Given("user click on humon icon")
    public void user_click_on_humon_icon() {
        registrationPage.humonicon.click();

    }
    @Given("user click on the register button")
    public void user_click_on_the_register_button() {
        registrationPage.register.click();

    }
    @Given("user enters the SSN")
    public void user_enters_the_ssn() {
        registrationPage.ssn.sendKeys(ConfigReader.getProperty("ssn_number"));

    }
    @Given("user enters the first_name")
    public void user_enters_the_first_name() {
        registrationPage.firstName.sendKeys(ConfigReader.getProperty("first_name"));

    }
    @Given("user enters the last_name")
    public void user_enters_the_last_name() {
        registrationPage.lastName.sendKeys(ConfigReader.getProperty("last_name"));

    }


    @Given("user enters the address")
    public void user_enters_the_address() {
        registrationPage.address.sendKeys(ConfigReader.getProperty("address"));

    }
    @Given("user enters the mobile_phohe_number")
    public void user_enters_the_mobile_phohe_number() {
        registrationPage.mobilePhoneNumber.sendKeys(ConfigReader.getProperty("mobile_phone_number"));

    }
    @Given("user enters the username")
    public void user_enters_the_username() {
        registrationPage.username.sendKeys(ConfigReader.getProperty("username"));
    }

    @Given("user enters the email")
    public void user_enters_the_email() {
        registrationPage.email.sendKeys(ConfigReader.getProperty("email"));

    }
    @Given("user enters the new_password")
    public void user_enters_the_new_password() {
        registrationPage.password.sendKeys(ConfigReader.getProperty("new_password_confirmation"));

    }
    @Given("user enters the new_password_confirmation")
    public void user_enters_the_new_password_confirmation() {
        registrationPage.confirmPassword.sendKeys(ConfigReader.getProperty("new_password_confirmation"));

    }
    @Given("user clicks on the register_button")
    public void user_clicks_on_the_register_button() {
        registrationPage.registerButton.click();

    }
    @Then("user verifies the success_message")
    public void user_verifies_the_success_message() {
        // Assert.assertTrue(registrationPage.verifymessage.isDisplayed());
        ReusableMethods.waitForVisibility(registrationPage.verifymessage, 3);
        Assert.assertEquals("Registration saved!",registrationPage.verifymessage.getText());
        System.out.println(registrationPage.verifymessage);

    }

}
