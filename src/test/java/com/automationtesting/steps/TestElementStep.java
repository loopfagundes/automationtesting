package com.automationtesting.steps;

import com.automationtesting.pageobjects.TestElementPageObject;
import com.automationtesting.utils.Report;
import com.automationtesting.validations.ValidateElementStep;
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
        textBox();
        return this;
    }

    private TestElementStep textArea() {
        Report.log(Status.INFO, "Text Area");
        testElementPageObject.textAreaTextField().clear();
        testElementPageObject.textAreaTextField().sendKeys(faker.harryPotter().spell());
        validateElementStep.textAreaValidate();
        return this;
    }

    private TestElementStep textBox() {
        Report.log(Status.INFO, "Text Box");
        validateElementStep.textBoxValidate();
        testElementPageObject.firstNameTextField().sendKeys(faker.name().firstName());
        testElementPageObject.lastNameTextField().sendKeys(faker.name().lastName());
        return this;
    }
}