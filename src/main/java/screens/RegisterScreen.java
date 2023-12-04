package screens;

import base.TestBase;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class RegisterScreen extends TestBase {
    private final By nameTxt = MobileBy.xpath("//android.widget.EditText[@text ='Enter your Full name']");
    private final By emailTxt = MobileBy.xpath("//android.widget.EditText[@text ='Enter your Email']");
    private final By passTxt = MobileBy.xpath("//android.widget.EditText[@text ='Enter your Password']");
    private final By signUpBtn = MobileBy.xpath("//android.widget.TextView[@text ='Signup']");


    public void registerAccount(String name, String email, String pass) {
        MobileElement nameTxtElement = androidDriver.findElement(nameTxt);
        nameTxtElement.sendKeys(name);
        MobileElement emailTxtElement = androidDriver.findElement(emailTxt);
        emailTxtElement.sendKeys(email);
        MobileElement passTxtElement = androidDriver.findElement(passTxt);
        passTxtElement.sendKeys(pass);
        MobileElement signUpBtnElement = androidDriver.findElement(signUpBtn);
        signUpBtnElement.click();
    }
}
