package homework_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Homework_03 {
    public static void main(String[] args) {
       /*
       -Amazon sayfasına gidiniz
       -Arama kutusunu locate ediniz
       -Arama kutusunun tagName'inin input olduğunu test ediniz
       -Arama kutusunun name atributu'nun değerinin field-keywords olduğunu test ediniz
       -Sayfayı kapatınız
       */

        //1.Soru
        System.setProperty("webdriver.chrome.driver","/Users/imac/IdeaProjects/SeleniumNewProject/src/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com/");
        //Arama kutusunu locate ediniz
        driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));

        //-Arama kutusunun tagName'inin input olduğunu test ediniz
        String arama =driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).getTagName();
        if(arama.equals("input")){
            System.out.println("Test PASSED");
        }else{
            System.out.println("Test FAILED");
        }
        //-Arama kutusunun name atributu'nun değerinin field-keywords olduğunu test ediniz
        String attribute =driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).getAttribute("name");
        if(attribute.equals("field-keywords")){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }
        //  -Sayfayı kapatınız
        driver.close();







    }
}
