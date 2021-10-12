package testPom;

import base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import testBase.Rent;

public class Rent extends BaseClass {
    public Rent rent = new Rent();


    public void rentPage() {
        rent = new Rent();
        rent.rentPage();
    }

    public void rentSearchBoxValidData(){
        rent = new Rent();
        rent.rentSearchBoxValidData("Miami, Fl");
        String actualText = rent.rentSearchTitle.getText();
        String expectedText = "Apartments For Rent in Miami, FL";
        Assert.assertEquals(actualText,expectedText);
    }

    public void doSomethingIframeWindow(){
        rent = new Rent();
        rent.doSomethingIframeWindow();
    }
    public void rentSearchBoxInvalidData(){
        rent = new Rent();
        rent.rentSearchBoxInvalidData("dontwork");
        String actualText = rent.rentSearchErrorHeading.getText();
        String expectedText = "Our servers had an issue with your request.";
        Assert.assertEquals(actualText,expectedText);
    }

    public void rentSearchBoxWithCity(){
        rent = new Rent();
        rent.rentSearchBoxWithCity("Hollywood");
        String actualText = rent.rentSearchTitle.getText();
        String expectedText = "Apartments For Rent in Hollywood, Florida";
        Assert.assertEquals(actualText,expectedText);
    }

    public void rentSearchBoxWithCountry(){
        rent = new Rent();
        rent.rentSearchBoxWithCountry("Poland");
        String actualText = rent.rentSearchTitle.getText();
        String expectedText = "Poland, NY Homes For Sale & Real Estate";
        Assert.assertEquals(actualText,expectedText);
    }




}