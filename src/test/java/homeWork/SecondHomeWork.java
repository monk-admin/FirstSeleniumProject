package homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class SecondHomeWork {

    WebDriver driver;

    @BeforeMethod
    public void setUP(){
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void findElementBySimpleLocators(){
        driver.findElement(By.id("subscribe-loading-progress"));
        driver.findElement(By.id("dialog-notifications-error"));
        driver.findElement(By.id("bar-notification"));
        WebElement element = driver.findElement(By.className("cart-label"));
        System.out.println(element.getText());
        WebElement element1 = driver.findElement(By.className("count"));
        System.out.println(element1.getText());
        driver.findElement(By.tagName("ul"));
        driver.findElement(By.tagName("li"));
        driver.findElement(By.tagName("span"));
        driver.findElement(By.linkText("Register"));
        driver.findElement(By.linkText("Tricentis"));
    }

    @Test
    public void findElementByCssSelectors(){
        driver.findElement(By.cssSelector("#subscribe-loading-progress"));
        driver.findElement(By.cssSelector("#newsletter-email"));
        driver.findElement(By.cssSelector("#newsletter-subscribe-block"));
        driver.findElement(By.cssSelector("li"));
        driver.findElement(By.cssSelector("span"));
        driver.findElement(By.cssSelector(".listbox"));
        driver.findElement(By.cssSelector(".buttons"));
        driver.findElement(By.cssSelector("[class='search-box-text ui-autocomplete-input']"));
        driver.findElement(By.cssSelector("[class*='triangle']"));
        driver.findElement(By.cssSelector("[href^='/apparel']"));
        driver.findElement(By.cssSelector("[class$='firstLevel']"));
    }
}
