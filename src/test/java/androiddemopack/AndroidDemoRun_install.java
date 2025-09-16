package androiddemopack;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidDemoRun_install {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        // Android - install the app and run
        UiAutomator2Options options = new UiAutomator2Options();
        options.setApp(System.getProperty("user.dir") + "/src/test/resources/AND/android-app.apk"); // provide the path of the appa nd then run
        options.setUdid("emulator-5556"); // get the onwhich deviceit needs to run
        options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2); // to authorise the adb to control the device

        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), options);// we are trying to run the appium on a ip and port number
        Thread.sleep(5000);

        System.out.println("script is here");
        System.out.println(options.getAppActivity());
        System.out.println(options.getAppPackage());

        Thread.sleep(5000);
        driver.quit();

    }
}
