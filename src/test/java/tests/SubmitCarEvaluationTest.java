package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.junit5.ScreenShooterExtension;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;
import pages.CarDetailPage;

public class SubmitCarEvaluationTest {

    private static final String CAR_DETAIL_URL = "https://m53.ru/buy-cars/used/nissan/micra-2003/u3260549";
    private static final String LICENSE_PLATE = "Е351АН159";
    private static final String PHONE = "9999999999";
    private static final String CONTACT_NAME = "тест";

    @RegisterExtension
    static final ScreenShooterExtension SCREEN_SHOOTER_EXTENSION =
            new ScreenShooterExtension(true).to("build/reports/tests");

    private CarDetailPage carDetailPage;

    @BeforeEach
    void setUp() {
        Configuration.timeout = 10_000;
        carDetailPage = new CarDetailPage();
    }

    @AfterEach
    void tearDown() {
        Selenide.closeWebDriver();
    }

    @Test
    void shouldSubmitCarEvaluationSuccessfully() {
        carDetailPage.openPage(CAR_DETAIL_URL)
                .clickEvaluateYourCar()
                .clickEvaluateOnline()
                .fillLicensePlate(LICENSE_PLATE)
                .goToMileageStep()
                .selectMileageRange()
                .goToNextStep()
                .choosePriceOption()
                .fillContactPhone(PHONE)
                .fillContactName(CONTACT_NAME)
                .acceptAgreement()
                .submitEvaluation()
                .shouldShowSuccessfulSubmission();
    }
}
