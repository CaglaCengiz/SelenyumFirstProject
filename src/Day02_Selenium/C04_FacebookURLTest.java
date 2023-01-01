package Day02_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_FacebookURLTest {
    public static void main(String[] args) {

        // Invoke Chrome Driver
        // Navigate to Facebook homepage URL: https://www.facebook.com/
        // Verify expected equals actual URL.
        // Verify expected title contains Facebook Word.


        System.setProperty("webdriver.chrome.driver","Dependencies\\drivers\\chromedriver.exe");

        //driver objemizi olusturduk
        WebDriver driver = new ChromeDriver();

        //https://www.facebook.com/ sitesini ziyaret ettik
        driver.get("https://www.facebook.com/");

        //URL testimizi yaptik
        System.out.println("URL testi yapiliyor...");
        String expectedUrl = "https://www.facebook.com/";
        String actualUrl = driver.getCurrentUrl();

        if (expectedUrl.equals(actualUrl)){
            System.out.println("URL testi PASSED");
        }else{
            System.out.println("URL testi FAILED");
        }

        //Title testimizi yaptik

        String actualTitle = driver.getTitle();

        if (actualTitle.contains("Facebook")){
            System.out.println("Title testi PASSED");
        }else{
            System.out.println("Title testi FAILED");
        }

        // driver i kapattik
        driver.quit();

    }
}
