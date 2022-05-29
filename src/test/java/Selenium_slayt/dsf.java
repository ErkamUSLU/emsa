package Selenium_slayt;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class dsf {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.google.com");
       WebElement googleArmaKutusuElementi = driver.findElement(By.cssSelector("input[title='Ara']"));
       googleArmaKutusuElementi.sendKeys("https://www.amazon.com" + Keys.ENTER);

       WebElement amazonLinkiElementi = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/div[1]/div/a/h3"));
        amazonLinkiElementi.click();


        WebElement amazonAramaKutusuElementi = driver.findElement(By.id("twotabsearchtextbox"));
        amazonAramaKutusuElementi.sendKeys("city bike");

       amazonAramaKutusuElementi.submit();

      /* WebElement aramaSonucSayisi = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[1]"));
        String arr[] = aramaSonucSayisi.getText().split(" ");
        System.out.println(arr[2]);

        WebElement ilkSonucElementi = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/div/div/div/div/div/div/div[1]/div/div[2]/div/span/a/div/img"));
        ilkSonucElementi.click();*/
    }
}