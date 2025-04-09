package automation.serenity.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginP {

    public static final Target USER_NAME_FIELD = Target.the("UserName Field")
            .located(By.id("user-name"));
    public static final Target PASSWORD_FIELD = Target.the("Password Field")
            .located(By.id("password"));
    public static final Target LOGIN_BUTTON = Target.the("Login Button")
            .located(By.id("login-button"));
}
