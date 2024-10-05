package com.demoqa.pages.alertsFrameAndWindows;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

public class AlertsFrameAndWindowsPage extends HomePage {

    private final By modalDialogsMenuItem = By.xpath("//span[text()='Modal Dialogs']");

    public ModalDialogsPage clickModalDialogs() {
        click(modalDialogsMenuItem);
        return new ModalDialogsPage();
    }
}
