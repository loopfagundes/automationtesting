package com.automationtesting.validations;

import com.automationtesting.utils.WaitElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ValidateElementPageObject {
    private final WebDriver driver;
    private final WaitElement waitElement;

    public ValidateElementPageObject(WebDriver _driver) {
        driver = _driver;
        waitElement = new WaitElement(_driver);
    }

    public WebElement validateTextAreaLabel() {
        return waitElement.visibilityOf(By.cssSelector("#post-body-7988417473080013803 > div:nth-child(4) > center > h2:nth-child(2)"));
    }

    public WebElement validateTextBoxLabel() {
        return waitElement.visibilityOf(By.cssSelector("#post-body-7988417473080013803 > div:nth-child(4) > center > h2:nth-child(9)"));
    }

    public WebElement validateRadioButtonLabel() {
        return waitElement.visibilityOf(By.cssSelector("#post-body-7988417473080013803 > div:nth-child(4) > center > h2:nth-child(16)"));
    }

    public WebElement validateCheckBoxLabel() {
        return waitElement.visibilityOf(By.cssSelector("#post-body-7988417473080013803 > div:nth-child(4) > center > h2:nth-child(26)"));
    }

    public WebElement validateInputTypeButton() {
        return waitElement.visibilityOf(By.cssSelector("#post-body-7988417473080013803 > div:nth-child(4) > center > h2:nth-child(39)"));
    }

    public WebElement validateImageLabel() {
        return waitElement.visibilityOf(By.cssSelector("#post-body-7988417473080013803 > div:nth-child(4) > center > h2:nth-child(44)"));
    }

    public WebElement validateImageAti() {
        return waitElement.visibilityOf(By.cssSelector("#post-body-7988417473080013803 > div:nth-child(4) > center > img"));
    }

    public WebElement validateDropDownLabel() {
        return waitElement.visibilityOf(By.cssSelector("#post-body-7988417473080013803 > div:nth-child(4) > center > h2:nth-child(48)"));
    }
}