package homework_01;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Homework_02 {

     public static void main(String[] args) {
         ////1-Test01 isimli bir class olusturun
         ////2- https://www.amazon.com/ adresine gidin
         ////3- Browseri tam sayfa yapin
         ////4-Sayfayi "refresh" yapin
         ////5-"Salesforce Apex Questions Bank" icin arama yapiniz
         ////6- Kac sonuc bulundugunu yaziniz
         ////7-Sayfayi kapatin
         System.setProperty("webdriver.chrome.driver","/Users/imac/IdeaProjects/SeleniumNewProject/src/resources/drivers/chromedriver");
         WebDriver driver =new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
         driver.get("https://www.amazon.com/");
         driver.manage().window().fullscreen();
         driver.navigate().refresh();
         driver.findElement(By.name("field-keywords")).sendKeys("Salesforce Apex Questions Bank", Keys.ENTER);
         WebElement aramasonucu= driver.findElement(By.className("sg-col-inner"));
         System.out.println(aramasonucu.getText());
         driver.close();
     }
}
