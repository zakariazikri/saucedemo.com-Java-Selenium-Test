import config.env_target;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Login extends env_target {
    @Test
    public void main(){
        System.setProperty("webdriver.chrome.driver","src\\main\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(baseUrl);
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver,duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='submit'][@id='login-button']"))
        );
        driver.findElement(By.name("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@type='submit'][@id='login-button']")).click();
        driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div/div[1]/div[3]/button")).click(); // Add To Card
        driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div[2]/a/span")).click(); //Cart
        driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[1]/div[3]/div[2]/div[1]")).click(); //item desc
        driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/a[2]")).click(); //Checkout
        driver.findElement(By.id("first-name")).sendKeys("Zikri");
        driver.findElement(By.id("last-name")).sendKeys("Salam");
        driver.findElement(By.id("postal-code")).sendKeys("17201");
        driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/form/div[2]/input")).click();
        driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/div[8]/a[2]")).click();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.className("complete-text"))
        );
        driver.quit();

    }
    @Test
    public void invalidUsername(){
        System.setProperty("webdriver.chrome.driver","src\\main\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(baseUrl);
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver,duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='submit'][@id='login-button']"))
        );
        driver.findElement(By.name("user-name")).sendKeys("standard_secret");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@type='submit'][@id='login-button']")).click();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='login_button_container']/div/form/h3/button"))
        );
        driver.quit();

    }
}
