package testcases;

import base.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import screens.LoginScreen;
import screens.RegisterScreen;

public class RegisterTest extends TestBase {

    RegisterScreen registerScreen;
    LoginScreen loginScreen;

    @BeforeMethod
    public void beforeMethod() {
        loginScreen = new LoginScreen();
        loginScreen.openSignUp();
        registerScreen = new RegisterScreen();
    }

    @Test
    public void registerAccountTC() {
        registerScreen.registerAccount("saber", "msaber9765@gmail.com", "Saber116232");
        System.out.println("-----account registered successfully-----");
    }

}
