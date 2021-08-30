package linnProject.pages;

import linnProject.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US001Page {
    public US001Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement humonicon;

    @FindBy(xpath = "//*[text()='Register']")
    public WebElement register;

    @FindBy(id = "ssn")
    public WebElement ssn;

    @FindBy(id = "firstname")
    public WebElement firstName;

    @FindBy(id = "lastname")
    public WebElement lastName;

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "address")
    public WebElement address;

    @FindBy(id = "mobilephone")
    public WebElement mobilePhoneNumber;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "firstPassword")
    public WebElement password;

    @FindBy(id = "secondPassword")
    public WebElement confirmPassword;

    @FindBy(id = "register-submit")
    public WebElement registerButton;

    @FindBy(xpath = "//*[text()='Registration saved!']")
    public WebElement verifymessage;

}
