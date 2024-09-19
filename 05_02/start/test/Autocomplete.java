import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Autocomplete {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Documents/Rominet/Selenium/chromedriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        WebElement datepicker = driver.findElement(By.id("datepicker"));
        datepicker.click();

        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement calendardate = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='1726876800000'")));
        calendardate.click();
//        datepicker.sendKeys("1555 Park Blvd, Palo Alto, CA");



//        WebElement autocompleteResult = driver.findElement(By.className("pac-item"));
//        autocompleteResult.click();

        driver.quit();
    }
}
