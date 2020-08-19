package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
class YandexTest {
    @Test
    void selenideYandexSearchTest() {
        open("https://yandex.ru/");

        $(byName("text")).setValue("selenide").pressEnter();

        $("#search-result").shouldHave(text("selenide"));
    }
}
