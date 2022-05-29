package Selenium_slayt;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBaseClass;

public class Page_154 extends TestBaseClass {
//1- Bir Class olusturalim KeyboardActions1
//2- https://www.amazon.com sayfasina gidelim
//3- Arama kutusuna actions method’larine kullanarak
//   samsung A71 yazdirin ve Enter’a basarak arama yaptirin
//4- aramanin gerceklestigini test edin

    @Test
    public void test01() throws InterruptedException {
        driver.get("https://www.amazon.com");
        WebElement aramaKutusu= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        Actions action = new Actions(driver);
        action.click(aramaKutusu)
                .sendKeys("samsung")
                .keyDown(Keys.SHIFT)
                .sendKeys("a")
                .keyUp(Keys.SHIFT)
                .sendKeys("71")
                .sendKeys(Keys.ENTER)
                .perform();
        Thread.sleep(5000);
    }
}
