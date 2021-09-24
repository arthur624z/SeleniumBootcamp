package testPom;

import org.testng.annotations.Test;
import pom.Homepage;
import testBase.TestBase;

public class TestHomepage extends TestBase {

    Homepage homepage;

    @Test
    public void navToHomepage() throws Exception {
        homepage = getHomepage();
        homepage.clickOnDepart();
        homepage.getFirstMonthWeeks();
    }
}
