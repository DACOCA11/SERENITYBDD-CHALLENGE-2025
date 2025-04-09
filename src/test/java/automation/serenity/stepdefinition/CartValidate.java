package automation.serenity.stepdefinition;

import automation.serenity.tasks.Cart;
import io.cucumber.java.en.And;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import static automation.serenity.utils.Constants.TIME_SHORT;
import static automation.serenity.utils.Time.waiting;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CartValidate {
@And("verifico que el carrito tenga los dos productos")
public void CartValidation() {

    OnStage.theActorInTheSpotlight().attemptsTo(Cart.itemsAdded());

    waiting(TIME_SHORT);
    // Get data from the inventory
    String productName1 = theActorInTheSpotlight().recall("productName1");
    String productDescription1 = theActorInTheSpotlight().recall("productDescription1");

    String productName2 = theActorInTheSpotlight().recall("productName2");
    String productDescription2 = theActorInTheSpotlight().recall("productDescription2");
    String productPrice2 = theActorInTheSpotlight().recall("productPrice2");

    // Get data from the cart
    String cartProductName1 = theActorInTheSpotlight().recall("cartProductName1");
    String cartProductDescription1 = theActorInTheSpotlight().recall("cartProduct1Description");

    String cartProductName2 = theActorInTheSpotlight().recall("cartProduct2Name");
    String cartProductDescription2 = theActorInTheSpotlight().recall("cartProduct2Description");
    String cartProductPrice2 = theActorInTheSpotlight().recall("cartProduct2Price");

    // Assertions
    theActorInTheSpotlight().should(
            GivenWhenThen.seeThat("Product Name 1", actor -> cartProductName1, Matchers.equalTo(productName1)),
            GivenWhenThen.seeThat("Product Description 1", actor -> cartProductDescription1, Matchers.equalTo(productDescription1)),

            GivenWhenThen.seeThat("Product Name 2", actor -> cartProductName2, Matchers.equalTo(productName2)),
            GivenWhenThen.seeThat("Product Description 2", actor -> cartProductDescription2, Matchers.equalTo(productDescription2)),
            GivenWhenThen.seeThat("Product Price 2", actor -> cartProductPrice2, Matchers.equalTo(productPrice2))
    );

}



}
