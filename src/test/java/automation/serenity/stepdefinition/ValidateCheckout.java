package automation.serenity.stepdefinition;

import automation.serenity.tasks.Fpurchase;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ValidateCheckout {

    @Then("validar pantalla checkout")
    public void checkOutValidation() {
        OnStage.theActorInTheSpotlight().attemptsTo(Fpurchase.validation());

    }
}
