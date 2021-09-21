import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToAlert {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/tanishqpatil/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement alertButton = driver.findElement(By.id("alert-button"));
        //Thread.sleep(1000);
        alertButton.click();
        //Thread.sleep(1000);

        Alert alert = driver.switchTo().alert();
        //Thread.sleep(1000);
        alert.accept();
        //Thread.sleep(1000);

        driver.quit();
    }
}
