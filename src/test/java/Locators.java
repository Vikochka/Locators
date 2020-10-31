import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

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

        By attribute = By.cssSelector("meta[name~='data-layer']");

        By attributeTilda = By.cssSelector("meta[name|='data-layer']");

        By attributeSuf = By.cssSelector("meta[name^='data-layer']");

        By attributeStar = By.cssSelector("meta[name*='data-layer']");

        By attributeDol = By.cssSelector("meta[name$='data-layer']");

        By Locator = By.cssSelector("div.layout");

        By Locator_2 = By.cssSelector("div span");

        By complexLocator = By.cssSelector("div.container span.glyphicon");

        By atributeLocator = By.cssSelector("meta[l]");


        ChromeDriver driver = new ChromeDriver();
        driver.get(URL);

        driver.findElement(singleClassNameLocator);
        driver.findElement(directDescendantLocator);
        driver.findElement(attribute);
        driver.findElement(complexLocator);

        driver.quit();
    }

//    @Test
//    public void xpathSelectorTest(){
//
//    }
}

