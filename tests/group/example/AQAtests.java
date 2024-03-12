package tests.group.example;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AQAtests {
    @Test
    public void SearchKeywordWithYandex() {

        // Запускаем браузер и открываем Яндекс
        open("https:ya.ru");

        // Вводим запрос в поисковую строку
        $(By.id("text")).setValue("СберМегаМаркет").pressEnter();

        // Закрываем окно с предложеним сделать Яндекс браузером по умолчанию
        $(".DistributionSplashScreenModal-CloseButtonOuter").click();

        // Кликаем по ссылке
        $("a[href^='https://megamarket.ru/']").click();
    }
}