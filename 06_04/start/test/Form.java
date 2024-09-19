import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Documents/Rominet/Selenium/chromedriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        FormPage formPage = new FormPage();
        FormPage.submitForm(driver);

        ConfirmationPage confPage = new ConfirmationPage();
        confPage.waitForAlertBanner(driver);

        assertEquals("The form was successfully submitted!", confPage.getAlertBannerText(driver));

        driver.quit();
    }
}
