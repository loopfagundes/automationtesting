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
}