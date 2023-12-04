package testcases;

import base.TestBase;
import org.testng.annotations.Test;
import screens.RegisterScreen;

public class RegisterTest extends TestBase {

    RegisterScreen registerScreen = new RegisterScreen();

    @Test(groups = "auth")
    public void registerAccountTC() {
        registerScreen.registerAccount("saber", "msaber9765@gmail.com", "Saber116232");
        System.out.println("-----account registered successfully-----");
    }

}
