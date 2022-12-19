package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_DriverMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/imac/IdeaProjects/SeleniumNewProject/src/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();//Bos bir browser actık
        driver.get("https://www.amazon.com");//ilk olarak gitmak istediğimiz sayfayı belirtiriz
        System.out.println(driver.getTitle());
        System.out.println("sayfa url'si: "+driver.getCurrentUrl());//sayfa url sini almak için kullanılır
        // System.out.println(driver.getPageSource());
        System.out.println(driver.getWindowHandle());//Bize o window a ait hash degerini verir.Biz bu hash degerlerini
                                                     //bir stringe atayıp pencereler arası gecis yapabiliriz.
        driver.close();

    }
}
