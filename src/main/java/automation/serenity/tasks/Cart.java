package automation.serenity.tasks;

import automation.serenity.ui.CartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Cart implements Task {

    @Override
    @Step("verifico que el carrito tenga los dos productos")
    public <T extends Actor> void performAs(T actor) {

        //Get info from the items in the cart
        WaitUntil.the(CartPage. PRODUCT_1_NAME, isVisible()).forNoMoreThan(20).seconds();
        String cartProductName1 = Text.of(CartPage. PRODUCT_1_NAME).answeredBy(actor);
        String cartProductName2 = Text.of(CartPage. PRODUCT_2_NAME).answeredBy(actor);
        String cartProductDescription1 = Text.of(CartPage.PRODUCT_1_DESCRIPTION).answeredBy(actor);
        String cartProductDescription2= Text.of(CartPage.PRODUCT_2_DESCRIPTION).answeredBy(actor);

        String cartProductPrice2 = Text.of(CartPage.PRODUCT_2_PRICE).answeredBy(actor);

        //Store the data from the cart
        actor.remember("cartProductName1", cartProductName1);
        actor.remember("cartProductName2", cartProductName2);
        actor.remember("cartProductDescription1", cartProductDescription1);
        actor.remember("cartProductDescription2", cartProductDescription2);

        actor.remember("cartProductPrice2", cartProductPrice2);

        actor.attemptsTo(
                WaitUntil.the(CartPage.CHECKOUT_BUTTON, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(CartPage.CHECKOUT_BUTTON)
        );
    }

    public static Performable itemsAdded() {
        return instrumented(Cart.class);
    }
}
