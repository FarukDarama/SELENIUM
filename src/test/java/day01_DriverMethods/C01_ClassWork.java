package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_ClassWork {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/imac/IdeaProjects/SeleniumNewProject/src/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        //     Yeni bir package olusturalim : day01
        //     Yeni bir class olusturalim : C03_GetMethods
        //     Amazon sayfasina gidelim. https://www.amazon.com/
               driver.get("https://www.amazon.com");
        //     Sayfa basligini(title) yazdirin
               System.out.println(driver.getTitle());
        //     Sayfa basliginin “Amazon” icerdigini test edin
               String actualTitle= driver.getTitle();
               if(actualTitle.contains("Amazon")){
                   System.out.println("Title testi PASSED");
               }else System.out.println("Title testi FAILED");
        //     Sayfa adresini(url) yazdirin
               System.out.println(driver.getCurrentUrl());
        //     Sayfa url’inin “amazon” icerdigini test edin.
               String actualUrl = driver.getCurrentUrl();
               if (actualUrl.contains("amazon")){
                   System.out.println("Url testi PASSED");
               }else  System.out.println("Url testi FAILD");
        //     Sayfa handle degerini yazdirin
               System.out.println(driver.getWindowHandle());
        //     Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
               String sayfaKodları = driver.getPageSource();
               if (sayfaKodları.contains("Gateway")){
                   System.out.println("Soruce Code Testi PASSED");
               }else System.out.println("Soruce Code Testi FAILD");
        //     Sayfayi kapatin.
               driver.close(); // sayfayı kapatmak için  close() methodu kullanılır




    }
}
