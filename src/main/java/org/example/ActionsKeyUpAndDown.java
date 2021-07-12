package org.example;

import Utils.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsKeyUpAndDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverManager.getCurrentDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/droppable/");
        WebDriverWait wait = new WebDriverWait(driver,20);
        WebElement dropdown = wait.until(
                ExpectedConditions
                        .visibilityOfElementLocated(
                                By.xpath("//*[text()='Create targets for draggable elements.']")
                        ));
        var action = new Actions(driver);
        //Scroll to End
        action.keyUp(Keys.CONTROL).sendKeys(Keys.END).perform();
        Thread.sleep(3000);
        //Scroll to top
        action.keyUp(Keys.CONTROL).sendKeys(Keys.HOME).perform();
        Thread.sleep(3000);
        action.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(3000);
        driver.close();
    }
}
