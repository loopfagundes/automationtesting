package com.automationtesting.utils;

import org.openqa.selenium.WebDriver;

public class ActionsSupport {

    public static void backBrowser(WebDriver driver) {
        driver.navigate().back();
    }
}