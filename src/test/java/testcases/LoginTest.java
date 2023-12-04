package testcases;

import base.TestBase;
import org.testng.annotations.Test;
import screens.LoginScreen;

public class LoginTest extends TestBase {

    LoginScreen loginScreen = new LoginScreen();

    @Test (groups = "auth")
    public void openSignUpTC() {
        loginScreen.openSignUp();
        System.out.println("-----register screen is opened-----");
    }
}
