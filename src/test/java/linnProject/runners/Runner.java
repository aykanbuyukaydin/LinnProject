package linnProject.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(


        plugin={"html:target\\cucumber-raporlar.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"},

        features="src/test/resources/features",
        glue="linnProject/stepdefinitions",


        tags="@wipemre3", // work in progress



        dryRun=false

)

public class Runner {

}
