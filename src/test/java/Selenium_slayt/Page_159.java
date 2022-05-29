package Selenium_slayt;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBaseClass;

import java.util.List;

public class Page_159 extends TestBaseClass {
//    Test01 :
//1- amazon gidin
//2- Arama kutusunun solundaki dropdown menuyu handle edip listesini ekrana yazdırın
//3- dropdown menude 40 eleman olduğunu doğrulayın
//    Test02:
//1- dropdown menuden elektronik bölümü seçin
//2- arama kutusuna iphone yazip aratin ve bulunan sonuç sayısını yazdırın
//3- sonuc sayisi bildiren yazinin iphone icerdigini test edin
//4- ikinci ürüne relative locater kullanarak tıklayin
//5- ürünün title'ni ve fiyatını variable’a assign edip ürünü sepete ekleyelim
//    Test03:
//1- yeni bir sekme açarak amazon anasayfaya gidin
//2-dropdown’dan bebek bölümüne secin
//3-bebek puset aratıp bulundan sonuç sayısını yazdırın
//4-sonuç yazsının puset içerdiğini test edin
//5-üçüncü ürüne relative locater kullanarak tıklayin
//6-title ve fiyat bilgilerini assign edelim ve ürünü sepete ekleyin
//    Test 4:
//1-sepetteki ürünlerle eklediğimiz ürünlerin ayni oldugunu isim ve fiyat olarak dogrulayin


    @Test
    public void test() {
        driver.get("https://www.amazon.com");
     WebElement ddm= driver.findElement(By.xpath("//select[@class='nav-search-dropdown searchSelect nav-progressive-attrubute nav-progressive-search-dropdown']"));
     Select select = new Select(ddm);
        List<WebElement>dropList=select.getOptions();
        for(WebElement each :dropList){
        System.out.print(each.getText()+" ");
        }
        Assert.assertEquals(dropList.size(),28);
        select.selectByVisibleText("Electronics");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone" + Keys.ENTER) ;
        String actualSonucYazisi = driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']")).getText();
        String expectedSonucYazisi = "iphone";
        Assert.assertTrue(actualSonucYazisi.contains(expectedSonucYazisi));
        WebElement ilkUrunResmi= driver.findElement(By.xpath("(//img[@class='s-image'])[1]"));
        WebElement ikinciUrunResmi= driver.findElement(RelativeLocator.with(By.tagName("img")).below(ilkUrunResmi));
        Actions action = new Actions(driver);
        action.click(ikinciUrunResmi).perform();
        System.out.println("Urun title :" + driver.findElement(By.xpath("//span[@class='a-size-large product-title-word-break']")).getText());
        driver.findElement(By.xpath("//a[@title='Add to List']")).click(); //Ürünü List'e ekle.
    }
}
