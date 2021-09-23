package testPom;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom.Homepage;
import testBase.TestBase;

public class TestHomepage extends TestBase {

    Homepage homepage;

    @Test(enabled = true)
    public void testDoSearch() {
        homepage = getHomepage();

        homepage.doSearch("Playstation 5", "Video Games & Consoles");
        String expTitle = "playstation 5 in Video Games and Console | eBay";

        waitForElementToBeVisible(homepage.searchResultPageElement);

        Assert.assertEquals(driver.getTitle(), expTitle);
    }
}
