package Selenium_slayt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_28 {
    public static void main(String[] args) throws InterruptedException {


    System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");
        System.out.println("pencere olculeri : " + driver.manage().window().getSize());
        System.out.println("pencere konumu : " + driver.manage().window().getPosition());
        driver.manage().window().minimize();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        System.out.println("max pencere olculeri : "+driver.manage().window().getSize());
        System.out.println("max pencere konumu : "+driver.manage().window().getPosition() );
    }}
