import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01HelloSelenium {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "D:\\Users\\pc\\SeleniumDrivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https:\\www.google.com");
    }
}
