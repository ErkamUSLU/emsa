package Selenium_slayt;

import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import utilities.TestBaseClass;

public class Page_30 extends TestBaseClass {
    @Test
    public void test01() {
        driver.get("https://www.amazon.com");
        System.out.println(driver.manage().window().getSize());
        System.out.println(driver.manage().window().getPosition());
        driver.manage().window().setSize(new Dimension(300,200));

    }
}