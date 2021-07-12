package Utils;

import org.openqa.selenium.WebDriver;

public class BrowserManipulation {
    private WebDriver driver = DriverManager.getCurrentDriver();

    public void navigateTo(String url){
        driver.get(url);
    }

    public void navigateBack(){
        driver.navigate().back();
       }

    public void refresh(){
        driver.navigate().refresh();
    }

    public void navigateForward(){
        driver.navigate().forward();
    }

    public String getCurrentUrl(String url){
        url = driver.getCurrentUrl();
        return url;
    }

    public void getTitle(){
        driver.getTitle();
    }

}
