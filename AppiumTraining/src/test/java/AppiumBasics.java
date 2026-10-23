import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class AppiumBasics extends BaseTest{

    @Test
    public void WifiSettingsName() throws MalformedURLException {
        //code
        //AndroidDriver, IOSDriver
        //Appium code -> Appium Server -> Mobile
        //Xpath, id, accessibilityId, classname, androidUIAutomator

        driver.findElement(AppiumBy.accessibilityId("Preference")).click();

        //tagName[@attribute='value'] -> //tagName
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
        driver.findElement(By.id("android:id/checkbox")).click();
        driver.findElement(By.xpath("//android.widget.ListView[@resource-id='android:id/list']/android.widget.LinearLayout[2]/android.widget.RelativeLayout")).click();
        String alertTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
        Assert.assertEquals(alertTitle, "WiFi settings");
        driver.findElement(By.id("android:id/edit")).sendKeys("Test Wifi");
        driver.findElements(By.className("android.widget.Button")).get(1).click();


        //set wifi name



    }
}
