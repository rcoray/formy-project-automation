import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Key;

public class Form {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Documents/Rominet/Selenium/chromedriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        driver.findElement(By.id("first-name")).sendKeys("Barbarbara");

        driver.findElement(By.id("last-name")).sendKeys("Mc Barbarbarbarasdottir");

        driver.findElement(By.id("job-title")).sendKeys("CEO of BAR & Sons");

        driver.findElement(By.id("radio-button-3")).click();

        driver.findElement(By.id("checkbox-2")).click();

        driver.findElement(By.id("checkbox-3")).click();

        driver.findElement(By.id("select-menu")).click();

        driver.findElement(By.cssSelector("option[value='3']")).click();

        driver.findElement(By.id("datepicker")).sendKeys("06/06/2025");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);

        Thread.sleep(1000);
        WebElement submitButton = driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary"));
        Actions actions = new Actions(driver);
        actions.moveToElement(submitButton);
        submitButton.click();
        Thread.sleep(1000);

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement alert = wait.until((ExpectedConditions.visibilityOfElementLocated(By.className("alert"))));
        String alertText = alert.getText();
        assertEquals("The form was successfully submitted!");
        driver.quit();
    }
}
