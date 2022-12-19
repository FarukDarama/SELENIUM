package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_NavigateMethod {
    public static void main(String[] args) throws InterruptedException {

    System.setProperty("webdriver.chrome.driver","/Users/imac/IdeaProjects/SeleniumNewProject/src/resources/drivers/chromedriver");
    WebDriver driver = new ChromeDriver();
    //Amazon sayfasına gidelim
       // driver.navigate().to("https://amazon.com");
        driver.get("https://amazon.com");//get ilede gidilir navigate ile de gidilir
    //Techpro sayfasına gidelim
         Thread.sleep(3000);
        //driver.navigate().to("https://techproeducation.com");
        driver.get("https://techproeducation.com");
    //Tekrar amazon sayfasına donelim
        Thread.sleep(3000);
        driver.navigate().back();
    //Tekrar hepsiburada  sayfasına gidelim
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
    //Son sayfada sayfayı yenileyelim
        driver.navigate().refresh();
    //Sayfayı kapatalım
        driver.close();











    }
}
