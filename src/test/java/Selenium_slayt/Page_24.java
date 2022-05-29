package Selenium_slayt;

import org.junit.Assert;
import org.junit.Test;
import utilities.TestBaseClass;

public class Page_24 extends TestBaseClass {
    @Test
    public void test() {


        driver.get("https://www.amazon.com");
        System.out.println(driver.getTitle());
        String title=driver.getTitle();
        String Expected="Amazon";
        Assert.assertTrue(title.contains(Expected));
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().contains("amazon"));
        System.out.println(driver.getWindowHandle());
        System.out.println(driver.getPageSource());
        Assert.assertTrue(driver.getPageSource().contains("Logo"));

    }
}
