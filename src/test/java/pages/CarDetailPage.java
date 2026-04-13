package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CarDetailPage {

    private static final By EVALUATE_BUTTON = byText("Оцените ваш автомобиль");

    public CarDetailPage openPage(String url) {
        open(url);
        return this;
    }

    public EvaluationStartPage clickEvaluateYourCar() {
        $(EVALUATE_BUTTON).shouldBe(visible).click();
        return new EvaluationStartPage();
    }
}
