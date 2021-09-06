package linnProject.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import linnProject.pojos.Country_Ders_linn;
import linnProject.pojos.Customer_Ders_linn;

import java.util.ArrayList;
import java.util.List;

import static linnProject.utilities.DatabaseUtility.createConnection;
import static linnProject.utilities.DatabaseUtility.getQueryResultList;
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
    public void pdf_ders_bankUserCreatesAConnectionWithDbUsingAnd(int arg0, String url, String user, String password) {

        //once connection kurulmali
        //createConnection(); feature dosyasinda url, user ve password parametreleri verildiği için parametreli createConnection kullanıyoruz
        createConnection(url, user, password);



    }

    @And("pdf_ders_bank{int} user provides the query {string}")
    public void pdf_ders_bankUserProvidesTheQuery(int arg0, String query) {

        List<Customer_Ders_linn> customersList = new ArrayList<>();

        List<List<Object>> lists = getQueryResultList(query);

        for(int i = 0; i <= 10; i++){

            Customer_Ders_linn customer_ders_linn = new Customer_Ders_linn();
            customer_ders_linn.setFirstName(lists.get(i).get(1).toString());
            customer_ders_linn.setLastName(lists.get(i).get(2).toString());
            customer_ders_linn.setMiddleInitial(lists.get(i).get(3).toString());
            customer_ders_linn.setEmail(lists.get(i).get(4).toString());
            customer_ders_linn.setMobilePhoneNumber(lists.get(i).get(5).toString());

            customersList.add(customer_ders_linn);

        }

        pdfGeneratorRowsAndCellsWithListFirstToTen("                   ****PDF_SON_DENEME**** \n           "  +
                "                                === First Ten Customer Some Info===                    " ,
                customersList, "Ders_Sonu.pdf");



    }
}
