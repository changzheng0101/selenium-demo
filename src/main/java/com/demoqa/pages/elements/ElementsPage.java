package com.demoqa.pages.elements;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

public class ElementsPage extends HomePage {
    private final By webTablesMenuItem = By.xpath("//ul[@class='menu-list']//span[text()='Web Tables']");

    public WebTablesPage clickWebTablesPage() {
        click(webTablesMenuItem);
        return new WebTablesPage();
    }
}
