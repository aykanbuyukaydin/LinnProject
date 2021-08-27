package linnProject.pages;

import linnProject.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US004Page {

    public US004Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="//*[@id=\"login-item\"]/span")
    public WebElement signin;

    @FindBy(xpath="//*[@id=\"login-title\"]/h5/span")
    public WebElement signin_baslik;

    @FindBy(xpath="//*[@id=\"login-page\"]/div/form/div[2]/div[1]/div[2]/div[1]/label")
    public WebElement username_baslik;

    @FindBy(xpath="//*[@id=\"username\"]")
    public WebElement username_kutusu;

    @FindBy(xpath="//*[@id=\"login-page\"]/div/form/div[2]/div[1]/div[2]/div[2]/label")
    public WebElement password_baslik;

    @FindBy(xpath="//*[@id=\"password\"]")
    public WebElement password_kutusu;

    @FindBy(xpath="//*[@id=\"login-page\"]/div/form/div[2]/div[3]/a/span")
    public WebElement didyouforgetyourpassword_yazisi;

    @FindBy(xpath="//*[@id=\"login-page\"]/div/form/div[2]/div[4]")
    public WebElement youdonthaveaccount_yazisi;

    @FindBy(xpath="//*[@id=\"login-page\"]/div/form/div[3]/button[2]/span")
    public WebElement signin_butonu;

    @FindBy(xpath="//*[@id=\"login-page\"]/div/form/div[3]/button[1]/span")
    public WebElement cancel_butonu;

    @FindBy(xpath="//*[@id=\"account-menu\"]/a/span")
    public WebElement fuat_koca_username;

    @FindBy(xpath="//*[@id=\"login-page\"]/div/form/div[2]/div[1]/div[1]/div/span")
    public WebElement Failedtosignin_mesajı;

    @FindBy(xpath="//*[@id=\"header-tabs\"]/li[1]/a/span/span")
    public WebElement home_anasayfa;

    @FindBy(xpath="//*[@id=\"account-menu\"]/div/a[3]/span")
    public WebElement sign_out;

}
