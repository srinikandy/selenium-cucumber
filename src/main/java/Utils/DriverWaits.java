package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class DriverWaits {
    private WebDriver driver = DriverManager.getCurrentDriver();

    public void staticWait(int seconds) throws InterruptedException {
        Thread.sleep(seconds);
    }

    public void implicitWait(int time){
        driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
    }

    public void explicitWait(int time,WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void fluentWait(int time, WebElement element) {
        Wait<WebDriver> fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(time))
                .pollingEvery(Duration.ofSeconds(time))
                .ignoring(NoSuchElementException.class);
        fluentWait.until(ExpectedConditions.visibilityOf(element));
    }
}
