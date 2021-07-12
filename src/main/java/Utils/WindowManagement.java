package Utils;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public class WindowManagement {
    private WebDriver driver = DriverManager.getCurrentDriver();

    public void setWindowSize(short width,short height ){
        driver.manage().window().setSize(new Dimension(width,height));
    }

    public void maximizeWindow(){
        driver.manage().window().maximize();
    }

    public void setFullScreenWindow(){
        driver.manage().window().fullscreen();
    }

}
