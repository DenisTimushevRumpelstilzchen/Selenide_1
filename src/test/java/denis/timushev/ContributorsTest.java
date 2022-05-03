package denis.timushev;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class ContributorsTest {

    @Test
    void solntsevShouldBeFirstContributor(){

        Configuration.browserSize="1200x400";
        open("https://github.com/selenide/selenide");
        $(".Layout-sidebar").$(byText("Contributors")).ancestor("div")
                .$("ul li").hover();
        $$(".Popover-message").findBy(visible).shouldHave(text("Andrei Solntsev"));

    }
}
