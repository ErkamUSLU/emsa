import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class senaHanimKonuAnlatProject {
    public static void main(String[] args) throws InterruptedException {
        // google'a git
        // trendyolu ara
        // trendyol linkini bulup siteye git
        // avize arat
        // toplam ürün sayısını al
        // yeni sekmede morhipoya git
        // avize arat
        // toplam ürün sayısını al
        // iki sitedeki topla avize sayısını karşılaştır
        // ürün sayısı fazla olan siteyi kapat

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://google.com");

        // arama kutusu -> name
        WebElement aramaKutusu = driver.findElement(By.name("q"));
        aramaKutusu.sendKeys("trendyol"); // +Keys.ENTER
        aramaKutusu.submit();

        // trendyola git
        WebElement ilkSonuc = driver.findElement(By.partialLinkText("trendyol"));
        ilkSonuc.click();

        // avize arat
        WebElement trendyolAramaKutusu = driver.findElement(By.xpath("//*[@id=\"auto-complete-app\"]/div/div/input"));
        trendyolAramaKutusu.sendKeys("avize" + Keys.ENTER);

        // toplam ürün sayısını al
        String trendyolAramaSonucSayisiStr = driver.findElement(By.xpath("//*[@id=\"search-app\"]/div/div[1]/div[2]/div[1]/div[1]/div")).getText();
        int trendyolToplamSonuc = Integer.parseInt(trendyolAramaSonucSayisiStr.replaceAll("\\D",""));
        System.out.println("trendyol toplam ürün : "+trendyolToplamSonuc);

        // yeni sekmede morhipoya git
        driver.switchTo().newWindow(WindowType.TAB).get("https://morhipo.com");

        // avize arat
        WebElement morhipoAramaKutusu = driver.findElement(By.xpath("//*[@id=\"pw-search-input\"]"));
        morhipoAramaKutusu.sendKeys("avize" + Keys.ENTER);

        // toplam ürün sayısını al
        String morhipoAramaSonucSayisiStr = driver.findElement(By.id("total-product-count")).getText();
        int morhipoToplamSonuc = Integer.parseInt(morhipoAramaSonucSayisiStr.replaceAll("\\D",""));
        System.out.println("morhipo toplam ürün : "+morhipoToplamSonuc);


        List<String> windows = new ArrayList<>(driver.getWindowHandles());
        // karşılaştır, az olanı kapat
        if (trendyolToplamSonuc>morhipoToplamSonuc){
            driver.switchTo().window(windows.get(0));
            Thread.sleep(2000);
            driver.close();
        }else{
            driver.close();
        }
    }
}
