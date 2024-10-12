import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class mobile {
    public static AndroidDriver driver;
    public static DesiredCapabilities capabilities;
    public static String baseUrl = "http://127.0.0.1:4723/";

    @Test
    public void main() throws MalformedURLException {
        capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "A34 Milik Ester");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "13.0");
        capabilities.setCapability("app", System.getProperty("user.dir") + "/src/test/java/mobile/apk/kasirAja.apk");
        capabilities.setCapability("autoGrantPermissions", true);
        capabilities.setCapability("autoAcceptAlerts", true);

        URL url = new URL(baseUrl);
        driver = new AndroidDriver(url, capabilities);
    }
}
