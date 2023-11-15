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

    public WebElement submitTextButton() {
        return waitElement.toBeClickable(By.cssSelector("#post-body-7988417473080013803 > div:nth-child(4) > center > form:nth-child(5) > input[type=submit]"));
    }

    public WebElement validateTextBoxLabel() {
        return waitElement.toBeClickable(By.cssSelector("#post-body-7988417473080013803 > div:nth-child(4) > center > h2:nth-child(9)"));
    }
}