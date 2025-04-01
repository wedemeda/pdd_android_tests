package org.example.pdd_android_tests.tests;

import org.example.pdd_android_tests.MyExtension;
import org.example.pdd_android_tests.screens.MainScreen;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.net.MalformedURLException;

import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(MyExtension.class)
public class MainScreenTest extends BaseTest {
    private MainScreen mainScreen;

    @BeforeEach
    @Override
    public void setUp() throws MalformedURLException {
        super.setUp();
        mainScreen = new MainScreen(getDriver());
    }

    @Test
    @DisplayName("Проверка, что после выбора в настройках категорий AB " +
            "- текст кнопки 'Билеты' на главном экране меняется на 'Билеты AB'")
    public void abCategoryCheck() {
        assertEquals("Билеты AB", mainScreen.getTextCategoryButton(), "Текст кнопки неверный");
    }

}