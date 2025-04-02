package org.example.pdd_android_tests.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.example.pdd_android_tests.AllureLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.LoggerFactory;

import java.util.List;

import static org.example.pdd_android_tests.MyWait.myWait;


public class MainScreen {

    private final AllureLogger LOG = new AllureLogger(LoggerFactory.getLogger(MainScreen.class));


    @AndroidFindBy(id = "ru.drom.pdd.android.app:id/toggleButton")
    protected List<WebElement> categoryRadioButton;

    @AndroidFindBy(id = "ru.drom.pdd.android.app:id/skip_button")
    protected WebElement skipButton;

    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
    protected WebElement allowButton;

    @AndroidFindBy(id = "ru.drom.pdd.android.app:id/dashboard_settings")
    protected WebElement settingsButton;

    @AndroidFindBy(id = "ru.drom.pdd.android.app:id/ab_category")
    protected WebElement abButton;

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Перейти вверх']")
    protected WebElement backButton;

    @AndroidFindBy(id = "ru.drom.pdd.android.app:id/learn_papers")
    protected WebElement categoryButton;

    @AndroidFindBy(id = "ru.drom.pdd.android.app:id/info_button")
    protected WebElement infoButton;

    @AndroidFindBy(id = "ru.drom.pdd.android.app:id/info_text")
    protected WebElement infoText;

    @AndroidFindBy(id = "ru.drom.pdd.android.app:id/exam_button")
    protected WebElement examButton;


    public void intoMainScreen() {
        myWait(5).clickable(categoryRadioButton.get(1));
        categoryRadioButton.get(1).click();
        LOG.info("Выбрали радио кнопку: 'Категория B'");
        myWait(5).clickable(skipButton);
        skipButton.click();
        LOG.info("Нажали на кнопку: 'К обучению'");
        myWait(5).clickable(allowButton);
        allowButton.click();
        LOG.info("Нажали 'Разрешить'");
    }


    public String getTextCategoryButton() {
        myWait(5).clickable(settingsButton);
        settingsButton.click();
        LOG.info("Нажали на значок 'шестеренки'");
        myWait(5).clickable(abButton);
        abButton.click();
        LOG.info("Выбрали радио кнопку 'AB'");
        myWait(10).clickable(backButton);
        backButton.click();
        LOG.info("Нажали на кнопку 'Назад'");
        myWait(5).visible(categoryButton);
        return categoryButton.getText();
    }

    public String getInfoTextBC() {
        myWait(5).clickable(examButton);
        examButton.click();
        LOG.info("Нажали на кнопку 'Экзамен'");
        myWait(5).clickable(infoButton);
        infoButton.click();
        LOG.info("Нажали на кнопку 'МНЕ НУЖНА КАТЕГОРИЯ BC'");
        return infoText.getText();
    }

    public MainScreen(WebDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}
