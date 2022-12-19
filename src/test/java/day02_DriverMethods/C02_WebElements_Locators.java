package day02_DriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_WebElements_Locators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/imac/IdeaProjects/SeleniumNewProject/src/resources/drivers/chromedriver");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
        //Amazon sayfasına gidelim
        driver.get("https://amazon.com");
        //Search bolumunu locate edelim
       // WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        WebElement aramaKutusu = driver.findElement(By.name("field-keywords"));
        //Search bölümünde Iphone aratalım
        aramaKutusu.sendKeys("Iphone", Keys.ENTER);

         /*
         Eger bir webelementi (Web sayfasindaki her bir buton ya da text/yazi) locate (konumunu belirleme)
         etmek istersek once manual olarak web sayfasini acip sayfa uzerinde sag click yapip incele/inspect butonuna tiklariz.
         Karsimiza cikan HTML code'larindan locator'lardan (konum belirleyiciler) unique (essiz) olani seceriz.
         Genellikle id Attribute'u kullanilir. Sectigimiz attribute degerini findElement() method'u icine
         findElement(BY.id("attribute degeri")) seklinde yazariz.
          */
          //Amazon sayfasındaki <input> ve <a> taglarının sayisini yazdırınız
        List<WebElement> inputTag = driver.findElements(By.tagName("input"));
        System.out.println("InputTag sayisi: " + inputTag.size());
        List<WebElement> linkList =driver.findElements(By.tagName("a"));
        System.out.println(linkList.size());
        for (WebElement w:linkList){
            System.out.println(w.getText());
        }


    }
}
