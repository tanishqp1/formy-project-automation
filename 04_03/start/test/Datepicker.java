import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Datepicker {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/tanishqpatil/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");

        //Thread.sleep(1000);

        WebElement dateField = driver.findElement(By.id("datepicker"));
        dateField.sendKeys("11/13/1999");
        dateField.sendKeys(Keys.RETURN);

        /*Thread.sleep(1000);

        dateField.click();
        WebElement datePicker = driver.findElement(By.cssSelector("td[data-date='1632009600000']"));
        datePicker.click();

        Thread.sleep(1000);*/

        driver.quit();
    }
}