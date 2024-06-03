package com.automationtesting.validations;

import com.automationtesting.utils.JsExecutor;
import com.automationtesting.utils.Report;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;

import static com.automationtesting.utils.JsExecutor.*;

public class ValidateElementStep {
    private final WebDriver driver;
    private final ValidateElementPageObject validateElementPageObject;
    private final JsExecutor jsExecutor;

    public ValidateElementStep(WebDriver _driver) {
        driver = _driver;
        validateElementPageObject = new ValidateElementPageObject(_driver);
        jsExecutor = new JsExecutor();
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

    public ValidateElementStep radioButtonValidate() {
        if (validateElementPageObject.validateRadioButtonLabel().getText().equals("RADIO-BUTTON")) {
            Report.log(Status.PASS, "Validou o RADIO-BUTTON.");
        } else {
            highlight(driver, validateElementPageObject.validateRadioButtonLabel());
            Report.logCapture(Status.FAIL, "Não validou o RADIO-BUTTON.");
        }
        return this;
    }

    public ValidateElementStep checkBoxValidate() {
        if (validateElementPageObject.validateCheckBoxLabel().getText().equals("CHECKBOX")) {
            Report.log(Status.PASS, "Validou o CHECKBOX.");
        } else {
            highlight(driver, validateElementPageObject.validateCheckBoxLabel());
            Report.logCapture(Status.FAIL, "Não validou o CHECKBOX.");
        }
        return this;
    }

    public ValidateElementStep inputTypeButtonValidate() {
        if (validateElementPageObject.validateInputTypeButton().getText().equals("INPUT TYPE BUTTON")) {
            Report.log(Status.PASS, "Validou o INPUT TYPE BUTTON.");
        } else {
            highlight(driver, validateElementPageObject.validateInputTypeButton());
            Report.logCapture(Status.FAIL, "Não validou o INPUT TYPE BUTTON.");
        }
        return this;
    }

    public ValidateElementStep imageValidate() {
        if (validateElementPageObject.validateImageLabel().getText().equals("IMAGE")) {
            Report.log(Status.PASS, "Validou a IMAGE.");
        } else {
            highlight(driver, validateElementPageObject.validateImageLabel());
            Report.logCapture(Status.FAIL, "Nao validou a IMAGE");
        }

        if (jsExecutor.imagePresent(driver, validateElementPageObject.validateImageAti())) {
            Report.log(Status.PASS, "A imagem esta presencial.");
        } else {
            highlight(driver, validateElementPageObject.validateImageAti());
            Report.logCapture(Status.FAIL, "A imagem nao foi presencial.");
        }
        return this;
    }
}