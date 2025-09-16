package iosdemopack;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.remote.AutomationName;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

public class IosDemoRun {

    public static void main(String[] args) throws URISyntaxException, MalformedURLException, InterruptedException {
        XCUITestOptions options = new XCUITestOptions();
//        options.setApp(""); // to install the app from any location
        options.setBundleId("com.apple.reminders");
        options.setUdid("6BD2B23F-D0F8-4688-A9BA-95749D84F95E");
        options.setAutomationName(AutomationName.IOS_XCUI_TEST);

        URI uri = new URI("http://127.0.0.1:4723/");

        AndroidDriver driver = new AndroidDriver(uri.toURL(), options);// we are trying to run the appium on a ip and port number
        System.out.println("script is here");

        Thread.sleep(5000);
        driver.quit();
    }
}
