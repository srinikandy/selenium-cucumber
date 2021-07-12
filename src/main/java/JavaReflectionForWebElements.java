import Utils.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.lang.reflect.Field;

public class JavaReflectionForWebElements {
    public static void main(String[] args) throws IllegalAccessException, ClassNotFoundException, InterruptedException, NoSuchFieldException {
        WebDriver driver = DriverManager.getCurrentDriver();
        driver.get("https://www.google.com/");
        //1)
        Class clazz = Class.forName("WebPage");
        //2
        PageFactory.initElements(driver,clazz);
        //3
        Field field = clazz.getDeclaredField("name");
            //4
            WebElement element = (WebElement) field.get("name");
            //5
            element.sendKeys("hello");
            Thread.sleep(3000);
        //6
        driver.close();
    }
}
