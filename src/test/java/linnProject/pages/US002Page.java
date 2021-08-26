package linnProject.pages;

import linnProject.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US002Page {
    public US002Page() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement anasayfaInsanIkonu;

    @FindBy (xpath = "(//a[@role='menuitem'])[2]")
    public WebElement anasayfaRegisterButton;

    @FindBy (id = "ssn")
    public WebElement registerSayfasiSsnTextBox;

    @FindBy (id = "firstname")
    public WebElement registerSayfasiFirstnameTextBox;

    @FindBy (id = "lastname")
    public WebElement registerSayfasiLastnameTextBox;

    @FindBy (id = "address")
    public WebElement registerSayfasiAddressTextBox;

    @FindBy (id = "mobilephone")
    public WebElement registerSayfasiMobilePhoneTextBox;

    @FindBy (id = "username")
    public WebElement registerSayfasiUsernameTextBox;

    @FindBy (id = "email")
    public WebElement registerSayfasiEmailTextBox;

    @FindBy (id = "firstPassword")
    public WebElement registerSayfasiPasswordTextBox;

    @FindBy (id = "secondPassword")
    public WebElement registerSayfasiPasswordConfirmationTextBox;

    @FindBy (id = "register-submit")
    public WebElement registerSayfasiRegisterButton;

    @FindBy (css = ".Toastify__toast.Toastify__toast--success.toastify-toast > div[role='alert'] > span")
    public WebElement registrationSavedYazisi;

    @FindBy (css = ".invalid-feedback")
    public WebElement SSNinvalidYazisi;

    @FindBy (css = "div:nth-of-type(5) > .invalid-feedback")
    public WebElement PhoneNumberInvlaidYazisi;

    @FindBy (css = "div:nth-of-type(7) > .invalid-feedback")
    public WebElement EmailInvalidYazisi;

    @FindBy (id = "register-title")
    public WebElement registerSayfasiRegisterYazisi;

    @FindBy (css = "div:nth-of-type(7) > label")
    public WebElement registerSayfasiEmailYazisi;
}
