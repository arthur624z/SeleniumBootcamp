package testPom;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom.Homepage;
import testBase.TestBase;

import java.util.ArrayList;
import java.util.List;

public class TestHomepage extends TestBase {

    @Test (description = "02941", enabled = false)
    public void testCityNamesInExploreNearbySection() throws Exception {
        Homepage homepage = new Homepage();

        String path = System.getProperty("user.dir") + "/src/test/resources/AirbnbTestData.xlsx";
        String sheetName = "ExploreNearbyCityNames";

        List<String> actualCityNames = homepage.getExploreNearbyElements();
        List<String> expectedCityNames = dataReader.fileReaderStringListXSSF(path, sheetName);

        Assert.assertTrue(compareListsOfString(actualCityNames, expectedCityNames));
    }

    @Test (description = "02942")
    public void testCityURLsInExploreNearbySection() throws Exception {
        Homepage homepage = new Homepage();

        String path = System.getProperty("user.dir") + "/src/test/resources/AirbnbTestData.xlsx";
        String sheetName = "ExploreNearbyCityNamesLinks";

        List<String> urls = homepage.getExploreNearbyElementURLs();
        List<String> expectedURLs = dataReader.fileReaderStringListXSSF(path, sheetName);
        List<String> actualURLs = new ArrayList<>();

        for (int i = 0; i<urls.size(); i++) {
            int temp = urls.get(i).lastIndexOf('&');
            String tempURL = urls.get(i).substring(0, temp);

            int lastIndex = tempURL.lastIndexOf('&');
            String url = tempURL.substring(0, lastIndex);

            actualURLs.add(i, url);
        }

        Assert.assertTrue(TestBase.compareListsOfString(actualURLs, expectedURLs));
    }
}
