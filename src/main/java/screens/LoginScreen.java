package screens;

import base.TestBase;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginScreen extends TestBase {

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Signup\"]")
    private AndroidElement registerBtn;

    public RegisterScreen openSignUp() {
        registerBtn.click();
        return new RegisterScreen();
    }
}
