import Utils.DriverManager;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

    //1) specify what property file we need to read
    static String environment = "qa";
    //2) give a directory of "properties" folder and path + environment.properties
    static String PropertiesFilePath = System.getProperty("user.dir")+ File.separator +
            "properties" + File.separator + environment + ".properties";
    //3  create a channel/connection to load and read file
    private static FileInputStream fis;
    //4
    private static Properties pr;
    private static String value;

    public static void main(String[] args) throws IOException, InterruptedException {
        try {
            //opening a connection to actual file
            fis = new FileInputStream(PropertiesFilePath);
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.out.println("Please check you may have given incorrect properties file which has not available in the framework."
                    + "Please create a "+environment+".properties"+"file");
            throw new IllegalArgumentException();
        }
        pr = new Properties();
        try {
            //Load property file and access to all content/properties
            pr.load(fis);
            //reads given property and return its value
            value = pr.getProperty("url");
        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Please check whether property file exists or file may bot be readable");
        }catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Please check whether property file exists or file may bot be readable");
            throw new IllegalArgumentException();
        }finally {
            fis.close();
        }
        WebDriver driver = DriverManager.getCurrentDriver();
        driver.get(value);
        Thread.sleep(3000);
        driver.quit();
    }
}
