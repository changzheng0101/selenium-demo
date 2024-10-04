package com.demoqa.pages.elements;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

public class ElementsPage extends HomePage {
    private final By webTablesMenuItem = By.xpath("//ul[@class='menu-list']//span[text()='Web Tables']");
    private final By LinksMenuItem = By.xpath("//ul[@class='menu-list']//span[text()='Links']");

    public WebTablesPage clickWebTables() {
        click(webTablesMenuItem);
        return new WebTablesPage();
    }

    public LinksPage clickLinks() {
        click(LinksMenuItem);
        return new LinksPage();
    }
}
