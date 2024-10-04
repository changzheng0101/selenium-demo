package com.demoqa.pages;

import com.base.BasePage;
import com.demoqa.pages.elements.ElementsPage;
import com.demoqa.pages.forms.FormsPage;
import org.openqa.selenium.By;

public class HomePage extends BasePage {
    private final By formsCard = By.xpath("//h5[text()='Forms']");
    private final By elementsCard = By.xpath("//h5[text()='Elements']");

    public FormsPage goToForms() {
        click(formsCard);
        return new FormsPage();
    }


    public ElementsPage goToElementsPage() {
        click(elementsCard);
        return new ElementsPage();
    }
}

