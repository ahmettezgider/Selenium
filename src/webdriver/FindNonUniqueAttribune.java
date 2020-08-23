package webdriver;

import org.openqa.selenium.WebDriver;


import static utils.Browsers.driverChrome;
import static utils.Utilities.elementsCount;

public class FindNonUniqueAttribune {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = driverChrome();

        driver.get("http://the-internet.herokuapp.com/");
        elementsCount(driver, "id");

        Thread.sleep(5000);

        driver.quit();

    }

}

