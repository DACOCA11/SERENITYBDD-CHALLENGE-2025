package automation.serenity.stepdefinition;

import automation.serenity.tasks.OpenPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import org.hamcrest.Matchers;

import static automation.serenity.utils.Constants.TIME_SHORT;
import static automation.serenity.utils.Constants.TITLE;
import static automation.serenity.utils.Time.waiting;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class OpenWeb {
    @Before
    public void setTheStage() { OnStage.setTheStage(new OnlineCast()); }

    @Given("que {string} accede al sitio web")
    public void openWebSite(String actor) {
        OnStage.theActorCalled(actor).attemptsTo(OpenPage.browserURL());

        waiting(TIME_SHORT);
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(TheWebPage.title(), Matchers.containsString(TITLE))
        );
    }




}
