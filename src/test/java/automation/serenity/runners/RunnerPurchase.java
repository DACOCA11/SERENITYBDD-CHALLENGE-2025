package automation.serenity.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/TestPurchase.feature",
        glue = "automation.serenity.stepdefinition",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@happypath"
)
public class RunnerPurchase {
}
