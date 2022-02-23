package steps;

import gherkin.ast.Step;
import io.cucumber.java8.En;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import page_objects.GooglePage;
import page_objects.GoogleSearchResultPage;
import page_objects.WikipediaPage;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class StepsGoogleWikipedia implements En {
      WebDriver driver;
    public StepsGoogleWikipedia(){

        Before(() -> {
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("https://www.google.com");
        });

        Given("We are on Google page",() ->{
            GooglePage googlePage = new GooglePage(driver);

        });

        When("We search Wikipedia and select the first result",() -> {
            GooglePage googlePage = new GooglePage(driver);
            googlePage.Search_Something("Wikipedia");
            assertEquals("wikipedia - Buscar con Google", driver.getTitle());

            GoogleSearchResultPage googleSearchResultPage = new GoogleSearchResultPage(driver);
            //Selecting the first option
            googleSearchResultPage.select_The_First_Result();
        });

        Then("The title of the article is {string}",(String text) ->{
            WikipediaPage wikipediaPage = new WikipediaPage(driver);
            String articleTitle = wikipediaPage.get_Articulo_Bueno_Title();
            assertEquals(text, articleTitle);
        });
        After(() ->{
            driver.quit();
        });
    }
}
