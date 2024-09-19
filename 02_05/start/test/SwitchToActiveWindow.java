import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Documents/Rominet/Selenium/chromedriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement switchTabButton = driver.findElement(By.id("new-tab-button"));
        switchTabButton.click();

        String originalHandle = driver.getWindowHandle();

        for(String handle1: driver.getWindowHandles()) {
                driver.switchTo().window(handle1);
        }
        Thread.sleep(1000);
        driver.switchTo().window(originalHandle);
        Thread.sleep(1000);
        WebElement alertButton = driver.findElement(By.id("alert-button"));
        alertButton.click();
        Thread.sleep(1000);
        Alert alert = driver.switchTo().alert();
        alert.accept();


        driver.quit();
    }
}
