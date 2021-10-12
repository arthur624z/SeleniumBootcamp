package testBase;

import POM.Homepage;
import POM.Shop;
import base.Base;
import base.ExcelReader;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.util.List;

public class TestBase extends Base {

    public Homepage getHomepage() {
        return new Homepage();
    }

    public Shop getShop() {
        return new Shop();
    }