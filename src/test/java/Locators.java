import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Locators {


    private static String URL = "https://dev.by";

    @Test
    public void idTest() {
        By ageLocator = By.id("adfox_158272444883353136");

        ChromeDriver driver = new ChromeDriver();
        driver.get(URL);

        driver.findElement(ageLocator);

        driver.quit();
    }

    @Test
    public void nameTest() {

        By siteSearchLocator = By.name("viewport");

        ChromeDriver driver = new ChromeDriver();
        driver.get(URL);

        driver.findElement(siteSearchLocator);

        driver.quit();
    }


    @Test
    public void cssSelectorTest() {
        By singleClassNameLocator = By.cssSelector(".no-touch");

        By directDescendantLocator = By.cssSelector("div > header");

        By attributeEqualLocator = By.cssSelector("meta[name='data-layer']");

        By Locator = By.cssSelector("div.layout");

        By Locator_2 = By.cssSelector("div span");

        By complexLocator = By.cssSelector("div.container span.glyphicon");

        ChromeDriver driver = new ChromeDriver();
        driver.get(URL);

        driver.findElement(singleClassNameLocator);
        driver.findElement(directDescendantLocator);
        driver.findElement(attributeEqualLocator);
        driver.findElement(complexLocator);

        driver.quit();
    }

//    @Test
//    public void xpathSelectorTest(){
//
//    }
}

