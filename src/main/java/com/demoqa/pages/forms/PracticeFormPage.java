package com.demoqa.pages.forms;

import org.openqa.selenium.By;

public class PracticeFormPage extends FormsPage {
    private final By femaleRadioButton = By.xpath("//label[text()='Female']");

    public void clickFemaleRadioButton() {
        click(femaleRadioButton);
    }
}
