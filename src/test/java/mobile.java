import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class mobile {
    public static AndroidDriver driver;
    public static DesiredCapabilities capabilities;
    public static String baseUrl = "http://192.168.18.158:4723/";

    @Test
    public void main() throws MalformedURLException {
        capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "A34 Milik Ester");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "13.0");
        capabilities.setCapability("app",  "C:\\Users\\Ester\\Documents\\Latihan\\AUTOMATION TESTING\\ester-appium\\src\\test\\java\\apk\\Diet_meal.apk");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("autoGrantPermissions", true);
        capabilities.setCapability("autoAcceptAlerts", true);

        URL url = new URL(baseUrl);
        driver = new AndroidDriver(url, capabilities);

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);


        driver.findElement(By.id("com.fghilmany.dietmealapp:id/et_name")).sendKeys("Ester");
        driver.findElement(By.id("com.fghilmany.dietmealapp:id/et_weight")).sendKeys("60");
        driver.findElement(By.id("com.fghilmany.dietmealapp:id/et_height")).sendKeys("158");
        driver.findElement(By.id("com.fghilmany.dietmealapp:id/rb_female")).click();
        driver.findElement(By.id("com.fghilmany.dietmealapp:id/bt_next")).click();
        driver.findElement(By.id("com.fghilmany.dietmealapp:id/rb_medium")).click();
        driver.findElement(By.id("com.fghilmany.dietmealapp:id/bt_finish")).click();

        driver.findElement(By.id("com.fghilmany.dietmealapp:id/tv_header_name")).isDisplayed();

    }
}
