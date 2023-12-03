package testcases;

import base.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import screens.LoginScreen;
import screens.RegisterScreen;

public class LoginTest extends TestBase {

    LoginScreen loginScreen;
    RegisterScreen registerScreen;

    @BeforeMethod
    public void beforeMethod(){
        loginScreen = new LoginScreen();
    }

    @Test
    public void openSignUpTC() {
        registerScreen = loginScreen.openSignUp();
        System.out.println("-----register screen is opened-----");
    }
}
