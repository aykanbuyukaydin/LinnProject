package linnProject.pages;

import linnProject.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class US009Page {
    public US009Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement insanFigur;

    @FindBy(xpath = "//a[@id='login-item']")
    public WebElement signinButon;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement usernameTextBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement signinButton;

    @FindBy(xpath = "//li[@id='entity-menu']")
    public WebElement myOperations;

    @FindBy(xpath = "//a[@class='dropdown-item']")
    public WebElement manageCustomers;

    @FindBy(xpath = "//a[@id='jh-create-entity']")
    public WebElement createANewCustomer;

    @FindBy(xpath = "//input[@id='search-ssn']")
    public WebElement ssnTextBox;

    @FindBy(xpath = "//button[@class='btn btn-secondary']")
    public WebElement searchButton;

    @FindBy(xpath = "//div[@class='Toastify']")
    public WebElement searchBasariliUyarisi;

    @FindBy(xpath = "//input[@id='tp-customer-mobilePhoneNumber']")
    public WebElement mobilePhoneNumberTextBox;

    @FindBy(xpath = "//input[@id='tp-customer-middleInitial']")
    public WebElement middleInitialTextBox;

    @FindBy(xpath = "//input[@id='tp-customer-phoneNumber']")
    public WebElement phoneNumberTextBox;

    @FindBy(xpath = "//input[@id='tp-customer-zipCode']")
    public WebElement zipCodeTextBox;

    @FindBy(xpath = "//input[@id='tp-customer-city']")
    public WebElement cityTextBox;

    @FindBy(xpath = "//input[@id='tp-customer-createDate']")
    public WebElement createDateTextBox;

    @FindBy(xpath = "//select[@id='tp-customer-user']")
    public WebElement userSelect;

    @FindBy(xpath = "//select[@id='tp-customer-account']")
    public WebElement accountSelect;

    @FindBy(xpath = "//input[@id='tp-customer-zelleEnrolled']")
    public WebElement zelleBox;

    @FindBy(xpath = "//button[@id='save-entity']")
    public WebElement saveButton;




}