package com.automationtesting.steps;

import com.automationtesting.pageobjects.TestElementPageObject;
import com.automationtesting.utils.Report;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestElementStep {
    private final WebDriver driver;
    private final TestElementPageObject testElementPageObject;

    public TestElementStep(WebDriver _driver) {
        driver = _driver;
        testElementPageObject = new TestElementPageObject(_driver);
    }

    public TestElementStep indexPage() {
        textArea();
        return this;
    }

    private TestElementStep textArea() {
        Report.log(Status.INFO, "Text Area");
        Assert.assertEquals(testElementPageObject.validateTextAreaLabel().getText(), "TEXTAREA");
        testElementPageObject.textAreatextField().clear();
        testElementPageObject.textAreatextField().sendKeys("Gol!");
        return this;
    }
}