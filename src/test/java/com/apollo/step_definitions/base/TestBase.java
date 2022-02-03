package com.Practice.step_definitions.base;

import com.Practice.utilities.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class TestBase {

    @BeforeMethod
    public void setUpMethod(){

        Driver.getDriver();

    }

    @AfterMethod
    public void tearDown(){

        Driver.getDriver().close();

    }

}
