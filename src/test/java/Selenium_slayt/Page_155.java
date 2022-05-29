package Selenium_slayt;

import org.junit.Test;
import org.openqa.selenium.By;


import org.openqa.selenium.Keys;
import static org.openqa.selenium.Keys.TAB;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBaseClass;



public class Page_155 extends TestBaseClass {
     /*
      1- https://www.facebook.com adresine gidelim
      2- Yeni hesap olustur butonuna basalim
      3- Ad, soyad, mail ve sifre kutularina deger yazalim ve kaydol tusuna basalim
      4- Kaydol tusuna basalim
     */
    @Test
    public void Test01() throws InterruptedException {
         driver.get("https://www.facebook.com");
         driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
         WebElement isimKutusu = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
        Actions action=new Actions(driver);
        action.click(isimKutusu).
                sendKeys("Erkam").
                sendKeys(Keys.TAB).
                sendKeys("Uslu").
                sendKeys(TAB).
                sendKeys("uslu.erkam@hotmail.com").
                sendKeys(TAB).
                sendKeys("serhat mah. mehmet akif ersoy cad. 1282.sok. no:23").
                perform();
         Thread.sleep(5000);





     }
}
