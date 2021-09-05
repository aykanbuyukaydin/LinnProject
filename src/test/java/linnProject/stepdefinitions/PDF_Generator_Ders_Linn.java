package linnProject.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import linnProject.pojos.Country_Ders_linn;
import linnProject.pojos.Customer_Ders_linn;

import java.util.ArrayList;
import java.util.List;

import static linnProject.utilities.PDFGenerator.*;

public class PDF_Generator_Ders_Linn {

    public static void main(String[] args){

        //pdfGenerator("Deneme", "Bank7Ders.pdf");

        //pdfGeneratorRowsAndCells("Deneme2", "Bank7Ders2.pdf");

        List<Customer_Ders_linn> list = new ArrayList<>();
        Customer_Ders_linn customer_ders_linn = new Customer_Ders_linn();
        customer_ders_linn.setFirstName("Ali");
        customer_ders_linn.setSsn("1234");
        Country_Ders_linn country_ders_linn = new Country_Ders_linn();
        country_ders_linn.setName("USA");
        customer_ders_linn.setCountry(country_ders_linn);
        customer_ders_linn.setState("Ohio");
        customer_ders_linn.setZipCode("00000");

        list.add(customer_ders_linn);

        pdfGeneratorRowsAndCellsWithList("          Deneme3", list, "Bank7Ders3.pdf");

    }


    @Given("pdf_ders_bank{int} user creates a connection with db using {string} , {string} and {string}")
    public void pdf_ders_bankUserCreatesAConnectionWithDbUsingAnd(int arg0, String arg1, String arg2, String arg3) {



    }

    @And("pdf_ders_bank{int} user provides the query {string}")
    public void pdf_ders_bankUserProvidesTheQuery(int arg0, String arg1) {


    }
}
