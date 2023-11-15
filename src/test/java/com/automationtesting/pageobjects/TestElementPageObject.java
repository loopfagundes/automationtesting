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

    public WebElement textAreatextField() {
        return waitElement.toBeClickable(By.cssSelector("#post-body-7988417473080013803 > div:nth-child(4) > center > form:nth-child(5) > textarea"));
    }


}