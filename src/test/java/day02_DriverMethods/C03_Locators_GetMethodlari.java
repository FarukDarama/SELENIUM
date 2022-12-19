package day02_DriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_Locators_GetMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/imac/IdeaProjects/SeleniumNewProject/src/resources/drivers/chromedriver");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
        //Amazon sayfasına gidelim
        driver.get("https://amazon.com");
        //Search bölümünü locate edip, iphone aratalım.
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone", Keys.ENTER);
        //Arama sonuc yazısında ıphone yazısını locate edip konsola yazdıralım konsola yazdıralım
        WebElement aramasonucYazisi = driver.findElement(By.className("sg-col-inner"));
        System.out.println("aramasonucYazisi = " + aramasonucYazisi.getText());

        //Sayfayı kapatalım.
        driver.close();









    }
}
