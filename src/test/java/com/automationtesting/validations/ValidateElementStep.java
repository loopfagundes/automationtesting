package com.automationtesting.validations;

import com.automationtesting.utils.Report;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;

import static com.automationtesting.utils.JsExecutor.*;

public class ValidateElementStep {
    private final WebDriver driver;
    private final ValidateElementPageObject validateElementPageObject;

    public ValidateElementStep(WebDriver _driver) {
        driver = _driver;
        validateElementPageObject = new ValidateElementPageObject(_driver);
    }

    public ValidateElementStep textAreaValidate() {
        if (validateElementPageObject.validateTextAreaLabel().getText().equals("TEXTAREA")) {
            Report.log(Status.PASS, "Validou o TEXTAREA");
        } else {
            highlight(driver, validateElementPageObject.validateTextAreaLabel());
            Report.logCapture(Status.FAIL, "Não validou o TEXTAREA");
        }
        return this;
    }

    public ValidateElementStep textBoxValidate() {
        if (validateElementPageObject.validateTextBoxLabel().getText().equals("TEXTBOX")) {
            Report.log(Status.PASS, "Validou o TEXTBOX.");
        } else {
            highlight(driver, validateElementPageObject.validateTextBoxLabel());
            Report.logCapture(Status.FAIL, "Não validou o TEXTBOX.");
        }
        return this;
    }
}