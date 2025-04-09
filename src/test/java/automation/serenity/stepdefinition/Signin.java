package automation.serenity.stepdefinition;

import automation.serenity.tasks.CredentialsInput;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import org.hamcrest.Matchers;

import static automation.serenity.utils.Constants.INVENTORY_URL;
import static automation.serenity.utils.Constants.TIME_SHORT;
import static automation.serenity.utils.Time.waiting;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Signin {
    @When("introduzco credenciales e inicio de sesión")
    public void login() {
        OnStage.theActorInTheSpotlight().attemptsTo(CredentialsInput.Credentials());

        waiting(TIME_SHORT);
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(TheWebPage.currentUrl(), Matchers.containsString(INVENTORY_URL))
        );
    }
}
