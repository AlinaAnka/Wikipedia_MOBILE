package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;
import static io.qameta.allure.Allure.step;
import static io.qameta.allure.SeverityLevel.CRITICAL;

@Epic("Мобильное тестирование Wikipedia")
@Feature("Работа с избранным")
@Owner("Алина")
@Tag("android_emulation")
public class SavedTests extends TestBase {

    @Test
    @Story("Добавление в избранное")
    @DisplayName("Добавление статьи в избранное")
    @Severity(CRITICAL)
    void addArticleToSavedTest() {
        step("Выполняем поиск статьи 'Java'", () -> {
            back();
            $(accessibilityId("Search Wikipedia")).click();
            $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Java");
        });

        step("Открываем первую статью", () -> {
            $$(id("org.wikipedia.alpha:id/page_list_item_title")).first().click();
        });

        step("Сохраняем статью", () -> {
            $(id("org.wikipedia.alpha:id/closeButton")).click();
            $(id("org.wikipedia.alpha:id/page_save")).click();
        });

        step("Возвращаемся на главный экран", () -> {
            back();
            $(accessibilityId("Navigate up")).click();
        });

        step("Переходим в раздел 'Saved'", () -> {
            $(id("org.wikipedia.alpha:id/nav_tab_reading_lists")).click();
        });

        step("Проверяем сохраненную статью", () -> {
            $(id("org.wikipedia.alpha:id/recycler_view")).click();
            $(id("org.wikipedia.alpha:id/buttonView")).click();
            $$(id("org.wikipedia.alpha:id/page_list_item_title")).first().shouldHave(text("Java"));
        });
    }
}
