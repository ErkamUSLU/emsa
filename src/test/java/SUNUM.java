import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SUNUM {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        //burada class'a webdriver'in yerini gosterdik.kullanilan method--> setProperty()
        //1)kullanilacak driver
        //2)driverin pc deki konumunu gosteren yol
        WebDriver driver = new ChromeDriver();
        //burada kullanilan webdriver ifadesinin anlami o bir interfacedir ve
        //onun araciligiyla searchContext interface'ine ulasiriz.
        //Boylece icine webelement yerlestirebilecegimiz finElements() listine ve finElement() methoduna ulasabiliyoruz
        driver.get("https://www.facebook.com");
        //burada kullandigimiz get ise icine String bir url yazmamiz gereken Webdriver interface'inin bir methodudur.
        driver.manage().window().maximize();
        //boyut ayarlarken minimize ya da fullscreen de kullanilabilir
        //burada zaten acikca gozuktugu uzere olusturdugumuz driver objesi uzerinden Webdriver interfacesinden mannage-window-maximize ulasiyoruz
        //maximize() methodu da browseri tam ekran yapar
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //bir ogeyi ararken driver'in beklemesi gereken sureyi gosterir saat,dakika,saniye,milisaniye gibi cesitleri vardir
        System.out.println(driver.getTitle());
        //bize string donduren webdriver interface'sinin bir methodudur.
        //Facebook - Giriş Yap veya Kaydol    yazdiriyor
        System.out.println(driver.getCurrentUrl());
        //icerikte zaten getTitle in bir uzerinde yer alan webdriver interfacesinin bir alt methodu
        //https://www.facebook.com/  donduruyor
   //     driver.close();
        //son olarak acilmis olan mevcut sayfayi kapatir
   //     driver.quit();
        //tum browser sayfalarini kapatir
        System.out.println(driver.getPageSource());
        //webdriver interface'inden cektigimiz bir method
        //bize sayfanin kaynagini dondurur
        System.out.println(driver.getWindowHandle());
        //bize sasyfanin hashcode'nu dondurur
        //CDwindow-8B4478E43BA4ADA26A7D52098EAC42BC
        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        //navigate bir navigation dondurur bu da siteye gidip gelme islemi yani back-forward ya da refresh islemi icin kullanilir
        System.out.println("pencere olculeri : "+driver.manage().window().getSize());
        //window kismini yukarida konusmustuk. bunun altindaki getSize() methodu da bize Dimension dondurur.yani pencere boyutunu verir
        System.out.println("pencere konumu : "+driver.manage().window().getPosition());
        //window kismini yukarida konusmustuk. bunun altindaki getPosition() methodu da bize Point dondurur.yani pencere (x,y) sini verir.
        //bu koordinati verirken sol alt koseyi esas alir

        //LOCATORS

        WebElement epostaKutusu= driver.findElement(By.id("email"));
        //burada WebElement interfacesi uzerinden findElement() methodunu kullanarak locator'imizi olusturduk








    }
}