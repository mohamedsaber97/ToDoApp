package base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {
    DesiredCapabilities desiredCapabilities;
    static AndroidDriver<MobileElement> androidDriver;
    FileInputStream fileInputStream;
    Properties prop;

    public TestBase() {
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
    }

    @Parameters({"deviceName", "platformName", "platformVersion"})
    @BeforeClass
    public void beforeClass(String deviceName, String platformName, String platformVersion) throws IOException {
        File configFile = new File("src/main/resources/config/config.properties");
        fileInputStream = new FileInputStream(configFile);
        prop = new Properties();
        prop.load(fileInputStream);

        if (platformName.equalsIgnoreCase("android")) {
            File app = new File(prop.getProperty("androidAppPath"));
            desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
            desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
            desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, platformVersion);
            desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, prop.getProperty("automationName"));
            desiredCapabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
            androidDriver = new AndroidDriver<>(new URL(prop.getProperty("appiumServerUrl")), desiredCapabilities);
        } else if (platformName.equalsIgnoreCase("ios")) {
            File app = new File(prop.getProperty("androidAppPath"));
            desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
            desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
            desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, platformVersion);
            desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, prop.getProperty("automationName"));
            desiredCapabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
            androidDriver = new AndroidDriver<>(new URL(prop.getProperty("appiumServerUrl")), desiredCapabilities);
        }
        androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("-----beforeClass is finished-----");
    }

    @AfterClass
    public void afterClass() {
        // androidDriver.quit();
        System.out.println("-----afterClass is finished-----");
    }
}
