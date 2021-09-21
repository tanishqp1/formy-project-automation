import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/tanishqpatil/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropDownMenu = driver.findElement(By.id("dropdownMenuButton"));
        dropDownMenu.click();

        Thread.sleep(1000);

        WebElement autocompleteItem = driver.findElement(By.id("autocomplete"));
        autocompleteItem.click();

        Thread.sleep(1000);

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropDownMenu1 = driver.findElement(By.id("dropdownMenuButton"));
        dropDownMenu1.click();

        Thread.sleep(1000);

        WebElement checkBoxItem = driver.findElement(By.linkText("Checkbox"));
        checkBoxItem.click();

        Thread.sleep(1000);

        driver.quit();
    }
}
