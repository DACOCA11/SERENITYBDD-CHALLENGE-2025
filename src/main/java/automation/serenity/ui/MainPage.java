package automation.serenity.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MainPage {

    public static final Target PRODUCT_1 = Target.the("Producto 1")
            .located(By.xpath("//*[@id=\"item_4_title_link\"]/div[1]"));

    public static final Target PRODUCT_2 = Target.the("Producto 2")
            .located(By.xpath("//*[@id=\"item_0_title_link\"]/div[1]"));
    public static final Target CART_BUTTON = Target.the("Carrito")
            .located(By.xpath("//*[@id=\"shopping_cart_container\"]/a[1]"));
}
