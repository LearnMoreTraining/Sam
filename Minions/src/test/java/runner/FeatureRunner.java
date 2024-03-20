package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(

     features = {"src/test/resources/featurefile"} ,
     glue = {"stepdefination"},
     tags = "@Mouse",
     plugin = {"pretty",
               "html:target/output/cucumberreport.html",
             "json:target/output/rep.json",
             "junit:target/output/report.xml"
     }

)

public class FeatureRunner {
}
