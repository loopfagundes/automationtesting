package com.automationtesting.pageobjects;

import com.automationtesting.utils.WaitElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestElementPageObject {

    private final WebDriver driver;
    private final WaitElement waitElement;

    public TestElementPageObject(WebDriver _driver) {
        driver = _driver;
        waitElement = new WaitElement(_driver);
    }

    public WebElement textAreaTextField() {
        return waitElement.toBeClickable(By.cssSelector("#post-body-7988417473080013803 > div:nth-child(4) > center > form:nth-child(5) > textarea"));
    }

    public WebElement firstNameTextField() {
        return waitElement.toBeClickable(By.cssSelector("#post-body-7988417473080013803 > div:nth-child(4) > center > form:nth-child(13) > input[type=text]:nth-child(2)"));
    }

    public WebElement lastNameTextField() {
        return waitElement.toBeClickable(By.cssSelector("#post-body-7988417473080013803 > div:nth-child(4) > center > form:nth-child(13) > input[type=text]:nth-child(5)"));
    }

    public WebElement radioButtonNoCheckBox() {
        return waitElement.toBeClickable(By.cssSelector("#post-body-7988417473080013803 > div:nth-child(4) > center > input[type=radio]:nth-child(22)"));
    }

    public WebElement radioButtonYesCheckBox() {
        return waitElement.toBeClickable(By.cssSelector("#post-body-7988417473080013803 > div:nth-child(4) > center > input[type=radio]:nth-child(20)"));
    }

    public WebElement radioButtonOtherCheckBox() {
        return waitElement.toBeClickable(By.cssSelector("#post-body-7988417473080013803 > div:nth-child(4) > center > input[type=radio]:nth-child(24)"));
    }

    public WebElement firstCheckBox() {
        return waitElement.toBeClickable(By.cssSelector("#post-body-7988417473080013803 > div:nth-child(4) > center > input[type=checkbox]:nth-child(30)"));
    }

    public WebElement secondCheckBox() {
        return waitElement.toBeClickable(By.cssSelector("#post-body-7988417473080013803 > div:nth-child(4) > center > input[type=checkbox]:nth-child(32)"));
    }

    public WebElement thridCheckBox() {
        return waitElement.toBeClickable(By.cssSelector("#post-body-7988417473080013803 > div:nth-child(4) > center > input[type=checkbox]:nth-child(34)"));
    }

    public WebElement fourthCheckBox() {
        return waitElement.toBeClickable(By.cssSelector("#post-body-7988417473080013803 > div:nth-child(4) > center > input[type=checkbox]:nth-child(36)"));
    }

    public WebElement clickMeButton() {
        return waitElement.toBeClickable(By.cssSelector("#post-body-7988417473080013803 > div:nth-child(4) > center > input[type=button]:nth-child(40)"));
    }
}