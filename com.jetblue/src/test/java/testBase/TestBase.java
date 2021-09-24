package testBase;

import base.BaseClass;
import org.testng.annotations.BeforeMethod;
import pom.Homepage;

public class TestBase extends BaseClass {

    public Homepage getHomepage() {
        return new Homepage();
    }

}
