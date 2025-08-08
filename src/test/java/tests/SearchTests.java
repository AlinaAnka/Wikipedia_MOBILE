package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;
import static io.qameta.allure.Allure.step;

@Epic("Мобильное тестирование Wikipedia")
@Feature("Функционал поиска")
@Owner("Алина")
@Tag("android_browserstack")
public class SearchTests extends TestBase {

    @Test
    @Story("Поиск статей в Wikipedia")
    @DisplayName("Успешный поиск статьи по ключевому слову")
    @Severity(SeverityLevel.BLOCKER)
    void successfulSearchTest() {

        step("Открываем поле поиска", () -> {
            $(accessibilityId("Search Wikipedia")).click();
            $(id("org.wikipedia.alpha:id/search_container")).click();
        });

        step("Вводим поисковый запрос 'Android'", () -> {
            $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Android");
        });

        step("Проверяем, что отображаются результаты поиска", () -> {
            $$(id("org.wikipedia.alpha:id/page_list_item_title"))
                    .shouldBe(sizeGreaterThan(0));
        });

        step("Проверяем, что первый результат содержит искомое слово", () -> {
            $$(id("org.wikipedia.alpha:id/page_list_item_title"))
                    .first()
                    .shouldHave(text("Android"))
                    .shouldBe(visible);
        });
    }

    @Test
    @Story("Поиск статей в Wikipedia")
    @DisplayName("Поиск статьи о Google")
    @Severity(SeverityLevel.CRITICAL)
    void searchGoogleTest() {

        step("Открываем поле поиска и вводим 'Google'", () -> {
            $(accessibilityId("Search Wikipedia")).click();
            $(id("org.wikipedia.alpha:id/search_src_text"))
                    .shouldBe(visible)
                    .sendKeys("Google");
        });

        step("Проверяем, что найдены результаты поиска", () -> {
            $$(id("org.wikipedia.alpha:id/page_list_item_title"))
                    .shouldBe(sizeGreaterThan(0));
        });

        step("Проверяем, что первый результат содержит 'Google'", () -> {
            $$(id("org.wikipedia.alpha:id/page_list_item_title"))
                    .first()
                    .shouldHave(text("Google"))
                    .shouldBe(visible);
        });
    }
}