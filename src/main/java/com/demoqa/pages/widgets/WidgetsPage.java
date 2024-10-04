package com.demoqa.pages.widgets;

import com.demoqa.pages.HomePage;
import com.util.JavaScriptUtil;
import org.openqa.selenium.By;

import static com.util.JavaScriptUtil.scrollToElementJS;

public class WidgetsPage extends HomePage {
    private final By selectMenuItem = By.xpath("//ul[@class='menu-list']//span[text()='Select Menu']");

    public SelectMenuPage clickSelectMenu() {
        scrollToElementJS(selectMenuItem);
        click(selectMenuItem);
        return new SelectMenuPage();
    }
}
