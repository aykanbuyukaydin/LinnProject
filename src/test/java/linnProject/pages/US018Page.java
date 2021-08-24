package linnProject.pages;

import linnProject.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US018Page {

    public US018Page() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "li#account-menu > a > svg[role='img']")
    public WebElement insanButton;

    @FindBy(xpath = "//a[@id='login-item']/span[.='Sign in']")
    public WebElement firstSignInButton;

    @FindBy(xpath = "/html//input[@id='username']")
    public WebElement usernameTextBox;

    @FindBy(xpath = "/html//input[@id='password']")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement secondSignInButton;

    @FindBy(css = "li#entity-menu > a > span")
    public WebElement myOperationsButton;

    @FindBy(css = "li#entity-menu > div > a:nth-of-type(1) > span")
    public WebElement manageCustomersButton;

    @FindBy(css = "h2#tp-customer-heading > span")
    public WebElement customersYazisi;

    @FindBy(css = "tr:nth-of-type(1) > .text-right > .btn-group.flex-btn-group-container > .btn.btn-info.btn-sm")
    public WebElement viewButton;

    @FindBy(css = "h2 > span")
    public WebElement customerText;

    @FindBy(css = "tr:nth-of-type(1) > .text-right > .btn-group.flex-btn-group-container > .btn.btn-primary.btn-sm > span > span")
    public WebElement editButton;

    @FindBy(css = "h2#gmibankfrontendApp\\.tPCustomer\\.home\\.createOrEditLabel > span")
    public WebElement createodEditYazisi;

    @FindBy(xpath = "/html//input[@id='tp-customer-lastName']")
    public WebElement lastnameTextBox;

    @FindBy(id = "save-entity")
    public WebElement saveButton;

    @FindBy(css = "#root > div > div > div.Toastify > div > div > div.Toastify__toast-body")
    public WebElement editOlduYazisi;

    @FindBy(xpath = "(//*[text()='Delete'])[3]")
    public WebElement firstdeleteButton;

    @FindBy(xpath = "//*[text()='Confirm delete operation']")
    public WebElement confirmDeleteOperationYazisi;

    @FindBy(xpath = "(//button[@type='button'])[4]")
    public WebElement secondDeleteButton;

    @FindBy(className = "Toastify__toast-body")
    public WebElement silindiYazisi;
}
