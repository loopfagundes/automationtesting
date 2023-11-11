package com.automationtesting.testcases;

import com.automationtesting.utils.BaseTest;
import com.automationtesting.utils.Property;
import com.automationtesting.webdrivers.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestElementTestCase extends BaseTest {

    @Test
    public void TestElement() {
        WebDriver driver = DriverManager.getDriver();
        driver.get(Property.get("url"));
    }
}