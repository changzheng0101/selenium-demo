package part3.tests.alerts;

import com.demoqa.pages.alertsFrameAndWindows.AlertsPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import part3.base.BaseTest;

import static com.util.AlertUtil.*;

public class AlertsTest extends BaseTest {

    @Test
    public void testInformationAlert() {
        AlertsPage alertsPage = homePage.goToAlertsFrameAndWindows().clickAlerts();
        alertsPage.clickInformationAlertButton();
        String expectedAlertText = "You clicked a button";
        Assert.assertEquals(getAlertText(), expectedAlertText,
                "\n Actual & Expected Messages Do Not Match \n");
        acceptAlert();
    }
}
