package Selenium_slayt;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Page_54_AmazonSearchTest {
    public static void main(String[] args) {
        /*
        1)Bir class olusturun: AmazonSearhTest
        2)Main method olusturun ve assagidaki gorevleri taamamlayin
           a.google web sayfasına gidin. https://www. amazon.com/
           b. Search(ara) “city bike”
           c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
           d. “Shopping” e tıklayın.
           e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın
         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // a.google web sayfasına gidin. https://www. amazon.com/
        driver.get("https://www.amazon.com/");
        // b. Search(ara) “city bike”
        WebElement kutucuk=driver.findElement(By.id("twotabsearchtextbox"));
        kutucuk.sendKeys("city bike"+Keys.ENTER);
        //c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
    }
}
