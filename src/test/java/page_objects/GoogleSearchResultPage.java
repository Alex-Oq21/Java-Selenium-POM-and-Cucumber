package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchResultPage extends BasePage{
    By firstResult = By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div[1]/a");

    public GoogleSearchResultPage(WebDriver driver) {
        super(driver);
    }

    public void select_The_First_Result(){
         driver.findElement(firstResult).click();

    }
}
