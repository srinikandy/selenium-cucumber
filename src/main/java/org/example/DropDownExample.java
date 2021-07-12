package org.example;

import Utils.DriverManager;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class DropDownExample {
    public static void main(String[] args) throws Exception {

        WebDriver driver = DriverManager.getCurrentDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/travel/flights");
        WebDriverWait wait = new WebDriverWait(driver,20);
        WebElement dropdown = wait.until(
                ExpectedConditions
                        .visibilityOfElementLocated(
                                By.xpath("//button[contains(@aria-label,'Change seating class.')]")
                        ));
        //opening a dropdown
        dropdown.click();

        List<WebElement> elements = driver.findElements(
                By.xpath("//ul[@aria-label='Select your preferred seating class.']/li")
        );
        int counter =0 ;
        if(!elements.isEmpty()) {
            //for each loop
            //condition1
            String option = "Second class";
            for (var element : elements) {
                System.out.println("#####" + element.getText() + "######");
                if (element.getText().equalsIgnoreCase(option)) {
                    element.click();
                    Thread.sleep(2);
                    counter += 1;
                    break;
                }
            }
            System.out.println("###########");
            //condition2
            if (counter == 0) {
                for (var element : elements) {
                    System.out.println("#####" + element.getText() + "######");
                    if (StringUtils.containsIgnoreCase(element.getText(), option)) {
                        element.click();
                        Thread.sleep(2);
                        counter = 1;
                        break;
                    }
                }
            }

            //3rd condition
            if (counter == 0) {
                throw new IllegalArgumentException("Please send valid option");
            }

            Thread.sleep(5000);
            driver.quit();
        }
        else{
            throw new Exception("dropdown is empty");
        }
    }
}
