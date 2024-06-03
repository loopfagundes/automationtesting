package com.automationtesting.utils;

import com.automationtesting.webdrivers.BrowserEnum;
import com.automationtesting.webdrivers.DriverFactory;
import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import static com.automationtesting.webdrivers.DriverManager.*;

@Listeners({ExtentITestListenerClassAdapter.class, Report.class})
public class BaseTest {

    @BeforeMethod
    public void setUp() {
        WebDriver driver = DriverFactory.createInstance(BrowserEnum.CHROME);
        setDriver(driver);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        quitDriver();
    }
}