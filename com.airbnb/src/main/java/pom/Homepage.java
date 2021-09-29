package pom;

import base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class Homepage extends BaseClass {

    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    public List<String> getExploreNearbyElements() {
        List<String> cityNames = new ArrayList<>();
        List<WebElement> elementList = driver.findElements(By.cssSelector(getExploreNearbyCityNamesElements()));

        for (int i = 0; i < elementList.size(); i++){
            cityNames.add(i, elementList.get(i).getText());
        }
        return cityNames;
    }

    public List<String> getExploreNearbyElementURLs() {
        List<String> urls = new ArrayList<>();
        List<WebElement> elements = driver.findElements(By.cssSelector(getExploreNearbyCityURLElements()));

        for (int i = 0; i < elements.size(); i++) {
            urls.add(i, elements.get(i).getAttribute("href"));
        }
        return urls;
    }

    private String getExploreNearbyCityNamesElements() {
        return "#site-content div._m35t2y > div a > span:nth-child(2) span._pihus2:nth-child(1)";
    }

    private String getExploreNearbyCityURLElements() {
        return "#site-content div._m35t2y > div a";
    }

}
