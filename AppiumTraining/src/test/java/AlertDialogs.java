import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class AlertDialogs extends BaseTest {
    @Test
    public void AlertDialogsTest() throws MalformedURLException, InterruptedException{
        driver.findElement(AppiumBy.accessibilityId("App")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Alert Dialogs']")).click();
        driver.findElement(By.xpath("//android.widget.Button[@content-desc='OK Cancel dialog with a message']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//android.widget.TextView[@resource-id='android:id/alertTitle']")).isDisplayed());
        driver.findElement(By.xpath("//android.widget.Button[@resource-id='android:id/button1']")).click();
        Thread.sleep(3000);

    }

}
