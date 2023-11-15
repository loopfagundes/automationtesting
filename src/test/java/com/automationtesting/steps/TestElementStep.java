package com.automationtesting.steps;

import com.automationtesting.pageobjects.TestElementPageObject;
import com.automationtesting.utils.Report;
import com.aventstack.extentreports.Status;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;

public class TestElementStep {
    private final WebDriver driver;
    private final TestElementPageObject testElementPageObject;
    private final ValidateElementStep validateElementStep;
    private Faker faker;

    public TestElementStep(WebDriver _driver) {
        driver = _driver;
        testElementPageObject = new TestElementPageObject(_driver);
        validateElementStep = new ValidateElementStep(_driver);
        faker = new Faker();
    }

    public TestElementStep indexPage() {
        textArea();
        return this;
    }

    private TestElementStep textArea() {
        Report.log(Status.INFO, "Text Area");
        testElementPageObject.textAreatextField().clear();
        testElementPageObject.textAreatextField().sendKeys(faker.harryPotter().spell());
        validateElementStep.textAreaValidate();
        return this;
    }
}