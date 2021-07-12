package org.example;

import Utils.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class RadioButtonExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverManager.getCurrentDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        WebElement CreateNewAccount = driver.findElement
                (By.xpath("//*[@data-testid='open-registration-form-button']"));
        CreateNewAccount.click();

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(
                ExpectedConditions
                        .visibilityOfElementLocated(By.xpath("//input[@type='radio' and @value='1']")));
        WebElement radioFemale = driver.
                findElement(By.xpath("//input[@type='radio' and @value='1']"));

        if (radioFemale.getAttribute("selected") == null){
            radioFemale.click();
            System.out.println("clicked");
        }

        List<WebElement> radios = driver.findElements(By.xpath("//input[@type='radio']"));
        for(var radio:radios){
            if (radio.getAttribute("value").equalsIgnoreCase("2")
                    && radio.getAttribute("selected") == null
            ){
                radio.click();
                System.out.println("clicked");
            }
        }


//        WebElement radioMale = driver.
//                findElement(By.xpath("//input[@type='radio' and @value='2']"));
//        System.out.println(radioMale.getAttribute("selected"));

        driver.quit();
//        driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
//        Thread.sleep(3000);
//        WebElement radioFemale= driver.findElement(By.xpath("//input[@type='radio' and @value='1']"));
//        radioFemale.click();
//        Thread.sleep(3000);
//        System.out.println(radioFemale.getAttribute("selected"));
//        WebElement radioMale= driver.findElement(By.xpath("//input[@type='radio' and @value='2']"));
//        System.out.println(radioMale.getAttribute("selected"));
//
//        List<WebElement> radios = driver.findElements(By.xpath("//input[@type='radio']"));
//        for(var radio:radios){
//            if(radio.getAttribute("value").equalsIgnoreCase("2"))
//                radio.click();
//        }
//        Thread.sleep(3000);
    }
}
