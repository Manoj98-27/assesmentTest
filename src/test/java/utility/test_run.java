package utility;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "classpath:scenarios",
        glue = "classpath:steps",
        publish = true,
        monochrome = true
)

public class test_run extends AbstractTestNGCucumberTests {
}
