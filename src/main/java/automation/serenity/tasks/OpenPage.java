package automation.serenity.tasks;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.util.EnvironmentVariables;

import static automation.serenity.utils.Constants.WEB_URL;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenPage implements Task {

    private EnvironmentVariables envVariables;

    @Override
    @Step("{0}Abrir el pagina Web")
    public <T extends Actor> void performAs(T actor) {

        String pathWebUrl = EnvironmentSpecificConfiguration.from(envVariables).getProperty(WEB_URL);
        actor.attemptsTo(Open.url(pathWebUrl));
    }

    public static Performable browserURL() {

        return instrumented(OpenPage.class);
    }
}
