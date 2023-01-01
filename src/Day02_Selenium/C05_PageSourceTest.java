package Day02_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_PageSourceTest {
    public static void main(String[] args) {
        // Go to the Amazon URL: https://www.amazon.com/
        // Verify that it writes "Performance Metrics" and "MEOW" from the Source code.

        //driver objesini olusturduk
        System.setProperty("webdriver.chrome.driver","Dependencies/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        // amazon sitesini ziyaret ettik
        driver.get("https://www.amazon.com/");


        //page source u (kaynagi) aldik
        String pageSource = driver.getPageSource();


        //Page source testimizi yapiyoruz
        System.out.println("Page source testi yapiliyor...");

        System.out.println(pageSource);
        if (pageSource.contains("Performance Metrics") && pageSource.contains("MEOW")){
            System.out.println("Page source test PASSED");
        }else{
            System.out.println("Page source test FAILED");
        }

        //driver objemizi kapattik
        driver.quit();
    }
}
