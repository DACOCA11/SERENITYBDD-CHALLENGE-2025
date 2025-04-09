package automation.serenity.stepdefinition;

import automation.serenity.tasks.Form;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import org.hamcrest.Matchers;

import static automation.serenity.utils.Constants.CHECKOUT_URL;
import static automation.serenity.utils.Constants.TIME_SHORT;
import static automation.serenity.utils.Time.waiting;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FormCompleted {
 @When("completo el formulario de compra con {string} {string} {string}")
 public void fillForm(String name, String lastName, String postalCode) {
     OnStage.theActorInTheSpotlight().attemptsTo(Form.fillForm(name, lastName, postalCode));

     waiting(TIME_SHORT);
     theActorInTheSpotlight().should(
             GivenWhenThen.seeThat(TheWebPage.currentUrl(), Matchers.containsString(CHECKOUT_URL))
     );
 }
}
