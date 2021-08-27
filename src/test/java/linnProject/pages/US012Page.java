package linnProject.pages;

import linnProject.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US012Page {

    public US012Page(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//li[@class='dropdown nav-item']")
    public WebElement peopleIcon;

    @FindBy(xpath = "//span[text()='Sign in']")
    public WebElement signInLink;

    @FindBy (id = "username")
    public WebElement usernameTextBox;

    @FindBy (id = "password")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement signInButton;

    @FindBy(xpath = "//span[text()='My Operations']")
    public WebElement myOperationsLink;

    @FindBy(xpath = "//span[text()='Manage Customers']")
    public WebElement manageCustomersLink;

    @FindBy(xpath = "//span[text()='Customers']")
    public WebElement customerPage;

    @FindBy (xpath = "(//a[@class='btn btn-info btn-sm'])[1]")
    public WebElement viewButton;

    @FindBy(xpath = "//h2")
    public WebElement customerInformation;

    @FindBy(xpath = "//a[@class='btn btn-primary']")
    public WebElement customerEdit;

    @FindBy(xpath = "//a[@class='btn btn-info']")
    public WebElement backButton;

    @FindBy (xpath = "(//span[text()='Edit'])[1]")
    public WebElement editButton;

    @FindBy(xpath = "//span[text()='Create or edit a Customer']")
    public WebElement createorEditWriting;

    @FindBy(xpath = "(//a[@class='btn btn-danger btn-sm'])[1]")
    public WebElement deleteButton;

    @FindBy(xpath = "//button[@class='btn btn-secondary']")
    public WebElement cancelButton;

    @FindBy(id = "gmibankfrontendApp.tPCustomer.delete.question")
    public WebElement alertWriting;

    @FindBy (xpath = "//*[@id=\"app-view-container\"]/div[1]/div/div/div/div[1]/div/table/tbody/tr[1]/td[10]/div/a[3]")
    public WebElement deleteButtonNew;

    @FindBy(xpath = "//span[text()='Are you sure you want to delete Customer 1719?']")
    public WebElement deleteOnayi;

    @FindBy(xpath = "//div[@id='gmibankfrontendApp.tPCustomer.delete.question']")
    public WebElement deleteOnay;

    @FindBy(xpath ="//button[@class='btn btn-secondary']")
    public WebElement canselButton;

    @FindBy(css = "h5 > span")
    public WebElement confirmDeleteOperationYazisi;

    @FindBy(id = "jhi-confirm-delete-tPCustomer")
    public WebElement deleteAlert;

    @FindBy (id = "account-menu")
    public WebElement employeeLink;

    @FindBy (xpath = "//span[text()='User Info']")
    public WebElement infoButton;
    @FindBy(xpath = "//h2")
    public WebElement userSettings;
    @FindBy(id = "firstName")
    public WebElement firstnameTextBox2;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement saveButton;

    @FindBy(xpath = "//input[@value='NewFirstname']")
    public WebElement newFirstname;

    public List<String> expectedElementList = Arrays.asList("ID", "First Name","Last Name","Middle Initial","Email","Mobile Phone Number","Phone Number","Address","Create Date");

    public List<String> actualElementlist(){
        List<String> actualElementList = new ArrayList<>();
        for (int i = 1; i <= expectedElementList.size(); i++) {
            String eachElementLocator = "thead > tr > th:nth-child("+i+") > span";
            String eachElement = Driver.getDriver().findElement(By.cssSelector(eachElementLocator)).getText();
            actualElementList.add(eachElement);
        }
        return actualElementList;
    }
}

