package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_ClassWork2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/imac/IdeaProjects/SeleniumNewProject/src/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();//Bos bir browser actık
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//Bu method sayfadaki herbir web element icin
        //max.bekleme suresini belirler

        //ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
        //oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        driver.get("https://facebook.com");
        String actuelTitle = driver.getTitle();
        if (actuelTitle.contains("facebook")){
            System.out.println("Title testi Passed");
        }else System.out.println("Title testi Failed"+actuelTitle);

        //Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
        //yazdirin.
        String actuelUrl = driver.getCurrentUrl();
        if (actuelUrl.contains("facebook")){
            System.out.println("Url testi Passed");
        }else System.out.println("Url testi Failed");
        //https://www.walmart.com/ sayfasina gidin.
        driver.get("//https://www.walmart.com/ ");
        //Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String actualWallmartTitle= driver.getTitle();
        String expectedWallmartTitle ="Walmart.com";
        if (actualWallmartTitle.contains(expectedWallmartTitle)){
            System.out.println("Title testi Passed");
        }else System.out.println("Title testi Failed");
        //Tekrar “facebook” sayfasina donun
        driver.navigate().back();
        //Sayfayi yenileyin
        driver.navigate().refresh();
        //Sayfayi tam sayfa (maximize) yapin  9.Browser’i kapatin
        driver.close();


    }
}
