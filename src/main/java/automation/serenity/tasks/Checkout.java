package automation.serenity.tasks;

import automation.serenity.ui.CheckoutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Checkout implements Task {
    @Override
    @Step("finalizo la compra")
    public <T extends Actor> void performAs(T actor) {

        WaitUntil.the(CheckoutPage.CONFIRMATION_MESSAGE, isVisible()).forNoMoreThan(20).seconds();
        String confirmationMessage = Text.of(CheckoutPage.CONFIRMATION_MESSAGE).answeredBy(actor);
        actor.remember("confirmationMessage", confirmationMessage);

        actor.attemptsTo(

                WaitUntil.the(CheckoutPage.CONFIRMATION_MESSAGE, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(CheckoutPage.CONFIRMATION_MESSAGE)

        );
    }

    public static Performable purchaseCompleted() { return instrumented(Checkout.class); }

}
