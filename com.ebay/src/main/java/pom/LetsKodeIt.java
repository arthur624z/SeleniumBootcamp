package pom;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LetsKodeIt extends BaseClass {

    public LetsKodeIt() {
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//input[@name='enter-name']")
    public WebElement inputName;

    @FindBy (id = "alertbtn")
    public WebElement alertButton;

    @FindBy (id = "confirmbtn")
    public WebElement confirmButton;

    @FindBy (xpath = "//*[@id=\"navbar-inverse-collapse\"]/ul/li[1]/a")
    public WebElement homeButton;

    @FindBy (id = "courses-iframe")
    public WebElement coursesIFrame;

    @FindBy (xpath = "//*[@id=\"navbar-inverse-collapse\"]/ul/li[1]/a")
    public WebElement iFrameHomeButton;

    @FindBy (css = "#page > div.content-style.block.cta.background-cover.center-center.padding-top-50.padding-bottom-50.parrot.zenler-home-top-outr.sb_active_blk > div.container > div > div > div > div > div:nth-child(3) > a")
    public WebElement signUpNowButton;

    @FindBy (xpath = "//*[@id=\"page\"]/div[2]/div[2]/div/div/div/div/div[3]/a")
    public WebElement iFrameSignUpNowButton;

    public void sendKeysToInputName(String keys) {
        sendKeysToInput(inputName, keys);
    }

    public void clickAlertButton() {
        clickJScript(alertButton);
    }

    public void clickConfirmButton() {
        clickJScript(confirmButton);
    }

    public void createLetsKodeItAlert(String keys) {
        sendKeysToInputName(keys);
        clickAlertButton();

        driverWait.until(ExpectedConditions.alertIsPresent());
    }

    public void createSecondLetsKodeItAlert(String keys) {
        sendKeysToInputName(keys);
        clickConfirmButton();
    }

    public void clickHomeButton() {
        clickJScript(homeButton);
    }

    public void switchToCoursesIFrame() {
        driver.switchTo().frame(coursesIFrame);
    }

    public void clickCoursesIFrameHomeButton() {
        switchToCoursesIFrame();
        clickOnElement(iFrameHomeButton);
    }



}
