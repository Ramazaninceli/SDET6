package Gun11;

import Utility.BaseDriver;
import Utility.Myfunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _04_WindowsGiris extends BaseDriver {
    @Test
    public void Test1(){

        driver.get("https://www.selenium.dev/");
        
      List<WebElement> linkler= driver.findElements(By.cssSelector(" a[target='_blank']"));

        for (int i=1; i<linkler.size();i++ ) {
            Myfunc.wait(5);
                        linkler.get(i).click();
        }
        


        //BekleVeKapat();
    }
}
