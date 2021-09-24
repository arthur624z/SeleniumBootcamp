package pom;

import base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Date;
import java.util.List;

public class Homepage extends BaseClass {

    public Homepage() {
        PageFactory.initElements(driver, this);
        acceptCookiesPopUpWindow();
    }

    @FindBy(xpath = "//iframe[@title='TrustArc Cookie Consent Manager']")
    public WebElement cookiesPopUpIFrame;

    @FindBy(css = "div.pdynamicbutton > a.call")
    public WebElement acceptAllCookiesButton;

    @FindBy(id = "jb-autocomplete-2-search")
    public WebElement fromInput;

    @FindBy(id = "jb-autocomplete-1-search")
    public WebElement toInput;

    @FindBy(id = "jb-autocomplete-2-option-item-4")
    public WebElement newYorkComboBoxOption;

    @FindBy(id = "jb-autocomplete-1-option-item-2")
    public WebElement losAngelesComboBoxOption;

    @FindBy(id = "jb-date-picker-input-id-0")
    public WebElement departInput;

    @FindBy(id = "jb-date-picker-input-id-1")
    public WebElement returnInput;

    @FindBy(tagName = "jb-range-calendar")
    public WebElement calendarDatePicker;

    @FindBy(css = "div.flex-auto.calendar-month-container.first-month.two-month.ng-star-inserted")
    public WebElement datePickerFirstMonth;

    @FindBy (css = "div.flex-auto.calendar-month-container.first-month.two-month.ng-star-inserted jb-calendar-month")
    public WebElement firstMonth;

    @FindBy (css = "div.flex-auto.calendar-month-container.two-month.ng-star-inserted.last-month")
    public WebElement datePickerSecondMonth;

    @FindBy (css = "div.flex-auto.calendar-month-container.two-month.ng-star-inserted.last-month jb-calendar-month")
    public WebElement secondMonth;

    public void acceptCookiesPopUpWindow() {
        boolean flag = true;

        try {
            driver.switchTo().frame(cookiesPopUpIFrame);
        } catch (NoSuchElementException e) {
            flag = false;
        }

        if (flag) {
            try {
                clickOnElement(acceptAllCookiesButton);
            } catch (NoSuchElementException e) {

            }
        }
    }

    public void sendKeysToTravelFromCity(String keys) {
        sendKeysToInput(fromInput, keys);
    }

    public void selectFromCity() {
        clickOnElement(newYorkComboBoxOption);
    }

    public void selectToCity() {
        clickOnElement(losAngelesComboBoxOption);
    }

    public void sendKeysToTravelToCity(String keys) {
        sendKeysToInput(toInput, keys);
    }

    public void clickOnDepart() {
        clickOnElement(departInput);
    }

    public void clickOnReturn() {
        clickOnElement(returnInput);
    }

    public void getFirstMonthWeeks() {

        List<WebElement> weeks = driver.findElements(By.cssSelector("div.flex-auto.calendar-month-container.first-month.two-month.ng-star-inserted jb-calendar-month"));

        int size = weeks.size();
        System.out.println(size);

//        for (int i = 0; i<weeks.size(); i++) {
//
//        }

    }

    public void selectDepartureDate() {
        clickOnDepart();
        waitForElementToBeVisible(calendarDatePicker);

    }


    public void selectReturnDate() {

    }

}
