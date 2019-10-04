import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {

    private static final String driver = "webdriver.chrome.driver";
    private static final String path = "C:\\Users\\GS65\\Documents\\Programming\\Library and Driver\\Driver2\\76.126\\chromedriver.exe";

    public static void main(String[] args) {

        System.setProperty(driver, path);

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("window-size=1920,1080");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https:www.google.com");
        System.out.println(driver.getTitle());
        driver.findElement(By.name("q")).sendKeys("Automation");
        driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);

        driver.close();
        driver.quit();
        System.out.println("Completed");
        System.out.println("Test");
        //Test Comment
        //GitHub

    }

}
