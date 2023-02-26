package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(publish=true,features="src/test/resources/Features",
     glue= {"StepDefinitions"},
     plugin= {"pretty","html:target/cucumber-html-report","json:target/cucumber-reports/cucumber.json","junit:target/cucmber-reports/cucumber.xml"},
    monochrome=true,
    tags="@Sanity")
   
   public class TestRunner {
	

}
