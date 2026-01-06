package myApp.runner;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/featureFiles",
        glue = {"myApp.stepDefinition", "myApp.hook"},
        plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber-reports/cucumber.json",
                "junit:target/cucumber-reports/cucumber.xml"

        },tags = "@addHospitalWithValidData",
        monochrome = true
)
public class TestRunner {
}

