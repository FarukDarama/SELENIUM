package day03_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_CssSelector {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/imac/IdeaProjects/SeleniumNewProject/src/resources/drivers/chromedriver");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
        //1-C01_TekrarTesti isimli bir class olusturun
        //2- https://www.amazon.com/ adresine gidin
             driver.get("https://www.amazon.com/");
        //3- Browseri tam sayfa yapin
        //4- Sayfayi “refresh” yapin
        driver.navigate().refresh();
        //5 Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String baslık = driver.getTitle();
        if (baslık.contains("Spend less")){
            System.out.println("Baslık Tesi PASSED");
        }else{
            System.out.println("Baslık Testi FAİLED");
        }
        //6 Gift Cards sekmesine basin
        driver.findElement(By.cssSelector("a[href='/gp/browse.html?node=16594144031&ref_=nav_cs_gc_T2']")).click();
        //7 Birthday butonuna basin
        driver.findElement(By.cssSelector("img[alt='Birthday']")).click();
        //8 Best Seller bolumunden ilk urunu tiklayin
        List<WebElement> bestSeller8 = driver.findElements(By.cssSelector("img[alt='Amazon.com eGift Card']"));
        bestSeller8.get(0).click();
        //9- Gift card details’den 25 $’i secin
        driver.findElement(By.cssSelector("span[id='a-autoid-28']")).click();
        //10-Urun ucretinin 25$ oldugunu test edin
        WebElement urunUcreti = driver.findElement(By.cssSelector("span[id='gc-live-preview-amount']"));
        if (urunUcreti.getText().equals("$25.00")) {
            System.out.println("Test PASSED");
        } else System.out.println("Test FAILED");
        //10-Sayfayi kapatin
        driver.close();










}
}
