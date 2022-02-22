package page_objects;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GooglePage extends BasePage {
    By searchPage =  By.name("q");
    public GooglePage(WebDriver driver) {
        super(driver);
    }

    public void Search_Somenthing(){
        WebElement search = driver.findElement(searchPage);
        search.sendKeys("Wikipedia");
        search.sendKeys(Keys.ENTER);

    }
}
