package homeWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstHomeWork {

    WebDriver driver;

    //before setUp
    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    //test
    @Test
    public void openDemo_Web_Shop(){
        System.out.println("Demo Web Shop opened!");
    }

    //after - tearDown
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
