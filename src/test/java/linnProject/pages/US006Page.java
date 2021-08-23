package linnProject.pages;

import linnProject.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import javax.naming.Name;

public class US006Page {
    public US006Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "account-menu")
    public WebElement insanButonu;

    @FindBy(id = "login-item")
    public WebElement signIn;

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(css = ".btn.btn-primary")
    public WebElement signInClick;
    //.btn.btn-primary
    @FindBy(id = "account-menu")
    public WebElement usertikla;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[3]")
    public WebElement infoTikla;

    @FindBy(xpath = "/html//input[@id='firstName']")
    public WebElement FirsNameGoruntule;

    @FindBy(xpath = "/html//input[@id='lastName']")
    public WebElement lasNameGoruntule;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailGoruntule;

    @FindBy(xpath = "/html//select[@id='langKey']")
    public WebElement languageGoruntule;

    @FindBy(xpath = "//select[@id='langKey']") ///html//select[@id='langKey']
    public WebElement languageBox;

//    @FindBy(xpath = "//select[@id='langKey']")
//    public WebElement dilSecenegiyap;

    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement firstNameDegistir;

    @FindBy(xpath = "//form[@id='settings-form']/button[@type='submit']")

    public WebElement saveButonu;

    //@FindBy(xpath = "//div[@class='Toastify__toast-body']")
    //   @FindBy(css = "@FindBy(css = \"#root > div > div > div.Toastify > div > div > div.Toastify__toast-body\")")
    //@FindBy(xpath = "//div[@class='Toastify__toast Toastify__toast--success toastify-toast']")
    ///html//div[@id='root']//div[@class='app-container']//div[@role='alert']
    //@FindBy(css = "div[role='alert']")
    @FindBy(xpath = "//*[text()='Settings saved!']")
    public WebElement kayitedildiyazisi;

    @FindBy(xpath = "/html//input[@id='lastName']")
    public WebElement lasNameDegistir;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailDegistir;

    @FindBy(className = "invalid-feedback")
    public WebElement emailKabuledilmedi;
}
