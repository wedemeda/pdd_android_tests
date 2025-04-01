package org.example.pdd_android_tests;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.example.pdd_android_tests.tests.BaseTest;

public class AllureAttachmentsManager {

    @Attachment(value = "Screenshot", type = "image/png")
    public static byte[] screenshot() {
        return BaseTest.getDriver().getScreenshotAs(OutputType.BYTES);
    }

}