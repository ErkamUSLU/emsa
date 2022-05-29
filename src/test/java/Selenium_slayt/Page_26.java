package Selenium_slayt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_26 {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com/");
        driver.get("https://www.amazon.com");
        driver.get("https://www.youtube.com");
        driver.get("https://www.amazon.com");
        driver.navigate().refresh();
        driver.close();
    }
}