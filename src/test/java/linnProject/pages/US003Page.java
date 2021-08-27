package linnProject.pages;

import linnProject.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US003Page {
    public US003Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id ="account-menu")
    public  WebElement menu;

    @FindBy(id ="strengthBar")
    public  WebElement strengthBar;

    @FindBy(xpath ="//*[@id=\"account-menu\"]/a")
    public  WebElement dropdownMenu;

    @FindBy(xpath ="//*[@id=\"account-menu\"]/div/a[2]/span")
    public  WebElement register;

    @FindBy(xpath ="//*[@id=\"register-form\"]/div[8]/label")
    public  WebElement password;

    @FindBy(xpath ="//*[@id=\"firstPassword\"]")
    public  WebElement password_kutusu;

    @FindBy(xpath ="//*[@id=\"register-form\"]/div[8]/div")
    public  WebElement password_hata_mesajı;

    @FindBy(xpath ="//*[@id=\"register-submit\"]/span")
    public  WebElement register_submit;

    @FindBy(xpath ="//*[@id=\"strength\"]")
    public  WebElement password_strength;

    @FindBy(xpath ="//*[@id=\"strengthBar\"]")
    public  WebElement strength_bar;

    @FindBy(xpath ="//*[@id=\"strengthBar\"]/li[4]")
    public  WebElement strength_bar_seviye;

    @FindBy(xpath ="//*[@id=\"strengthBar\"]/li[1]")
    public  WebElement strength_bar_seviye_kırmızı;

    @FindBy(xpath ="//*[@id=\"strengthBar\"]/li[2]")
    public  WebElement strength_bar_turuncu;

    @FindBy(xpath ="//*[@id=\"strengthBar\"]/li[4]")
    public  WebElement strength_bar_seviye_4_yesil;

    @FindBy(xpath ="//*[@id=\"strengthBar\"]/li[4]")
    public  WebElement strength_bar_son_seviye;

}



