package org.example.pdd_android_tests.tests;

import org.example.pdd_android_tests.MyExtension;
import org.example.pdd_android_tests.screens.MainScreen;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.net.MalformedURLException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


@ExtendWith(MyExtension.class)
public class MainScreenTest extends BaseTest {
    private MainScreen mainScreen;

    @BeforeEach
    @Override
    public void setUp() throws MalformedURLException {
        super.setUp();
        mainScreen = new MainScreen(getDriver());
        mainScreen.intoMainScreen();
    }

    @Test
    @DisplayName("Проверка, что после выбора в настройках категорий AB " +
            "- текст кнопки 'Билеты' на главном экране меняется на 'Билеты AB'")
    public void abCategoryCheck() {
        assertEquals("Билеты AB", mainScreen.getTextABCategoryButton(),
                "Текст кнопки неверный!");
    }

    @Test
    @DisplayName("Проверка, что после выбора в настройках категорий CD " +
            "- текст кнопки 'Билеты' на главном экране меняется на 'Билеты CD'")
    public void cdCategoryCheck() {
        assertEquals("Билеты CD", mainScreen.getTextCDCategoryButton(),
                "Текст кнопки неверный!");
    }

    @Test
    @DisplayName("Проверка, что при выборе билетов экзамена по категориям BC " +
            "- выводится сообщение, что их не существует")
    public void infoTextBCCheck() {
        assertTrue(mainScreen.getInfoTextBC().contains("Билетов BC не существует"),
                "Сообщение не появилось!");
    }

    @Test
    @DisplayName("Проверка, что при включенном в настройках подтверждении ответа на вопрос " +
            "- после ответа появляется кнопка 'ПОДТВЕРДИТЬ ОТВЕТ'")
    public void confirmAnswerButtonCheck() {
        assertTrue(mainScreen.isconfirmAnswerButton(), "Подтверждения ответа не было!");
    }

    @Test
    @DisplayName("Проверка, что при выключенном в настройках подтверждении ответа " +
            "- после ответа на вопрос открывается экран следующего вопроса")
    public void nextQuestionCheck() {
        assertTrue(mainScreen.isNextQuestion(), "Требуется подтверждение ответа!");
    }

}