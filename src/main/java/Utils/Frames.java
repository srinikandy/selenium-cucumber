package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Frames {
    private WebDriver driver = DriverManager.getCurrentDriver();

    public void switchToFrame(WebElement element){
        driver.switchTo().frame(element);
    }
    public void switchToDefault(){
        driver.switchTo().defaultContent();
    }

}
