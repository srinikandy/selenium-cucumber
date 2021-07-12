package Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class CaptureScreenshots {
    private WebDriver driver = DriverManager.getCurrentDriver();

    public void captureScreenshotAsFile(String screenshotName) throws IOException {
        File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE)
        File destination = new File(System.getProperty("user.dir")
                + File.separator + screenshotName + ".png");
        FileUtils.copyFile(source,destination);
    }

    public void captureScreenshotAsBytes(String screenshotName) throws IOException {
        byte[] source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }


}
