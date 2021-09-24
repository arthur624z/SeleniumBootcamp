package testPom;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom.Homepage;
import testBase.TestBase;

public class TestHomepage extends TestBase {

    Homepage homepage;

    @Test(enabled = true)
    public void testDoSearch() throws Exception {
        homepage = getHomepage();

        homepage.doSearch("Playstation 5", "Video Games & Consoles");
        String expTitle = "playstation 5 in Video Games and Consoles | eBay";

        waitForElementToBeVisible(homepage.searchResultPageElement);
        scrollJS(1000);
        Thread.sleep(1000);
        scrollJS(-500);
        Thread.sleep(1000);
        scrollJS(6000);
        Thread.sleep(1000);

        Assert.assertEquals(driver.getTitle(), expTitle);
    }
}
