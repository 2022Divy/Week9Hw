package browsertesting7;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;

public class EdgeTest {
    static WebDriver driver;
    static String url = "https://demo.openmrs.org/openmrs/";
    static String expectedTitle = "Login";

    public static void main(String[] args) {
        EdgeOptions options = new EdgeOptions();//Setting webdriver
        driver = new EdgeDriver(options);
        driver.get(url);//launch url
        driver.manage().window().maximize(); //maximising screen
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000)); //giving wait
        String actualTitle = driver.getTitle(); //getting title of page
        System.out.println("Title of page is : " + actualTitle);//printing title of page
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit();//closing driver
    }
}
