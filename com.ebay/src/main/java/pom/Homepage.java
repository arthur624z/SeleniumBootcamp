package pom;

import base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends BaseClass {

    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//input[@type='text']")
    public WebElement searchInput;

    @FindBy (css = "select#gh-cat")
    public WebElement categoryDropdown;

    @FindBy (css = "input#gh-btn")
    public WebElement searchButton;

    @FindBy (css = "div.srp-controls__control.srp-controls__count > h1 > span:nth-child(2)")
    public WebElement searchResultPageElement;


    public void doSearch(String searchTerm, String category) {
        sendKeysToSearchInput(searchTerm);
        selectSearchCategory(category);
        clickSearchButton();
    }

    private void clickSearchButton() {
        clickOnElement(searchButton);
    }

    private void selectSearchCategory(String category) {
        dropdownSelectByVisibleText(categoryDropdown, category);
    }

    private void sendKeysToSearchInput(String keys) {
        sendKeysToInput(searchInput, keys);
    }
}
