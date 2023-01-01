package Day02_Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_ManageWindowCommands {
    //        Invoke Chrome Browser
//        Open URL: https://www.google.com/
//        Maximize the window.
//        Print the position and size of the page.
//        Minimize the page.
//        Wait 5 seconds in the icon state and maximize the page.
//                Print the position and dimensions of the page in maximized state.
//        Make the page fullscreen.
//        Close the Browser.



    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Dependencies\\drivers\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.google.com");

        //sayfamızı maxmıze etmiş olduk
        driver.manage().window().maximize();

        //Browserın su ankı pozisyonunu verir
       Point point= driver.manage().window().getPosition();

       //pozısyonumuzun koordinant degerlerini degişkenlerimize atadık
      int posX= point.getX();
      int posY=point.getY();

        System.out.println("sayfanın x koordinatı:" +posX);
        System.out.println("sayfanın x koordinatı:" +posY);

        //Browser size ını (boyutunu)verir
        Dimension dimension= driver.manage().window().getSize();

        //Browser genıslık ve yukseklık degerlerini degişkenlerde tutacagız
         int h=driver.manage().window().getSize().getHeight();
         int w=driver.manage().window().getSize().getWidth();
        System.out.println(h);
        System.out.println(w);

        //browser mınımıze edıyoruz
        driver.manage().window().minimize();

        //5 sn beklıyoruz
        Thread.sleep(5000);

        //sayfamızı maxmıze ediyoruz
        driver.manage().window().maximize();

        //browsser ı fullscreen yaptık
        driver.manage().window().fullscreen();

        driver.quit();

    }
}
