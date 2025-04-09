package automation.serenity.stepdefinition;

import automation.serenity.tasks.Checkout;
import io.cucumber.java.en.And;

import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import org.hamcrest.Matchers;
import org.junit.Assert;

import static automation.serenity.utils.Constants.*;
import static automation.serenity.utils.Time.waiting;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CheckoutCompleted {

    @And("finalizo la compra")
    public void endFlow() {
        OnStage.theActorInTheSpotlight().attemptsTo(Checkout.purchaseCompleted());

        String confirmationMessage = theActorInTheSpotlight().recall("confirmationMessage");

        waiting(TIME_SHORT);
        Assert.assertEquals("Validate the text ", CONFIRMATION_MESSAGE, confirmationMessage );
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(TheWebPage.currentUrl(), Matchers.containsString(CHECKOUT_COMPLETED_URL))
        );
    }

}
