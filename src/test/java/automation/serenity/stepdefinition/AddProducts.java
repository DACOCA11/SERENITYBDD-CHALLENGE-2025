package automation.serenity.stepdefinition;

import automation.serenity.tasks.AddProductsCart;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;

public class AddProducts {
@Then("agrego dos productos al carrito")
public void addProducts() {
    OnStage.theActorInTheSpotlight().attemptsTo(AddProductsCart.addProducts());
}
}
