package denis.timushev;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SelenideRepositoryTest {

    @Test
    void shouldFindSelenideAsFirstRepository(){
        open("https://github.com");  // открыть страницу github.com
        $("[data-test-selector=nav-search-input]")
                .setValue("selenide").pressEnter();  // ввести в поле поиска selenide и нажать Enter
        $$("ul.repo-list li").first().$("a").click();  // нажимаем на линк от первого результата поиска
        $("h2").shouldHave(text("selenide / selenide"));  // check: в заголовке встречается selenide/selenide
    }
}
