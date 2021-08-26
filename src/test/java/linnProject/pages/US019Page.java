package linnProject.pages;

import linnProject.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US019Page {

    public US019Page() {

        PageFactory.initElements(Driver.getDriver(),this);
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

    @FindBy(css = "li#entity-menu > div > a:nth-of-type(2) > span")
    public WebElement manageAccountsButton;

    @FindBy(id = "jh-create-entity")
    public WebElement createanewAccountButton;

    @FindBy(id = "tp-account-description")
    public WebElement descriptionTextBox;

    @FindBy(css = ".invalid-feedback")
    public WebElement thisfieldisRequiredHataYazisi;

    @FindBy(id = "tp-account-balance")
    public WebElement balanceTextBox;

    @FindBy(id = "tp-account-accountType")
    public WebElement accountTypeButton;

    @FindBy(id = "tp-account-accountStatusType")
    public WebElement accountStatusTypeButton;
}
