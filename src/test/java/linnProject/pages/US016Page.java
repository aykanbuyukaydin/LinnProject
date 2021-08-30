package linnProject.pages;

import linnProject.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US016Page {
    public US016Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id ="account-menu")
    public WebElement insanSimgesi;

    @FindBy(id ="login-item")
    public WebElement ilkLoginLinki;

    @FindBy(id = "username")
    public WebElement userTextBox;

    @FindBy(id = "password")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButonu;

    @FindBy (id = "entity-menu")
    public WebElement myOperations;

    @FindBy (linkText = "My Accounts")
    public WebElement myAccounts;

    @FindBy (xpath = "//div//h2")
    public WebElement customerAccountsYazisi;

    @FindBy (linkText = "Transfer Money")
    public WebElement transferMoneyeTikla;

    @FindBy (xpath = "//select[@id='fromAccountId']")
    public WebElement ilkHesabiSecme;

    @FindBy (xpath = "//select[@id='toAccountId']")
    public WebElement ikinciHesabiSecme;

    @FindBy (id = "description")
    public WebElement transferAciklamasi;

    @FindBy (id = "balance")
    public WebElement transferMiktari;

    @FindBy (id = "make-transfer")
    public WebElement makeTransferButonu;

    @FindBy (xpath="//div[@class='Toastify__toast-body']")
    public WebElement transferBasariliAlerti;

}
