package linnProject.pages;

import linnProject.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class US010Page {

    public US010Page () {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement insanFiguru;

    @FindBy (id = "login-item")
    public WebElement singinButtonu;

    @FindBy (css = "#username")
    public WebElement username;

    @FindBy (css = "#password")
    public WebElement password;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement kayitSayfasiSinginButton;

    @FindBy (xpath = "//a[.='My Operations']")
    public WebElement myOperationsButtonu;

    @FindBy (xpath = "//a[@class='dropdown-item'][1]")
    public WebElement manageCustomersSekmesi;

    @FindBy (id = "jh-create-entity")
    public WebElement createANewCustomersSekmesi;

    @FindBy (css = "#search-ssn")
    public WebElement ssnTextbox;

    @FindBy (xpath = "//*[@class='btn btn-secondary']")
    public WebElement searchButtonu;

    @FindBy (xpath = "//*[@name='middleInitial']")
    public WebElement middleInitialTextbox;

    @FindBy (css = "#tp-customer-phoneNumber")
    public WebElement phoneNumberTextbox;

    @FindBy (css = "#tp-customer-zipCode")
    public WebElement zipCodeTextbox;

    @FindBy (css = "#tp-customer-city")
    public WebElement cityTextbox;

    @FindBy (css = "#tp-customer-address")
    public WebElement addressTextbox;

    @FindBy (id = "save-entity")
    public WebElement saveButtonu;

    @FindBy (css = ".Toastify__toast-body")
    public WebElement hataMesaji;

    @FindBy (name = "country.id")
    public WebElement countryTextbox;

    public void dropdownHandle(String country){
        Select options = new Select(countryTextbox);
        options.selectByVisibleText(country);
    }

    @FindBy (css = "#tp-customer-state")
    public WebElement stateTextbox;















}
