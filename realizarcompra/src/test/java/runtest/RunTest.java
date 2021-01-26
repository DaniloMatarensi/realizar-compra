package runtest;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"}, glue = "steps", features = "src/test/java/features", tags = "@RealizarCompra")
public class RunTest
{

}