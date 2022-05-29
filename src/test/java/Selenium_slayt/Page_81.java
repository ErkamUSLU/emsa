package Selenium_slayt;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Page_81 {
    /*
    1-C01_TekrarTesti isimli bir class olusturun
    2- https://www.google.com/ adresine gidin
    3- cookies uyarisini kabul ederek kapatin
    4-Sayfa basliginin “Google” ifadesi icerdigini test edin
    5- Arama cubuguna “Nutella” yazip aratin
    6-Bulunan sonuc sayisini yazdirin
    7- sonuc sayisinin 10 milyon’dan fazla oldugunu test edin
    8-Sayfayi kapati
    */
    @Test
public void tekrar() {
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    // 2- https://www.google.com/ adresine gidin
    driver.get("https://www.google.com/");
    //3- cookies uyarisini kabul ederek kapatin
    //4-Sayfa basliginin “Google” ifadesi icerdigini test edin
        if( driver.getTitle().contains("Google")){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }
     //5- Arama cubuguna “Nutella” yazip aratin
        driver.findElement(By.cssSelector("input[name='q']")).sendKeys("Nutella");// Keys.ENTER
        driver.findElement(By.cssSelector("input[class='gNO89b']")).click();
        //6-Bulunan sonuc sayisini yazdirin
        WebElement sayilar=driver.findElement(By.cssSelector("div[id='result-stats']"));
        int a=Integer.parseInt(sayilar.getText().replaceAll("\\D", ""));
        System.out.println(a);
        //7- sonuc sayisinin 10 milyon’dan fazla oldugunu test edin
        if (a>10000000){
            System.out.println("7.part PASSED");
        }else{
            System.out.println("7.part FAILED");
        }
        //8-Sayfayi kapati
        driver.quit();
    }
}
