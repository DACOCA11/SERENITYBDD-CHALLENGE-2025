package automation.serenity.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CartPage {
    public static final Target PRODUCT_1_NAME = Target.the("Name of the product 1 ")
            .located(By.xpath("//a[@id='item_4_title_link']/div[1]"));
    public static final Target PRODUCT_2_NAME = Target.the("Name of the product 2")
            .located(By.xpath("//a[@id='item_0_title_link']/div[1]"));
    public static final Target PRODUCT_1_DESCRIPTION = Target.the("Description of the product 1")
            .located(By.xpath("//div[@id='cart_contents_container']/div[1]/div[1]/div[3]/div[2]/div[1]"));
    public static final Target PRODUCT_2_DESCRIPTION = Target.the("Description of the product 2")
            .located(By.xpath("//div[@id='cart_contents_container']/div[1]/div[1]/div[4]/div[2]/div[1]"));
    public static final Target PRODUCT_1_PRICE = Target.the("Price of the product 1")
            .located(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div"));
    public static final Target PRODUCT_2_PRICE = Target.the("Price of the product 2")
            .located(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[4]/div[2]/div[2]/div"));
    public static final Target CHECKOUT_BUTTON = Target.the("CheckOut Button")
            .located(By.id("checkout"));
}
