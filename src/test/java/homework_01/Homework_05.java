package homework_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Homework_05 {
    public static void main(String[] args) {
         ////1. "https://www.saucedemo.com" Adresine gidin
        System.setProperty("webdriver.chrome.driver","/Users/imac/IdeaProjects/SeleniumNewProject/src/resources/drivers/chromedriver");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
        driver.get("https://www.saucedemo.com");
        ////2. Username kutusuna "standard_user" yazdirin
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        ////3. Password kutusuna "secret_sauce" yazdirin
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("secret_sauce");
        ////4. Login tusuna basin
        driver.findElement(By.id("login-button")).click();
        ////5. Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
        WebElement urunIsmi=driver.findElement(By.xpath("//*[text()='Sauce Labs Backpack']"));
        String urunAdi = urunIsmi.getText();
        urunIsmi.click();
        ////6. Add to Cart butonuna basin
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        ////7. Alisveris sepetine tiklayin
        driver.findElement(By.xpath("//span")).click();
        ////8. Sectiginiz urunun basarili olarak sepete eklendigini control edin
        WebElement actuelurunismi=driver.findElement(By.xpath("//*[text()='Sauce Labs Backpack']"));
        String sonuc= actuelurunismi.getText().equals(urunAdi) ? "test passed": "test failed";
        System.out.println("sonuc = " + sonuc);
        ////9. Sayfayi kapatin
        driver.close();









    }
}
