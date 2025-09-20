package androiddemopack;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

public class AndroidDemoRun_AndoridUIAutomator {
    public static void main(String[] args) throws MalformedURLException, InterruptedException, URISyntaxException {
        // Android - app inside a device you run
        UiAutomator2Options options = new UiAutomator2Options();
        options.setAppPackage("io.appium.android.apis"); // to get the app package name from the deivce
        options.setAppActivity("io.appium.android.apis.ApiDemos"); // to get the activity name form the device
        options.setUdid("emulator-5554"); // get the onwhich deviceit needs to run
        options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2); // to authorise the adb to control the device

        URI uri = new URI("http://127.0.0.1:4723/");

        AndroidDriver driver = new AndroidDriver(uri.toURL(), options);// we are trying to run the appium on a ip and port number
        System.out.println("script is here");
        Thread.sleep(5000);

//        By- web version
//        AppiumBy - mobile version
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"android:id/text1\").description(\"App\")")).click();
        Thread.sleep(3000);

        driver.quit();

    }
}
