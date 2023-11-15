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
            Report.log(Status.PASS, "Validou TEXTAREA");
        } else {
            highlight(driver, validateElementPageObject.validateTextAreaLabel());
            Report.logCapture(Status.FAIL, "Não validou TEXTAREA");
        }
        return this;
    }

    public ValidateElementStep submitTextAreaValidate() {
        if (validateElementPageObject.submitTextButton().isDisplayed()) {
            validateElementPageObject.submitTextButton().click();
            Report.log(Status.PASS, "O botão de enviar recebeu um clicado.");
        } else {
            highlight(driver, validateElementPageObject.submitTextButton());
            Report.logCapture(Status.FAIL, "O botão de enviar nao recebeu um clicado");
        }
        return this;
    }

    public ValidateElementStep textBoxValidate() {
        System.out.println(validateElementPageObject.validateTextBoxLabel().getText());
        return this;
    }
}