package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {

    public static void main(String[] args) {

        System.setProperty("web.driver.chrome.driver","/Users/imac/IdeaProjects/SeleniumNewProject/src/resources/drivers/chromedriver");
        /*
        En temel hali ile otomasyon yapmak ıcın Clasımıza otomasyon ıcın gerekli olan webdriver'in yerinigostermemiz gerekir.
        Bunun ıcın java kutuphanesınden System.setProperty() methodunun ıcıne ilk olarak driver yazarız ikini olarak driverin fiziki
        yolunu kopyalarız.
         */
        WebDriver driver = new ChromeDriver();
        driver.get("https://techproeducation.com/");
        driver.close();


    }
}
