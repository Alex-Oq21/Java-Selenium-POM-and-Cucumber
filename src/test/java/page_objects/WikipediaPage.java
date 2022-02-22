package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WikipediaPage extends BasePage{
    By article_title = By.xpath("//*[@id=\"Artículo_bueno\"]");
    public WikipediaPage(WebDriver driver) {
        super(driver);
    }

    public String get_Articulo_Bueno_Title(){
        return driver.findElement(article_title).getAttribute("title");
    }
}
