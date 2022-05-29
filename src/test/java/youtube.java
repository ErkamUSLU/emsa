import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class youtube {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.youtube.com");
        WebElement aramaKutusuElementi = driver.findElement(By.xpath("//input[@id='search']"));
        aramaKutusuElementi.sendKeys("naimi");
        aramaKutusuElementi.submit();
        WebElement ilkVideoElenti = driver.findElement(By.xpath("(//a[@id='video-title'])[1]"));
        String ilkvideoLinki = ilkVideoElenti.getAttribute("href");
        System.out.println(ilkvideoLinki);
        driver.switchTo().newWindow(WindowType.TAB).get("https://videoindir.com.tr/");
        WebElement youtubeLinkiYapistirmaElementi = driver.findElement(By.xpath("//input[@name='url']"));
        youtubeLinkiYapistirmaElementi.sendKeys(ilkvideoLinki+ Keys.ENTER);
        driver.findElement(By.xpath("//a[@target='_blank'][3]"+Keys.ENTER));
    }
}
