package day02_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Examples {
    public static void main(String[] args) {
    /*

 */
        System.setProperty("webdriver.chrome.driver","/Users/imac/IdeaProjects/SeleniumNewProject/src/resources/drivers/chromedriver");
        WebDriver driver =new ChromeDriver();

        //    1)Browser'ı maximize yapalım
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //    2)tüm sayfa için max. bekleme süresi olarak 15 sn. belirleyelim
        //    3)Sırasıyla Amazon facebook ve youtube sayfalarına gidelim
        driver.get("https://www.amazon.com");
        driver.get("https://www.facebook.com");
        driver.get("https://www.youtube.com");
        //    4)Amazon Sayfasına tekrar dönelim
        driver.navigate().back();
        driver.navigate().back();
        //    5)Amazon sayfasının Url'nin https://www.amazon.com adresine eşit olduğunu test edelim
        String actualUrl =driver.getCurrentUrl();
        String expectedUrl= "https://www.amazon.com";
        if (actualUrl.equals(expectedUrl)){
            System.out.println("URL test PASSED");
        }else System.out.println("URL test FAILED");
        //    6)Sayfanın konumunu ve size'ini yazdıralım
        System.out.println("size: "+driver.manage().window().getSize());
        System.out.println("position: "+driver.manage().window().getPosition());
        //    7)Sayfanın konumunu ve size'ını istedgimiz sekılde ayarlayalım ve istedgigimiz sekilde oldugunu test edelim
        driver.manage().window().setSize(new Dimension(600,600));
        driver.manage().window().setPosition(new Point(50,50));
        System.out.println("yeni size: "+driver.manage().window().getSize());
        System.out.println("yeni position: "+driver.manage().window().getPosition());
        //    7)Sayfayı kapatalım
        driver.close();



    }
}
