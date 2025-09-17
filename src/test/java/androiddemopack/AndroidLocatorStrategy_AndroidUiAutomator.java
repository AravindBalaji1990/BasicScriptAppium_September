package androiddemopack;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

public class AndroidLocatorStrategy_AndroidUiAutomator {


    public static void main(String[] args) throws URISyntaxException, MalformedURLException, InterruptedException {
        // Android - app inside a device you run
        UiAutomator2Options options = new UiAutomator2Options();
        options.setAppPackage("com.swaglabsmobileapp"); // to get the app package name from the deivce
        options.setAppActivity("com.swaglabsmobileapp.MainActivity"); // to get the activity name form the device
        options.setUdid("55ZTINFYRW5T6DNR"); // get the onwhich deviceit needs to run
        options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2); // to authorise the adb to control the device

        URI uri = new URI("http://127.0.0.1:4723/");

        AndroidDriver driver = new AndroidDriver(uri.toURL(), options);// we are trying to run the appium on a ip and port number
        System.out.println("script is here");
        Thread.sleep(5000);

        //Android UI Automator based lcoator
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Username\")")).sendKeys("standard_user");
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"test-Password\")")).sendKeys("secret_sauce");
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"test-LOGIN\")")).click();
        Thread.sleep(3000);

        driver.quit();
    }
}
