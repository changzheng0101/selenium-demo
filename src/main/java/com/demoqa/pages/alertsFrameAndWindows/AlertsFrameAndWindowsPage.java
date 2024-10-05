package com.demoqa.pages.alertsFrameAndWindows;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

public class AlertsFrameAndWindowsPage extends HomePage {

    private final By modalDialogsMenuItem = By.xpath("//span[text()='Modal Dialogs']");
    private final By alertsMenuItem = By.xpath("//span[text()='Alerts']");

    public ModalDialogsPage clickModalDialogs() {
        click(modalDialogsMenuItem);
        return new ModalDialogsPage();
    }

    public AlertsPage clickAlerts() {
        click(alertsMenuItem);
        return new AlertsPage();
    }
}
