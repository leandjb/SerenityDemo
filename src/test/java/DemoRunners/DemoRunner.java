package DemoRunners;

import io.cucumber.java.en.Given;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.*;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src\\test\\resources\\Demo.feature",
        glue = "DemoStepDefinition",
        snippets = SnippetType.CAMELCASE
)

public class DemoRunner {

    /*
    @Given("^condicion")
    public void condicion(){
    }*/

}
