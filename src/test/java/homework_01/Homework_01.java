package homework_01;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Homework_01 {
    public static void main(String[] args) throws InterruptedException {
        //1.Soru
        System.setProperty("webdriver.chrome.driver","/Users/imac/IdeaProjects/SeleniumNewProject/src/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       // driver.get("https://www.youtube.com/");
        //Youtube ana sayfasina gidelim . https://www.youtube.com/
        driver.navigate().to("https://www.youtube.com/");
        //Amazon soyfasina gidelim. https://www.amazon.com/
       Thread.sleep(3000);
        driver.get("https://www.amazon.com/");
        //Tekrar YouTube'sayfasina donelim
        driver.navigate().back();//youtube geri dondu
        //Yeniden Amazon sayfasina gidelim
        Thread.sleep(3000);
        driver.navigate().forward();//amazona gittik
        //Sayfayi Refresh(yenile) yapalim
        Thread.sleep(3000);
         driver.navigate().refresh();
        //Sayfayi kapatalim / Tum sayfalari kapatalim
        driver.close();
       //2.Soru
        //Amazon soyfasina gidelim. https://www.amazon.com/
       // driver.get("https://www.amazon.com/");
        //Sayfanin konumunu ve boyutlarini yazdirin
       // System.out.println("pozisyonu 1: "+driver.manage().window().getPosition());
        //System.out.println("size 1: "+driver.manage().window().getSize());
        //Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin        hnhjmnjöm ömjnkjnm
       // driver.manage().window().setPosition(new Point(80,0));
        //driver.manage().window().setSize(new Dimension(800,600));
        //Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        //System.out.println("pozisyonu 2: "+driver.manage().window().getPosition());
        //System.out.println("size 2: "+driver.manage().window().getSize());
        //Sayfayi kapatin
         // driver.close();
       // System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        //        WebDriver driver = new ChromeDriver();
        //        driver.manage().window().maximize();
        //        //  ODEV
        //        //Amazon soyfasina gidelim. https://www.amazon.com/
        //        driver.get("https://www.amazon.com");
        //Sayfanin konumunu ve boyutlarini yazdirin
        //Thread.sleep(3000);
        //        System.out.println("Sayfanin Konumu = " + driver.manage().window().getPosition());
        //        System.out.println("Sayfanin Boyutu = " + driver.manage().window().getSize());
        //        //Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        //        Thread.sleep(3000);
        //
        //        Point p = new Point(0,100);
        //        driver.manage().window().setPosition(p);
        //        Dimension d = new Dimension(800,600);
        //        driver.manage().window().setSize(d);
        //        //Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        //
        //        if(p.x==0 && p.y==100){
        //            System.out.println("Konum Testi PASSED");
        //        }else{
        //            System.out.println("Konum Testi FAILED");
        //        }
        //        if(d.width==0 && d.height==100){
        //            System.out.println("Boyut Testi PASSED");
        //        }else {
        //            System.out.println("Boyut Testi FAILED");
        //        }
        //        System.out.println(driver.manage().window().getPosition());
        //        System.out.println(driver.manage().window().getSize());
        //        //Sayfayi kapatin
        //        driver.close();

    }



    }


