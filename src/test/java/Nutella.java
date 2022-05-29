import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nutella {
        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.navigate().to("https://www.amazon.com");
            WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
            //<input type="text" id="twotabsearchtextbox" value="" name="field-keywords" autocomplete="off" placeholder="" class="nav-input nav-progressive-attribute" dir="auto" tabindex="0" aria-label="Search">
            searchBox.sendKeys("nutella");
            searchBox.submit();
            searchBox = driver.findElement(By.className("s-image"));
            //<img class="s-image" src="https://m.media-amazon.com/images/I/71MtunH6gKL._AC_UL320_.jpg" srcset="https://m.media-amazon.com/images/I/71MtunH6gKL._AC_UL320_.jpg 1x, https://m.media-amazon.com/images/I/71MtunH6gKL._AC_UL480_FMwebp_QL65_.jpg 1.5x, https://m.media-amazon.com/images/I/71MtunH6gKL._AC_UL640_FMwebp_QL65_.jpg 2x, https://m.media-amazon.com/images/I/71MtunH6gKL._AC_UL800_FMwebp_QL65_.jpg 2.5x, https://m.media-amazon.com/images/I/71MtunH6gKL._AC_UL960_FMwebp_QL65_.jpg 3x" alt="Nutella Chocolate Hazelnut Spread, Perfect Topping for Easter Treats, 35.2 oz Jar" data-image-index="1" data-image-load="" data-image-latency="s-product-image" data-image-source-density="1">
            searchBox.click();
            searchBox = driver.findElement(By.name("submit.add-to-registry.wishlist.unrecognized"));
            //<a href="https://www.amazon.com/ap/signin?openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fgp%2Faw%2Fd%2FB008IGB0QQ&amp;openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&amp;openid.assoc_handle=usflex&amp;openid.mode=checkid_setup&amp;openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&amp;openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&amp;" name="submit.add-to-registry.wishlist.unrecognized" title="Add to List" data-hover="<!-- If PartialItemStateWeblab is true then, showing different Add-to-wish-list tool-tip message which is consistent with Add-to-Cart tool tip message.  -->
            //       To Add to Your List, choose from options to the left" class="a-button-text a-text-left"> Add to List </a>
            searchBox.click();
            Thread.sleep(5000);
            driver.close();
        }
    }
