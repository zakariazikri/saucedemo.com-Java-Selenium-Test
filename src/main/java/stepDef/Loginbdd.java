/*
package stepDef;

import config.env_target;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Loginbdd extends env_target {
    public Loginbdd() {
        Given("^User is in login page$", () -> {
            System.setProperty("webdriver.chrome.driver","src\\main\\resources\\drivers\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();

            driver.get(baseUrl);
            Duration duration = Duration.ofSeconds(10);
            WebDriverWait wait = new WebDriverWait(driver,duration);
            wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='submit'][@id='login-button']"))
            );
            throw new PendingException();
        });
        When("^User fill username and password$", () -> {
            driver.findElement(By.name("user-name")).sendKeys("standard_user");
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            throw new PendingException();
        });
        And("^User click login button$", () -> {
            driver.findElement(By.xpath("//input[@type='submit'][@id='login-button']")).click();
            throw new PendingException();
        });
        Then("^User verify login result$", () -> {
            wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='inventory_filter_container']"))
            );
            driver.quit();
            throw new PendingException();
        });
    }
}

 */
