package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_ManageMethods {
    public static void main(String[] args) throws InterruptedException {
        //Amazon soyfasina gidelim. https://www.amazon.com/
        //Sayfanin konumunu ve boyutlarini yazdirin
        //Sayfayi simge durumuna getirin
        //simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        //Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        //Sayfayi fullscreen yapin
        //Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        //Sayfayi kapatin
        System.setProperty("webdriver.chrome.driver","/Users/imac/IdeaProjects/SeleniumNewProject/src/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        System.out.println("sayfanın konumu: "+driver.manage().window().getPosition());
        System.out.println("sayfanın boyutlar:" +driver.manage().window().getSize());
        driver.manage().window().minimize();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        System.out.println("sayfanın konumu: "+driver.manage().window().getPosition());
        System.out.println("sayfanın boyutlar:" +driver.manage().window().getSize());
        Thread.sleep(3000);
        driver.manage().window().fullscreen();
        System.out.println("sayfanın konumu: "+driver.manage().window().getPosition());
        System.out.println("sayfanın boyutlar:" +driver.manage().window().getSize());
        driver.close();


    }
}
