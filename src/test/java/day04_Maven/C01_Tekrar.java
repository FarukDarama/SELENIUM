package day04_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Tekrar {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/imac/IdeaProjects/SeleniumNewProject/src/resources/drivers/chromedriver");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));










    }
}
