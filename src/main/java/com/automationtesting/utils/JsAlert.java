package com.automationtesting.utils;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class JsAlert {
    private static Alert alert;

    public static Alert jsAlertAccept(WebDriver driver) {
        alert = driver.switchTo().alert();
        alert.accept();
        return alert;
    }
}