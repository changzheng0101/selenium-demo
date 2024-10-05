package com.demoqa.pages.alertsFrameAndWindows;

import org.openqa.selenium.By;

public class AlertsPage extends AlertsFrameAndWindowsPage {
    private final By informationAlertButton = By.id("alertButton");
    private final By confirmAlertButton = By.id("confirmButton");

    public void clickInformationAlertButton() {
        click(informationAlertButton);
    }
}
