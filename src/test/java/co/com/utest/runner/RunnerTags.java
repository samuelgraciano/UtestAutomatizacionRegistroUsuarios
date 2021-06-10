package co.com.utest.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/uTest_Registrar_persona.feature",
        glue = {"co.com.utest.stepdefinitions"},
        snippets = SnippetType.CAMELCASE
)
public class RunnerTags {
}
