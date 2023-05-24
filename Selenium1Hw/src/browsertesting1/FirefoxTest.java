package browsertesting1;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class FirefoxTest {
    static WebDriver driver;
    static String url = "https://opensource-demo.orangehrmlive.com/";
    static String expectedTitle = "OrangeHRM";

    public static void main(String[] args) {
        FirefoxOptions options = new FirefoxOptions();//Setting webdriver
        driver = new FirefoxDriver(options);
        driver.get(url);//launch url
        driver.manage().window().maximize(); //maximising screen
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000)); //giving wait
        String actualTitle = driver.getTitle(); //getting title of page
        System.out.println("Title of page is : " + actualTitle);//printing title of page
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit();//closing driver
    }

}
