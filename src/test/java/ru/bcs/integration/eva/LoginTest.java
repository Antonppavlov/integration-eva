package ru.bcs.integration.eva;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.Test;
import ru.bcs.integration.eva.page.LoginPage;

public class LoginTest {

    @Test
    public void validateLogin(){
        Configuration.browser="chrome";
        System.setProperty("webdriver.chrome.driver", "/Users/administrator/Downloads/chromedriver");
        //открываю страницу авторизации ЕВЫ
        Selenide.open("https://broker.ru/demo");
        //авторизуюсь
        LoginPage loginPage = new LoginPage();
        loginPage.getInputLogin().sendKeys("asdf");
        loginPage.getInputPassword().setValue("bjhgjhj");
        loginPage.getButtonEnter().shouldHave(Condition.enabled);
        loginPage.getButtonEnter().click();
        //проверка входа в Еву
    }
}
