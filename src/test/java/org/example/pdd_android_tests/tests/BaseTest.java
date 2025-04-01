package org.example.pdd_android_tests.tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.options.BaseOptions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Paths;
import java.time.Duration;

public class BaseTest {
    protected static AndroidDriver driver;
    protected WebDriverWait wait;

    private String getApkPath() {
        // Получаем корень проекта (где лежит pom.xml)
        String projectRoot = System.getProperty("user.dir");

        // Строим полный путь к APK
        return Paths.get(projectRoot, "apk", "pdd2025_3.32.apk")
                .toAbsolutePath()
                .toString();
    }

    @BeforeEach
    public void setUp() throws MalformedURLException {
        String apkPath = getApkPath();
        var options = new BaseOptions<>()
                .amend("appium:app", apkPath)
                .amend("platformName", "Android")
                .amend("appium:deviceName", "Samsung S20 FE")
                .amend("appium:automationName", "UiAutomator2")
                .amend("appium:appPackage", "ru.drom.pdd.android.app")
                .amend("appium:appActivity", "ru.drom.pdd.android.app.splash.SplashActivity")
                .amend("appium:ensureWebviewsHavePages", true)
                .amend("appium:nativeWebScreenshot", true)
                .amend("appium:newCommandTimeout", 3600)
                .amend("appium:connectHardwareKeyboard", true);

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public static AndroidDriver getDriver() {
        return driver;
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}