package com.automationtesting.steps;

import com.automationtesting.pageobjects.TestElementPageObject;
import com.automationtesting.utils.JsAlert;
import com.automationtesting.utils.Report;
import com.automationtesting.validations.ValidateElementStep;
import com.aventstack.extentreports.Status;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;

import static com.automationtesting.utils.JsExecutor.*;

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
        radioButton();
        checkbox();
        inputTypeButton();
        image();
        dropDown();
        webTable();
        return this;
    }

    private TestElementStep textArea() {
        Report.log(Status.INFO, "Text Area");
        validateElementStep.textAreaValidate();
        testElementPageObject.textAreaTextField().clear();
        testElementPageObject.textAreaTextField().sendKeys(faker.harryPotter().spell());
        return this;
    }

    private TestElementStep textBox() {
        Report.log(Status.INFO, "Text Box");
        validateElementStep.textBoxValidate();
        testElementPageObject.firstNameTextField().sendKeys(faker.name().firstName());
        testElementPageObject.lastNameTextField().sendKeys(faker.name().lastName());
        return this;
    }

    private TestElementStep radioButton() {
        Report.log(Status.INFO, "Radio-Button");
        validateElementStep.radioButtonValidate();
        scrollIntoView(driver, testElementPageObject.radioButtonNoCheckBox());
        testElementPageObject.radioButtonNoCheckBox().click();
        testElementPageObject.radioButtonYesCheckBox().click();
        testElementPageObject.radioButtonOtherCheckBox().click();
        return this;
    }

    private TestElementStep checkbox() {
        Report.log(Status.INFO, "CHECKBOX");
        validateElementStep.checkBoxValidate();
        testElementPageObject.firstCheckBox().click();
        testElementPageObject.secondCheckBox().click();
        testElementPageObject.thridCheckBox().click();
        testElementPageObject.fourthCheckBox().click();
        return this;
    }

    private TestElementStep inputTypeButton() {
        Report.log(Status.INFO, "INPUT TYPE BUTTON");
        validateElementStep.inputTypeButtonValidate();
        testElementPageObject.clickMeButton().click();
        JsAlert.jsAlertAccept(driver);
        return this;
    }

    private TestElementStep image() {
        Report.log(Status.INFO, "IMAGE");
        validateElementStep.imageValidate();
        return this;
    }

    private TestElementStep dropDown() {
        Report.log(Status.INFO, "DROPDOWN");
        validateElementStep.dropDownValidate();
        testElementPageObject.dropDownCarComboBox().selectByValue("saab");
        testElementPageObject.dropDownCarComboBox().selectByValue("volvo");
        testElementPageObject.dropDownCarComboBox().selectByValue("audi");
        testElementPageObject.dropDownCarComboBox().selectByValue("fiat");
        scrollIntoView(driver, testElementPageObject.submitButton());
        testElementPageObject.submitButton().click();
        return this;
    }

    private TestElementStep webTable() {
        Report.log(Status.INFO, "WEBTABLE");
        validateElementStep.webTableValidate();
        return this;
    }
}