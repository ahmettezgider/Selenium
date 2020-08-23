package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Utilities extends Browsers{

    //---------------------------------------------------------------------------
    // list of number of identical given attribute
    public static void elementsCount(WebDriver driver, String attribute){

        try {
            // WebElements list
            List<WebElement> elements = driver.findElements(By.cssSelector("*"));

            // list map'a dönüstürülüyor
            Map<String, Integer> tags = elements.stream()
                    .collect(Collectors.toMap(e -> e.getAttribute(attribute), w -> 1, Integer::sum));

            System.out.println("adet\tid");
            for (Map.Entry<String, Integer> e : tags.entrySet())
                if (e.getValue() != 1)
                    System.out.println(e.getValue() + "\t" + e.getKey());
        }catch (Exception e){
            e.printStackTrace();
        }

    }


    //---------------------------------------------------------------------------
    // click by Selenium
    public static void clickBySelenium(WebDriver driver, String cssSelector){
        (new Actions(driver))
                .moveToElement(driver.findElement(By.cssSelector(cssSelector)))
                .click()
                .build()
                .perform();
    }


    //---------------------------------------------------------------------------
    // click and return WebElement by Selenium
    public static WebElement clickAndReturnBySelenium(WebDriver driver, String cssSelector){
        WebElement element = driver.findElement(By.cssSelector(cssSelector));
        (new Actions(driver))
                .moveToElement(element)
                .click()
                .build()
                .perform();
        return element;
    }


    //---------------------------------------------------------------------------
    // click by JavaScript
    public static void clickByJs(WebDriver driver, String cssSelector){
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].click()", driver.findElement(By.cssSelector(cssSelector)));
    }


    //---------------------------------------------------------------------------
    // click and return WebElement by JavaScript
    public static WebElement clickAndReturnByJs(WebDriver driver, String cssSelector){
        WebElement element = driver.findElement(By.cssSelector(cssSelector));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].click()", element);
        return element;
    }

    //---------------------------------------------------------------------------
    // execute js by JavaScript
    public static void executeJs(WebDriver driver, String script){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(script);
    }

}
