package day02_DriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class C04_ClassWork {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/imac/IdeaProjects/SeleniumNewProject/src/resources/drivers/chromedriver");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
        //a.web sayfasına gidin. https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        //Search(ara) “city bike”
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("city bike", Keys.ENTER);
        //Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        List<WebElement> aramaSonucYazısı = driver.findElements(By.className("a-section a-spacing-small a-spacing-top-small"));
        System.out.println("arama sonuc yazısı: "+aramaSonucYazısı.get(0).getText());
        //Arama sonuc sayısını konsola yazdrın
        String sonucSayisi[]=aramaSonucYazısı.get(0).getText().split(" ");
        System.out.println(sonucSayisi[2]);//Aranan sayıyı verir
        //Sonuc sayısını lamda ile yazdırın
        Arrays.stream(aramaSonucYazısı.get(0).getText().split(" ")).limit(3).skip(2).forEach(System.out::println);
        //Sonra karşınıza çıkan ilk sonucun resmine tıklayın
        List<WebElement> ilkWE =driver.findElements(By.className("s-image"));
        ilkWE.get(0).click();





    }
}
