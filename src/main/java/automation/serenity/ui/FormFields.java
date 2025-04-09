package automation.serenity.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormFields {
    public static final Target FIRST_NAME_FIELD = Target.the("First Name")
            .located(By.id("first-name"));
    public static final Target LAST_NAME_FIELD = Target.the("Last Name ")
            .located(By.id("last-name"));
    public static final Target POSTAL_CODE_FIELD = Target.the("Postal Code")
            .located(By.id("postal-code"));
    public static final Target CONTINUE_BUTTON = Target.the("Continue Button")
            .located(By.id("continue"));

}
