package org.example.pdd_android_tests.screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.example.pdd_android_tests.AllureLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.example.pdd_android_tests.MyWait.myWait;


public class MainScreen {

    private final AndroidDriver driver;
    private final AllureLogger LOG = new AllureLogger(LoggerFactory.getLogger(MainScreen.class));

    @SuppressWarnings({"MismatchedQueryAndUpdateOfCollection", "unused"})
    @AndroidFindBy(id = "ru.drom.pdd.android.app:id/toggleButton")
    private List<WebElement> categoryRadioButton;

    @SuppressWarnings("unused")
    @AndroidFindBy(id = "ru.drom.pdd.android.app:id/skip_button")
    private WebElement skipButton;

    @SuppressWarnings("unused")
    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
    private WebElement allowButton;

    @SuppressWarnings("unused")
    @AndroidFindBy(id = "ru.drom.pdd.android.app:id/dashboard_settings")
    private WebElement settingsButton;

    @SuppressWarnings("unused")
    @AndroidFindBy(id = "ru.drom.pdd.android.app:id/ab_category")
    private WebElement abCategoryButton;

    @SuppressWarnings("unused")
    @AndroidFindBy(id = "ru.drom.pdd.android.app:id/cd_category")
    private WebElement cdCategoryButton;

    @SuppressWarnings("unused")
    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Перейти вверх']")
    private WebElement backButton;

    @SuppressWarnings("unused")
    @AndroidFindBy(id = "ru.drom.pdd.android.app:id/learn_papers")
    private WebElement categoryButton;

    @SuppressWarnings("unused")
    @AndroidFindBy(id = "ru.drom.pdd.android.app:id/info_button")
    private WebElement infoButton;

    @SuppressWarnings("unused")
    @AndroidFindBy(id = "ru.drom.pdd.android.app:id/info_text")
    private WebElement infoText;

    @SuppressWarnings("unused")
    @AndroidFindBy(id = "ru.drom.pdd.android.app:id/exam_button")
    private WebElement examButton;

    @SuppressWarnings("unused")
    @AndroidFindBy(id = "ru.drom.pdd.android.app:id/confirm_answers_switch")
    private WebElement confirmToggleButton;

    @SuppressWarnings("unused")
    @AndroidFindBy(id = "ru.drom.pdd.android.app:id/start_exam_button")
    private WebElement startExamButton;

