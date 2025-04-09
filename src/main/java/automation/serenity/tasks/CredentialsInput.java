package automation.serenity.tasks;

import automation.serenity.ui.LoginP;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.util.EnvironmentVariables;

import static automation.serenity.utils.Constants.PASSW;
import static automation.serenity.utils.Constants.USERN;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CredentialsInput implements Task {

private EnvironmentVariables environmentVariables;

    @Override
    @Step ("introduzco credenciales e inicio de sesión")
    public <T extends Actor> void performAs(T actor) {
        String username = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(USERN);
        String password = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(PASSW);

        actor.attemptsTo(
                WaitUntil.the(LoginP.USER_NAME_FIELD, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(username).into(LoginP.USER_NAME_FIELD),
                WaitUntil.the(LoginP.PASSWORD_FIELD, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(password).into(LoginP.PASSWORD_FIELD),
                WaitUntil.the(LoginP.LOGIN_BUTTON, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(LoginP.LOGIN_BUTTON)
        );
    }
    public static Performable Credentials() {
        return instrumented(CredentialsInput.class);
    }

}
