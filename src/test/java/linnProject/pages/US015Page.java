package linnProject.pages;

import linnProject.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class US015Page {

    public US015Page(){
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

    @FindBy (xpath = "//td[\"CHECKING\"][2]")
    public WebElement hesapTuru;

    @FindBy (xpath = "//td[\"CHECKING\"][3]")
    public WebElement hesapBakiyesi;

    @FindBy (xpath = "//button[@class='btn btn-success btn-sm']")
    public WebElement viewTransaction;

    @FindBy (xpath = "(//tbody//tr[1]//td[3])[2]")
    public WebElement islemAciklamasi;

}
