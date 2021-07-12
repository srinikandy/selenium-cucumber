package Utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class WindowsTabsManipulation {
    private WebDriver driver = DriverManager.getCurrentDriver();
    private static String parentWindow;

    public void switchToNewWindow(){
        //Capture ID of parent window
        parentWindow = driver.getWindowHandle();
        var windows = driver.getWindowHandles();
        // if number of windows or tabs are greater 1
        if(!(driver.getWindowHandles().size() == 1)){
            //looping through set
            for(var tab : windows){
                // if it is not parent tab
                if(!parentWindow.equalsIgnoreCase(tab)) {
                    //switch to that tab/window //control going to specific tab
                    driver.switchTo().window(tab);
                    break;
                }
            }
        }
    }
    public void newTab(){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.open('about:blank').focus();");
    }

    public void switchToParentWindow(){
        driver.switchTo().window(parentWindow);
    }

    public void closeTab(){
        driver.close();
        driver.switchTo().window(parentWindow);
    }
}
