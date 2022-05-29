import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;
import static org.openqa.selenium.By.xpath;

public class testOrnek {/*
            — İnstagram URL’ine gidilir.
            — Username girilir.
            — Username ile eşleşmeyen parola girilir.
            — Log In butonuna basılır.
            — Browser, test sonunda kapatılır.*/
    public  String loginUrl= "https://www.instagram.com/?hl=tr";
    WebDriver driver;
    @Before
    public void setUp() {

        try {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            driver.manage().deleteAllCookies();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void login() {

        try {

            driver.get(loginUrl);

            driver.findElement(xpath("//input[@name='username']")).sendKeys("testdenemesi");
            sleep(5000);

            driver.findElement(xpath("//input[@name='password']")).sendKeys("123456",Keys.ENTER);
            sleep(5000);

           // driver.findElement(xpath("//button[@type='submit']")).sendKeys(Keys.ENTER);

            driver.quit();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @After
    public void tearDown() throws Exception {

    }
}