package automation.serenity.hook;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.util.EnvironmentVariables;

import static automation.serenity.utils.Constants.WEB_URL;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenW implements Task {
    private EnvironmentVariables envVariables;

    @Override
    public <T extends Actor> void performAs(T actor) {
        String pathWebUrl = EnvironmentSpecificConfiguration.from(envVariables).getProperty(WEB_URL);
        actor.attemptsTo(net.serenitybdd.screenplay.actions.Open.url(pathWebUrl));
    }

    public static Performable browserURL() {
        return instrumented(OpenW.class);
    }

}
