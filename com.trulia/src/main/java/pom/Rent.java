package testBase;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class Rent extends BaseClass {
    public Rent (){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"__next\"]/div[2]/header/nav/ul/li[2]/a")
    public WebElement rentDropDownAndButton;

    @FindBy(xpath = "//*[@id=\"locationInputs\"]")
    public WebElement rentSearchInputBox;

    @FindBy(xpath = "//*[@id=\"resultsColumn\"]/div[1]/div/h1/div")
    public WebElement rentSearchTitle;

    @FindBy(xpath = "//*[@id=\"resultsColumn\"]/div[1]/div[1]")
    public WebElement rentSearchErrorHeading;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[2]/header/nav/form/div/div/div/div/div[1]/div[2]/div/svg")
    public WebElement rentSearchBoxSearchButton;

    @FindBy(xpath = "//*[@id=\"main-content\"]/div[2]/section/div/div[1]/div/div/iframe")
    public WebElement iframWindowRentPage;

    @FindBy(xpath = "//*[@id=\"main-content\"]/div[2]/section/div/div[1]/div/div/div[12]/div[2]/div/div/button[1]")
    public WebElement iframeWindowZoomButton;

    public void rentPage(){
        clickrentDropDownAndButton();
    }
    public void rentSearchBoxValidData(String state){
        clickrentDropDownAndButton();
        sendKeysTorentSearchInputBox(state);
        clickrentSearchBoxSearchButton();
    }
    public void rentSearchBoxInvalidData(String data){
        clickrentDropDownAndButton();
        sendKeysTorentSearchInputBox(data);
        clickrentSearchBoxSearchButton();
    }
    public void rentSearchBoxWithCity(String city){
        clickrentDropDownAndButton();
        sendKeysTorentSearchInputBox(city);
        clickrentSearchBoxSearchButton();
    }
    public void rentSearchBoxWithCountry(String country){
        clickrentDropDownAndButton();
        sendKeysTorentSearchInputBox(country);
        clickrentSearchBoxSearchButton();
    }
    public void doSomethingIframeWindow(){
        clickrentDropDownAndButton();
        waitForElementToBeVisible(iframWindowRentPage);
        mouseHover(iframWindowRentPage);
        driver.switchTo().frame(iframWindowRentPage);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        clickiframeWindowZoomButton();

    }
    private void clickrentDropDownAndButton(){clickJScript(rentDropDownAndButton);}
    private void sendKeysTorentSearchInputBox(String state) {
        sendKeysToElement(rentSearchInputBox, state);
    }
    private void clickrentSearchBoxSearchButton(){clickJScript(rentSearchBoxSearchButton);}
    private void clickiframeWindowZoomButton(){clickJScript(iframeWindowZoomButton);}


}