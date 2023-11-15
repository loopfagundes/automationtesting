package com.automationtesting.steps;

import com.automationtesting.pageobjects.ValidateElementPageObject;
import com.automationtesting.utils.JsExecutor;
import com.automationtesting.utils.Report;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;

public class ValidateElementStep {
    private final WebDriver driver;
    private final ValidateElementPageObject validateElementPageObject;

    public ValidateElementStep(WebDriver _driver) {
        driver = _driver;
        validateElementPageObject = new ValidateElementPageObject(_driver);
    }

    public ValidateElementStep textAreaValidate() {
        if (validateElementPageObject.validateTextAreaLabel().getText().equals("TEXTAREA")) {
            Report.log(Status.PASS, "Validou TEXTAREA");
        } else {
            JsExecutor.highlight(driver, validateElementPageObject.validateTextAreaLabel());
            Report.logCapture(Status.FAIL, "Nao validou TEXTAREA");
        }
        return this;
    }
}
