package Tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page_objects.GooglePage;
import page_objects.GoogleSearchResultPage;
import page_objects.WikipediaPage;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMain {
    WebDriver driver;
    @BeforeEach
    public void beforeScenario(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://www.google.com");
    }

    @Test
    public void testA(){
        //
        GooglePage googlePage = new GooglePage(driver);
        //Write in the google input the page to search
        googlePage.Search_Something("Wikipedia");
        //Verify the title of the result when the searching is done.
        assertEquals("Wikipedia - Buscar con Google", driver.getTitle());
        //------------------------------------------------

        GoogleSearchResultPage googleSearchResultPage = new GoogleSearchResultPage(driver);
        //Select the first result of our searching
        googleSearchResultPage.select_The_First_Result();

        //----------------------------------------------------
        //Lets compare the title of the Articulo Bueno.
        WikipediaPage wikipediaPage = new WikipediaPage(driver);

        String titleArticuloBueno = wikipediaPage.get_Articulo_Bueno_Title();

        assertEquals("Stephen Jay Gould",titleArticuloBueno);
    }



    @AfterEach
    public void afterScenario(){
        driver.quit();
    }

}
