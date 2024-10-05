package com.util;

import org.openqa.selenium.By;

public class GetUtil extends BaseUtil {
    public static String getWebElementText(By locator) {
        return driver.findElement(locator).getText();
    }
}
