package automation.serenity.tasks;

import automation.serenity.ui.Finishpurchase;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Fpurchase implements Task {
    @Override
    @Step(" validar pantalla checkout")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(Finishpurchase.FINISH_BUTTON, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(Finishpurchase.FINISH_BUTTON)
        );
    }
    public static Performable validation() {
        return instrumented(Fpurchase.class);
    }
}
