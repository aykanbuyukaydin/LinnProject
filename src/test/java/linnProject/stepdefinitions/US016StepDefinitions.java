package linnProject.stepdefinitions;

import io.cucumber.java.en.And;
import linnProject.pages.US016Page;
import linnProject.utilities.Driver;
import linnProject.utilities.ReusableMethods;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class US016StepDefinitions {
    US016Page us016Page = new US016Page();
    Actions actions = new Actions(Driver.getDriver());


    @And("Customer Accounts yazisini gorur")
    public void CustomerAccountsYazisiniGorur() {
        System.out.println("Hesaplarin Oldugunu Gosteren Yazi: "+ us016Page.customerAccountsYazisi.getText());
    }


    @And("Transfer Money'e tiklar")
    public void transferMoneyETiklar() {
        us016Page.transferMoneyeTikla.click();
    }

    @And("Ilk hesabi secer")
    public void ilkHesabiSecer() {
        Select select = new Select(us016Page.ilkHesabiSecme);
        ReusableMethods.waitFor(2);
        select.selectByIndex(2);
        ReusableMethods.waitFor(2);
        System.out.println("From dropdownda ilk cikan hesap: "+ select.getFirstSelectedOption().getText());
    }

    @And("To cubugundan ikinci hesabi secer")
    public void toCubugundanIkinciHesabiSecer() {
        Select select = new Select(us016Page.ikinciHesabiSecme);
        ReusableMethods.waitFor(2);
        select.selectByIndex(2);
        ReusableMethods.waitFor(2);
        System.out.println("To dropdownda cikan ikinci hesap: "+ select.getFirstSelectedOption().getText());

    }


    @And("Descriptiona transfer aciklamasi girer")
    public void descriptionaTransferAciklamasiGirer() {
        us016Page.transferAciklamasi.sendKeys("kira odemesi");
        System.out.println("Descriptionda girilen text: " + us016Page.transferAciklamasi.getText());

    }

    @And("Balance boxina bir miktar girer")
    public void balanceBoxinaBirMiktarGirer() {
        us016Page.transferMiktari.sendKeys("2");
        System.out.println("Balance boxina girilen miktar: "+ us016Page.transferMiktari.getText());
    }

    @And("tranferi gerceklestirir")
    public void tranferiGerceklestirir() {
        us016Page.makeTransferButonu.click();

    }


    @And("Transfer is succesfull alertini gorur.")
    public void transferIsSucsesfullAlertiniGorur() {
        ReusableMethods.waitFor(2);
        String expectedAllertYazisi ="Transfer is succesfull";
        String actualAllertYazisi = us016Page.transferBasariliAlerti.getText();
        System.out.println("Transfer sonrasi allerte cikan yazi :"+ actualAllertYazisi );

        Assert.assertEquals(expectedAllertYazisi,actualAllertYazisi);
    }
}
