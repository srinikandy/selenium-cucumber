import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebPage {

    @FindBy(name="q")
    public static WebElement name;

    @FindBy(id="age")
    public static WebElement age;
}
