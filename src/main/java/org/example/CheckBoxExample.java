package org.example;

import Utils.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBoxExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverManager.getCurrentDriver();
        driver.manage().window().maximize();
        driver.get("https://www.wellsfargo.com/");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(
                ExpectedConditions
                        .visibilityOfElementLocated(By.id("saveuid")));
        System.out.println(driver.findElement(By.xpath("(//*[@id='saveuid']/input)[1]")).getAttribute("Selected"));
        WebElement checkBox = driver.findElement(By.id("saveuid"));
        checkBox.click();
        Thread.sleep(3000);
        System.out.println(driver.findElement(By.xpath("(//*[@id='saveuid']/input)[1]")).getAttribute("Selected"));
        driver.quit();
    }
}
