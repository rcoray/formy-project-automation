import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Radiobuttons {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Documents/Rominet/Selenium/chromedriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/radiobutton");

        WebElement radioButton2 = driver.findElement(By.cssSelector("input[value='option2']"));
        radioButton2.click();
        Thread.sleep(1000);

        WebElement radioButton1 = driver.findElement(By.id("radio-button-1"));
        radioButton1.click();
        Thread.sleep(1000);

        WebElement radioButton3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
        radioButton3.click();
        Thread.sleep(1000);

        driver.get("https://formy-project.herokuapp.com/checkbox");

        WebElement cbx1 = driver.findElement(By.id("checkbox-1"));
        WebElement cbx2 = driver.findElement(By.cssSelector("input[value='checkbox-2']"));
        WebElement cbx3 = driver.findElement(By.xpath("//*[@id=\"checkbox-3\"]"));
        cbx1.click();
        Thread.sleep(1000);

        cbx2.click();
        cbx1.click();
        Thread.sleep(1000);

        cbx3.click();
        cbx2.click();
        Thread.sleep(1000);

        cbx1.click();
        cbx2.click();
        Thread.sleep(1000);

        cbx1.click();
        cbx2.click();
        cbx3.click();
        Thread.sleep(100);

        cbx1.click();
        cbx2.click();
        cbx3.click();
        Thread.sleep(300);

        cbx1.click();
        cbx2.click();
        cbx3.click();
        Thread.sleep(100);

        cbx1.click();
        cbx2.click();
        cbx3.click();
        Thread.sleep(300);

        driver.quit();
    }
}
