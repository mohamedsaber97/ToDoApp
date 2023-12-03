package screens;

import base.TestBase;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class RegisterScreen extends TestBase {

    @AndroidFindBy(xpath = "//android.widget.EditText[@text ='Enter your Full name']")
    private AndroidElement nameTxt;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text ='Enter your Email']")
    private AndroidElement emailTxt;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text ='Enter your Password']")
    private AndroidElement passTxt;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text ='Signup']")
    private AndroidElement signUpBtn;

    public void registerAccount(String name, String email, String pass) {
        nameTxt.sendKeys(name);
        emailTxt.sendKeys(email);
        passTxt.sendKeys(pass);
        signUpBtn.click();
    }
}
