package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class EvaluationStartPage {

    private static final By ONLINE_EVALUATE_BTN = byText("Оцените онлайн");
    private static final By LICENSE_PLATE_INPUT = byXpath("//tr-car-identifier-input//input");
    private static final By IDENTIFIER_NEXT_BUTTON = byXpath(
            "//tr-choice-type//button[.//span[contains(normalize-space(.), 'Продолжить')] or contains(normalize-space(.), 'Продолжить')]");
    private static final By MILEAGE_OPTION_BUTTON = byXpath("//tr-online-evaluation-choice-run//button");
    private static final By MILEAGE_NEXT_BUTTON = byXpath(
            "//tr-online-evaluation-steps-form//form/button[.//span[contains(normalize-space(.), 'Продолжить')] or contains(normalize-space(.), 'Продолжить')]");
    private static final By PRICE_SELECT_BUTTON = byXpath("//tr-online-evaluation-prices//form/button");
    private static final By PHONE_INPUT = byXpath("//tr-input-phone//input");
    private static final By NAME_INPUT = byXpath("//tr-result-form-fields//tr-control[2]//input");
    private static final By AGREEMENT_CHECKBOX = byXpath("//tr-agreement-block//tr-checkbox//label");
    private static final By SUBMIT_BUTTON = byXpath(
            "//tr-online-evaluation-result-form//button[.//span[contains(normalize-space(.), 'Отправить')] or contains(normalize-space(.), 'Отправить')]");

    public EvaluationStartPage clickEvaluateOnline() {
        $(ONLINE_EVALUATE_BTN).shouldBe(visible).click();
        return this;
    }

    public EvaluationStartPage fillLicensePlate(String licensePlate) {
        $(LICENSE_PLATE_INPUT).shouldBe(visible).setValue(licensePlate);
        return this;
    }

    public EvaluationStartPage goToMileageStep() {
        $(IDENTIFIER_NEXT_BUTTON).shouldBe(visible).click();
        return this;
    }

    public EvaluationStartPage selectMileageRange() {
        $(MILEAGE_OPTION_BUTTON).shouldBe(visible).click();
        return this;
    }

    public EvaluationStartPage goToNextStep() {
        $(MILEAGE_NEXT_BUTTON).shouldBe(visible).click();
        return this;
    }

    public EvaluationStartPage choosePriceOption() {
        $(PRICE_SELECT_BUTTON).shouldBe(visible).click();
        return this;
    }

    public EvaluationStartPage fillContactPhone(String phone) {
        $(PHONE_INPUT).shouldBe(visible).setValue(phone);
        return this;
    }

    public EvaluationStartPage fillContactName(String name) {
        $(NAME_INPUT).shouldBe(visible).setValue(name);
        return this;
    }

    public EvaluationStartPage acceptAgreement() {
        $(AGREEMENT_CHECKBOX).shouldBe(visible).click();
        return this;
    }

    public SubmissionSuccessPage submitEvaluation() {
        $(SUBMIT_BUTTON).shouldBe(visible).click();
        return new SubmissionSuccessPage();
    }
}
