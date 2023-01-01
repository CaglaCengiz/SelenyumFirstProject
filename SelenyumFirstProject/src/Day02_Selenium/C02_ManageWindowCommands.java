package Day02_Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class C02_ManageWindowCommands {
    public static void main(String[] args) throws InterruptedException {
        // Go to the Amazon URL : https://www.amazon.com/
        // Print the position and size of the page.
        // Adjust the position and size of the page as desired.
        // Test that the page is in the position and size you want.
       // Close the page.
        System.setProperty("webdriver.chrome.driver","Dependencies\\drivers\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        //amazon sıtesini ziyaret ettik
        driver.get("https://www.amazon.com");


        //driver pozısyonu ve boyutunu yazdırdık
        System.out.println("Browser in pozisyonu= " + driver.manage().window().getPosition());
        System.out.println("Browser in boyutu= " + driver.manage().window().getSize());
        Thread.sleep(5000);

        //browserin pozisyonunu(190,70)olarak set ettik
        driver.manage().window().setPosition(new Point(200,100));


        //browserın boyutunu (800,1000) set ettik
        driver.manage().window().setSize(new Dimension(800,1000));

        //browserin boyut dogruluyoruz
        int height=driver.manage().window().getSize().getHeight();
        int width=driver.manage().window().getSize().getWidth();
        System.out.println("height = " + height);
        System.out.println("width = " + width);

        System.out.println("browserin boyutu test ediliyor...");
        if (width==800 && height==1000){
            System.out.println("boyut testi PASSED");
        }else {
            System.out.println("boyut testi FAİLED");
        }
        //browser ın pozisyonunu dogruluyoruz
        int x=driver.manage().window().getPosition().getX();
        int y=driver.manage().window().getPosition().getY();
        System.out.println("browserin pozisyonu test ediliyor...");
        if (x==200 && y==100){
            System.out.println("pozisyon testi PASSED");
        }else {
            System.out.println("pozisyon testi FAİLED");
        }

        Thread.sleep(5000);
        driver.quit();
    }
}
