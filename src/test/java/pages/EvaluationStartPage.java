package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class EvaluationStartPage {

    private static final By ONLINE_EVALUATE_BUTTON = byXpath(
            "/html/body/tr-modal-window/div/div/tr-modal-outlet/tr-scroll/div/ng-component/tr-online-evaluation-start-page/tr-online-evaluation-choice-evaluation/div/div/div/div[1]/div/div[3]/button");
    private static final By LICENSE_PLATE_INPUT = byXpath(
            "/html/body/tr-modal-window/div/div/tr-modal-outlet/tr-scroll/div/ng-component/tr-online-evaluation-start-page/tr-online-evaluation-steps-form/div[2]/form/div/tr-choice-type/div/tr-accordion-wrapper/div/div/div/tr-car-identifier-input/tr-control/div[2]/input");
    private static final By IDENTIFIER_NEXT_BUTTON = byXpath(
            "/html/body/tr-modal-window/div/div/tr-modal-outlet/tr-scroll/div/ng-component/tr-online-evaluation-start-page/tr-online-evaluation-steps-form/div[2]/form/div/tr-choice-type/div/button");
    private static final By MILEAGE_OPTION_BUTTON = byXpath(
            "/html/body/tr-modal-window/div/div/tr-modal-outlet/tr-scroll/div/ng-component/tr-online-evaluation-start-page/tr-online-evaluation-steps-form/div[2]/form/div/tr-online-evaluation-choice-run/div/tr-online-evaluation-accordion-slider-step/button/span[2]");
    private static final By MILEAGE_NEXT_BUTTON = byXpath(
            "/html/body/tr-modal-window/div/div/tr-modal-outlet/tr-scroll/div/ng-component/tr-online-evaluation-start-page/tr-online-evaluation-steps-form/div[2]/form/button/span[2]");
    private static final By PRICE_SELECT_BUTTON = byXpath(
            "/html/body/tr-modal-window/div/div/tr-modal-outlet/tr-scroll/div/ng-component/tr-online-evaluation-start-page/tr-online-evaluation-prices/div[2]/div/div/div[2]/div[5]/form/button/span[2]");
    private static final By PHONE_INPUT = byXpath(
            "/html/body/tr-modal-window/div/div/tr-modal-outlet/tr-scroll/div/ng-component/tr-online-evaluation-start-page/tr-online-evaluation-result-form/div[2]/div/div/div[1]/form/tr-result-form-fields/div[1]/tr-control/div[2]/tr-input-phone/input");
    private static final By NAME_INPUT = byXpath(
            "/html/body/tr-modal-window/div/div/tr-modal-outlet/tr-scroll/div/ng-component/tr-online-evaluation-start-page/tr-online-evaluation-result-form/div[2]/div/div/div[1]/form/tr-result-form-fields/div[2]/tr-control/div[2]/input");
    private static final By AGREEMENT_CHECKBOX = byXpath(
            "/html/body/tr-modal-window/div/div/tr-modal-outlet/tr-scroll/div/ng-component/tr-online-evaluation-start-page/tr-online-evaluation-result-form/div[2]/div/div/div[1]/form/tr-agreement-block/tr-legal-block[1]/div/div/tr-checkbox/label");
    private static final By SUBMIT_BUTTON = byXpath(
            "/html/body/tr-modal-window/div/div/tr-modal-outlet/tr-scroll/div/ng-component/tr-online-evaluation-start-page/tr-online-evaluation-result-form/div[2]/div/div/div[1]/form/div/button/span[2]");

    public EvaluationStartPage clickEvaluateOnline() {
        $(ONLINE_EVALUATE_BUTTON).shouldBe(visible).click();
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
