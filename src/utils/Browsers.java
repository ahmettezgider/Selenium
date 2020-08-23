package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Browsers {

    //---------------------------------------------------------------------------
    // chromeDriver
    public static WebDriver driverChrome(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

        return new ChromeDriver();

    }

    //---------------------------------------------------------------------------
    // firefoxDriver
    public static WebDriver driverFirefox(){
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");

        return new FirefoxDriver();

    }

    //---------------------------------------------------------------------------
    // ieDriver
    public static WebDriver driverIE(){
        System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");

        return new InternetExplorerDriver();

    }

    //---------------------------------------------------------------------------
    // edgeDriver
    public static WebDriver driverEdge(){
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");

        return new EdgeDriver();

    }

    //---------------------------------------------------------------------------
    // operaDriver
    public static WebDriver driverOpera(){
        System.setProperty("webdriver.opera.driver", "drivers/operadriver.exe");

        return new EdgeDriver();

    }


}

