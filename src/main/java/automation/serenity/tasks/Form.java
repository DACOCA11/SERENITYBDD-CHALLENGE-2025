package automation.serenity.tasks;

import automation.serenity.ui.FormFields;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Form implements Task {
    public final String name;
    public final String lastName;
    public final String postalCode;

    public Form(String name, String lastName, String postalCode) {
        this.name = name;
        this.lastName = lastName;
        this.postalCode = postalCode;
    }
    @Override
    @Step("{0} Completo el formulario de compra")
    public <T extends Actor> void performAs(T actor) {

        // Select Product 1
        actor.attemptsTo(
                WaitUntil.the(FormFields.FIRST_NAME_FIELD, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(name).into(FormFields.FIRST_NAME_FIELD),
                WaitUntil.the(FormFields.LAST_NAME_FIELD, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(lastName).into(FormFields.LAST_NAME_FIELD),
                WaitUntil.the(FormFields.POSTAL_CODE_FIELD, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(postalCode).into(FormFields.POSTAL_CODE_FIELD),
                WaitUntil.the(FormFields.CONTINUE_BUTTON, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(FormFields.CONTINUE_BUTTON)

        );

    }

    public static Performable fillForm(String name, String lastName, String postalCode) {
        return instrumented(Form.class, name, lastName, postalCode);
    }
}
