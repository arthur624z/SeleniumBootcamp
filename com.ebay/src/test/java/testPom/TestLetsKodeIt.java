package testPom;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.LetsKodeIt;
import testBase.TestBase;

public class TestLetsKodeIt extends TestBase {

    LetsKodeIt letsKodeIt;

    @Test (enabled = false)
    public void test1() throws Exception{
        letsKodeIt = getLetsKodeIt();
        letsKodeIt.createLetsKodeItAlert("Roly");

        Thread.sleep(2000);

        String actualText = getTextFromAlert();
        String expText = "Hello Roly, share this practice page and share your knowledge";

        dismissAlert();

        Assert.assertEquals(actualText, expText);
    }

    @Test (enabled = false)
    public void test2() throws Exception{
        letsKodeIt = getLetsKodeIt();

        String keys = "Pushpo";

        letsKodeIt.createSecondLetsKodeItAlert(keys);
        Thread.sleep(2000);

        String actualText = getTextFromAlert();
        String expText = "Hello " + keys + ", Are you sure you want to confirm?";

        confirmAlert();

        Assert.assertEquals(actualText, expText);
    }

    @Test (enabled = false)
    public void test3() throws Exception {
        letsKodeIt = getLetsKodeIt();

        String keys = "Pushpo";

        letsKodeIt.createSecondLetsKodeItAlert(keys);
        Thread.sleep(2000);

        String actualText = getTextFromAlert();
        String expText = "Hello " + keys + ", Are you sure you want to confirm?";

        dismissAlert();

        Assert.assertEquals(actualText, expText);
    }

    @Test
    public void testIFrame() throws Exception{
        letsKodeIt = getLetsKodeIt();

//        letsKodeIt.clickHomeButton();

//        driverWait.until(ExpectedConditions.urlToBe("https://courses.letskodeit.com/"));

        scrollJS(500);
        letsKodeIt.clickCoursesIFrameHomeButton();

        Thread.sleep(4000);
        Assert.assertTrue(isElementPresent(letsKodeIt.iFrameSignUpNowButton));
    }
}
