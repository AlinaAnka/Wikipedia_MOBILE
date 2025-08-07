package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;
import static io.qameta.allure.Allure.step;
import static io.qameta.allure.SeverityLevel.NORMAL;

@Epic("Мобильное тестирование Wikipedia")
@Feature("История просмотров")
@Owner("Алина")
@Tag("android_emulation")
public class HistoryTests extends TestBase {

    @Test
    @Story("Просмотр истории")
    @DisplayName("Проверка сохранения истории просмотров")
    @Severity(NORMAL)
    void viewHistoryTest() {
        step("Открываем и закрываем первую статью 'Selenium'", () -> {
            back();
            $(accessibilityId("Search Wikipedia")).click();
            $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Selenium");
            $$(id("org.wikipedia.alpha:id/page_list_item_title")).first().click();
            $(id("org.wikipedia.alpha:id/closeButton")).click();
        });

        step("Открываем и закрываем вторую статью 'Appium'", () -> {
            back();
            $(id("org.wikipedia.alpha:id/search_src_text")).click();
            $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Appium");
            $$(id("org.wikipedia.alpha:id/page_list_item_title")).first().click();
        });

        step("Возвращаемся на главный экран", () -> {
            back();
            $(accessibilityId("Navigate up")).click();
        });

        step("Проверяем историю просмотров", () -> {
            $(id("org.wikipedia.alpha:id/nav_tab_search")).click();
            $$(id("org.wikipedia.alpha:id/page_list_item_title"))
                    .findBy(text("Appium"))
                    .shouldBe(visible);
        });
    }
}
