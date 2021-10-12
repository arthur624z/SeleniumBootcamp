package testPom;

import org.testng.Assert;
import org.testng.annotations.Test;
import testBase.TestBase;

import java.awt.*;
import java.io.IOException;
import java.util.List;

public class TestShop extends TestBase {

    public void testListofSelectClass() throws IOException{
        getShop().clickOnSelectClass();
        List<String> actualCategories =  getShop().getListofSelectClassList();
        compareStringList(actualCategories,expectedCategories);
    }

    public void testListofSelectModel() throws IOException,AWTException {
        getShop().clickOnSelectModel();
        List<String> actualCategories =  getShop().getListofSelectModelList();
        compareStringList(actualCategories,expectedCategories);
    }

    public void testSelectClass() throws IOException{
        getShop().selectClass();
        String actualResult  =  getShop().getSelectClassResult();
        String[] expectedResults =getExcelFile("class");
        Assert.assertEquals(actualResult,expectedResults[1]);
    }

    public void testSelectModel() throws IOException{
        getShop().selectModel();
        String actualResult  =  getShop().getSelectModelResult();
        Assert.assertEquals(actualResult,expectedResults[1]);
    }
}