package iosdemopack;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.remote.AutomationName;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class IosDemoRun_iosspecific {

    public static void main(String[] args) throws URISyntaxException, MalformedURLException, InterruptedException {
        XCUITestOptions options = new XCUITestOptions();
//        options.setApp(""); // to install the app from any location
        options.setBundleId("com.apple.reminders");
        options.setPlatformVersion("26");
        options.setUdid("0DC67C56-FB93-4423-9196-3E489DE6A84F");
        options.setAutomationName(AutomationName.IOS_XCUI_TEST);

        URI uri = new URI("http://127.0.0.1:4723/");

//        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), options);
        AndroidDriver driver = new AndroidDriver(uri.toURL(), options);// we are trying to run the appium on a ip and port number
        System.out.println("script is here");

        Thread.sleep(5000);

        driver.findElement(AppiumBy.iOSNsPredicateString("name == 'New Reminder'")).click();
        Thread.sleep(5000);

        driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeTextField[`name == \"Quick Entry Title Field\"`]")).sendKeys("test data");


        Thread.sleep(5000);
        driver.quit();
    }
}
