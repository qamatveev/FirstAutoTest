package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class SubmissionSuccessPage {

    private static final String SUCCESS_MESSAGE = "Ваша заявка успешно отправлена!";
    private static final By SUCCESS_TITLE = byXpath("//tr-finish-evaluation//h4");

    public SubmissionSuccessPage shouldShowSuccessfulSubmission() {
        $(SUCCESS_TITLE).shouldBe(visible).shouldHave(exactText(SUCCESS_MESSAGE));
        return this;
    }
}
