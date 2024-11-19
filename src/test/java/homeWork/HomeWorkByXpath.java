package homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomeWorkByXpath {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void findElementWithXpath() {
        driver.findElement(By.xpath("//strong[contains(text(),'Featured products')]"));
        driver.findElement(By.xpath("//div[@class='count']"));
        driver.findElement(By.xpath("//div[contains(text(),'You have no items in your shopping cart.')]"));
        driver.findElement(By.xpath("//div[@style='width: 46%']"));
        driver.findElement(By.xpath("(//a[contains(@style, 'display')])[1]"));
        driver.findElement(By.xpath("(//h3)[4]"));
        driver.findElement(By.xpath("//div[@class='page-body']/.."));
        driver.findElement(By.xpath("//span[@title='Close']"));
        driver.findElement(By.xpath("//strong[.='Categories']"));
        driver.findElement(By.xpath("//div[@title='Error' and @style='display:none;']"));
        driver.findElement(By.xpath("//a[@href='/login']"));
        driver.findElement(By.xpath("//li[@id='topcartlink']"));
        driver.findElement(By.xpath("//div[contains(text(),'Speed')]"));
        driver.findElement(By.xpath("//div[@class='listbox']"));
        driver.findElement(By.xpath("//img[contains(@style,'visibility:')]"));
    }
}