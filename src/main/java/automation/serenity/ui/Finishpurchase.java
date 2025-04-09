package automation.serenity.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Finishpurchase {
    public static final Target FINISH_BUTTON = Target.the("Finish Button")
            .located(By.id("finish"));
}
