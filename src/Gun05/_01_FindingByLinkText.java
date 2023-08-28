package Gun05;

import Utility.Myfunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _07_FindingByLinkText {

    //    id -> By.Id()
//    name -> By.name
//    class -> By.class
//
//    linkText ile partialLinkText  SADECE a taglerinde çalışır

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://hepsiburada.com");

        //linkText
        WebElement siparislerimLinki=driver.findElement(By.linkText("Siparişlerim"));
        System.out.println("siparislerimLinki.getText() = " + siparislerimLinki.getText());

        //partiaLinkText
        WebElement link2=driver.findElement(By.partialLinkText("Sü"));
        System.out.println("link2.getText() = " + link2.getText());

        System.out.println("siparislerimLinki = " + siparislerimLinki.getAttribute("href"));
        System.out.println("siparislerimLinki = " + siparislerimLinki.getAttribute("title"));
        System.out.println("siparislerimLinki = " + siparislerimLinki.getAttribute("rel"));



        Myfunc.wait(3);
        driver.quit();
        
    }
}
