import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Datepicker {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Documents/Rominet/Selenium/chromedriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");

        WebElement datePicker = driver.findElement(By.id("datepicker"));
        datePicker.click();
        Thread.sleep(200);



//        datePicker.sendKeys("06/06/2025");
//        datePicker.sendKeys(Keys.RETURN);
//        Thread.sleep(1000);



        driver.quit();
    }
}