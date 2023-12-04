package screens;

import base.TestBase;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class LoginScreen extends TestBase {
    private final By registerBtn = MobileBy.xpath("//android.widget.TextView[@text='Signup']");

    public void openSignUp() {
        MobileElement registerBtnElement = androidDriver.findElement(registerBtn);
        registerBtnElement.click();
    }
}