    @SuppressWarnings("unused")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"ru.drom.pdd.android.app:id/answer_number_text\""+
            "and @text=\"1.\"]")
    private WebElement answer1Button;

    @SuppressWarnings("unused")
    @AndroidFindBy(uiAutomator = "new UiSelector()"
            + ".resourceId(\"ru.drom.pdd.android.app:id/go_to_next_button\")"
            + ".text(\"ПОДТВЕРДИТЬ ОТВЕТ\")")
    private WebElement confirmAnswerButton;

    @SuppressWarnings("unused")
    @AndroidFindBy(uiAutomator = "new UiSelector()" +
            ".resourceId(\"ru.drom.pdd.android.app:id/question_button\")"
            + ".focusable(true)" + ".fromParent(new UiSelector()"
            + ".resourceId(\"ru.drom.pdd.android.app:id/question_number\")" + ".text(\"2\"))")
    private WebElement nextQuestionButton;

    @SuppressWarnings("unused")
    @AndroidFindBy(id = "ru.drom.pdd.android.app:id/ab_button")
    private WebElement abButton;

    @SuppressWarnings("unused")
    @AndroidFindBy(uiAutomator = "new UiSelector()" +
            ".className(\"android.widget.TextView\")")
    private WebElement popText;

    @SuppressWarnings("unused")
    @AndroidFindBy(uiAutomator =
            "new UiSelector()" +
                    ".className(\"android.widget.LinearLayout\")" +
                    ".childSelector(new UiSelector().text(\"1\"))")
    private WebElement firstTicketButton;


    @SuppressWarnings({"MismatchedQueryAndUpdateOfCollection", "unused"})
    @AndroidFindBy(xpath = "//*[contains(@text, '.')]") // Фиктивный селектор
    private List<WebElement> answerTitles;


    @SuppressWarnings("unused")
    @AndroidFindBy(id = "ru.drom.pdd.android.app:id/shuffle_answers_switch")
    private WebElement shuffleToggleButton;


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


    public String getTextCategoryButton(WebElement catButton) {
        myWait(5).clickable(settingsButton);
        settingsButton.click();
        LOG.info("Нажали на значок 'шестеренки'");
        myWait(5).clickable(catButton);
        catButton.click();
        LOG.info("Выбрали радио кнопку " + catButton.getText());
        myWait(10).clickable(backButton);
        backButton.click();
        LOG.info("Нажали на кнопку 'Назад'");
        myWait(5).visible(categoryButton);
        return categoryButton.getText();
    }

    public String getTextABCategoryButton() {
        return getTextCategoryButton(abCategoryButton);
    }

    public String getTextCDCategoryButton() {
        return getTextCategoryButton(cdCategoryButton);
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

    public boolean isconfirmAnswerButton() {
        myWait(5).clickable(settingsButton);
        settingsButton.click();
        LOG.info("Нажали на значок 'шестеренки'");
        myWait(5).clickable(abCategoryButton);
        abCategoryButton.click();
        LOG.info("Выбрали радио кнопку 'AB'");
        myWait(5).clickable(confirmToggleButton);
        confirmToggleButton.click();
        LOG.info("Выбрали тогл кнопку 'Дополнительно подтверждать выбранный ответ'");
        myWait(10).clickable(backButton);
        backButton.click();
        LOG.info("Нажали на кнопку 'Назад'");
        myWait(5).clickable(examButton);
        examButton.click();
        LOG.info("Нажали на кнопку 'Экзамен'");
        myWait(5).clickable(startExamButton);
        startExamButton.click();
        LOG.info("Нажали на кнопку 'Начать экзамен'");
        myWait(5).clickable(answer1Button);
        answer1Button.click();
        LOG.info("Выбрали первый вариант ответа");
        try {
            myWait(5).clickable(confirmAnswerButton);
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

    public boolean isNextQuestion() {
        myWait(5).clickable(examButton);
        examButton.click();
        LOG.info("Нажали на кнопку 'Экзамен'");
        myWait(5).clickable(abButton);
        abButton.click();
        LOG.info("Нажали на кнопку 'AB'");
        myWait(5).clickable(startExamButton);
        startExamButton.click();
        LOG.info("Нажали на кнопку 'Начать экзамен'");
        myWait(5).clickable(answer1Button);
        answer1Button.click();
        LOG.info("Выбрали первый вариант ответа");
        try {
            myWait(5).visible(nextQuestionButton);
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }


    // Динамический поиск ответа по номеру вопроса
    public String getAnswer(String questionNumber) {
        WebElement answer = driver.findElement(By.xpath(
                String.format("//*[@text='%s.']/following-sibling::*[@resource-id='ru.drom.pdd.android.app:id/answer_text']",
                        questionNumber)
        ));
        return answer.getText();
    }


    public Map<String, String> getAnswerMap() {
        Map<String, String> map = new HashMap<>();
        for (WebElement question : answerTitles) {
            String qText = question.getText();
            map.put(qText, getAnswer(qText.replace(".", "")));
        }
        return map;
    }


    public boolean isMischungAnswers() {
        myWait(5).clickable(categoryButton);
        categoryButton.click();
        LOG.info("Нажали на кнопку 'Билеты'");
        myWait(5).clickable(abButton);
        abButton.click();
        LOG.info("Нажали на кнопку 'AB'");
        myWait(5).clickable(popText);
        popText.click();
        LOG.info("Ткнули на всплывшее сверху окно с сообщением");
        myWait(5).clickable(firstTicketButton);
        firstTicketButton.click();
        LOG.info("Выбрали первый билет");
        Map<String, String> answersBeforSchuffle = getAnswerMap();
        LOG.infoWithScreenshot("Сохранили порядок значений ответов");
        myWait(5).clickable(backButton);
        backButton.click();
        LOG.info("Нажали на кнопку 'Назад'");
        myWait(5).clickable(backButton);
        backButton.click();
        LOG.info("Нажали на кнопку 'Назад'");
        myWait(5).clickable(settingsButton);
        settingsButton.click();
        LOG.info("Нажали на значок 'шестеренки'");
        myWait(5).clickable(shuffleToggleButton);
        shuffleToggleButton.click();
        LOG.info("Нажали тогл кнопку 'Перемешивать варианты ответов'");
        myWait(5).clickable(backButton);
        backButton.click();
        LOG.info("Нажали на кнопку 'Назад'");
        myWait(5).clickable(categoryButton);
        categoryButton.click();
        LOG.info("Нажали на кнопку 'Билеты'");
        myWait(5).clickable(firstTicketButton);
        firstTicketButton.click();
        LOG.info("Выбрали первый билет");
        Map<String, String> answersAfterShuffle = getAnswerMap();
        LOG.infoWithScreenshot("Сохранили порядок значений ответов");
        return !answersBeforSchuffle.equals(answersAfterShuffle);
    }

    public MainScreen(AndroidDriver driver) {

        this.driver = driver;

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}
