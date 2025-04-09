package automation.serenity.tasks;

import automation.serenity.ui.MainPage;
import automation.serenity.ui.ProductPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddProductsCart implements Task {

@Override
    @Step ("agrego dos productos al carrito")

public <T extends Actor> void performAs(T actor) {

    // Selecciono Product 1
    actor.attemptsTo(
            WaitUntil.the(MainPage.PRODUCT_1, isVisible()).forNoMoreThan(20).seconds(),
            Click.on(MainPage.PRODUCT_1)
    );

    // Get Product 1 data
    WaitUntil.the(ProductPage.PRODUCT_NAME, isVisible()).forNoMoreThan(20).seconds();
    String productName1 = Text.of(ProductPage.PRODUCT_NAME).answeredBy(actor);
    String productDescription1 = Text.of(ProductPage.PRODUCT_DESCRIPTION).answeredBy(actor);
    String productPrice1 = Text.of(ProductPage.PRODUCT_PRICE).answeredBy(actor);

    // Store Product 1 data
    actor.remember("productName1", productName1);
    actor.remember("product1Description1", productDescription1);
    actor.remember("productPrice1", productPrice1);

    // Add Product 1 to the cart
    actor.attemptsTo(
            Click.on(ProductPage.ADD_TO_CART_BUTTON),
            WaitUntil.the(ProductPage.RETURN_BUTTON, isVisible()).forNoMoreThan(20).seconds(),
            Click.on(ProductPage.RETURN_BUTTON)
    );

    // Select Product 2
    actor.attemptsTo(
            WaitUntil.the(MainPage.PRODUCT_2, isVisible()).forNoMoreThan(20).seconds(),
            Click.on(MainPage.PRODUCT_2)
    );

    // Get Product 2 data
    WaitUntil.the(ProductPage.PRODUCT_NAME, isVisible()).forNoMoreThan(20).seconds();
    String product2Name = Text.of(ProductPage.PRODUCT_NAME).answeredBy(actor);
    String product2Description = Text.of(ProductPage.PRODUCT_DESCRIPTION).answeredBy(actor);
    String product2Price = Text.of(ProductPage.PRODUCT_PRICE).answeredBy(actor);

    // Store Product 2 data
    actor.remember("product2Name", product2Name);
    actor.remember("product2Description", product2Description);
    actor.remember("product2Price", product2Price);

    // Add Product 2 to the cart
    actor.attemptsTo(
            Click.on(ProductPage.ADD_TO_CART_BUTTON),
            WaitUntil.the(ProductPage.RETURN_BUTTON, isVisible()).forNoMoreThan(20).seconds(),
            Click.on(ProductPage.RETURN_BUTTON)
    );

    // Go to the cart page
    actor.attemptsTo(
            WaitUntil.the(MainPage.CART_BUTTON, isVisible()).forNoMoreThan(20).seconds(),
            Click.on(MainPage.CART_BUTTON)
    );
}
    public static Performable addProducts() {
        return instrumented(AddProductsCart.class);
    }

}
