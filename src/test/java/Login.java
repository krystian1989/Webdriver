import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 * Created by comp on 2017-07-08.
 */
public class Login {
   public static WebDriver driver;

    @BeforeClass
    public static void oneTimeSetUp() throws Exception {
        //  System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.pl/");

    }


    @Test
    public void firstTest() throws Exception {
        Thread.sleep(1000);
        driver.findElement(By.id("lst-ib")).sendKeys("Test");
        System.out.println(driver.findElement(By.id("lst-ib")).getText());
    }

    @AfterClass
    public static void oneTimeTearDown() throws Exception {
        driver.quit();
    }
}

