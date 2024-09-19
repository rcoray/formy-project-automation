import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Documents/Rominet/Selenium/chromedriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropDownMenuButton = driver.findElement(By.id("dropdownMenuButton"));
        dropDownMenuButton.click();
        Thread.sleep(200);

        WebElement listItem = driver.findElement(By.id("autocomplete"));
        listItem.click();
        Thread.sleep(1000);

        driver.quit();
    }
}
