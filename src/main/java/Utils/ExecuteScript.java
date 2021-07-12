package Utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExecuteScript {
    private WebDriver driver = DriverManager.getCurrentDriver();
    JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

    public void click(WebElement element){
        // equals to "element.click()"
        jsExecutor.executeScript("arguments[0].click();",element);
    }

    public void scrollToElement(WebElement element){
        // equals to "element.scrollIntoView(true)"
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);",element);
    }

    public void scrollToEnd(){
        // window.scrollTo(x-axis,y-axis)
        //window.scrollTo(horizontal scroll,vertical scroll)
        // equals to "window.scrollTo(0,height of page)"
        jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public void scrollToTop(){
        jsExecutor.executeScript("window.scrollTo(0, 0);");
    }

}
