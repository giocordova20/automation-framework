package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(features = {
        "classpath:features"},
        glue = {"stepDefinitions"},
        tags = "", // used to run specific scenarios or feature files. Remove the tag when using Jenkins to launch the scripts
        monochrome = true,
        dryRun = false,
        plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json"} // create reports
        )


public class MainRunner extends AbstractTestNGCucumberTests {
        @Override                               // used to run the test scenarios in parallel
        @DataProvider(parallel = true)
        public Object[][] scenarios() {
                return super.scenarios();
        }
}
