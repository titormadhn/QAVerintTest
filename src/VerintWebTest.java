import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerintWebTest {
    public static void main(String[] args) {
        VerintWebTest word = new VerintWebTest();
        WebDriver driver = word.initialSetup();
        driver.get("https://verint.com");
        driver.findElement(By.id("nav-toggle")).click();
        driver.findElement(By.id("downshift-0-input")).sendKeys("customer solution");
        driver.findElement(By.xpath("//button[@class='sj-input__button css-1k4nm74']")).click();
        word.setExecutor(driver);
        //driver.findElement(By.name("customer solution")).sendKeys("customer solution" + Keys.ENTER);
        //driver.findElement(By.("//contains[@class='sj-results__result__description css-p9jvyt']")).click();
        //js.executeScript("arguments[0].click();", buttonSubmit);
    }

    public WebDriver initialSetup(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Tito R\\Downloads\\APL QA Test Verint\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        return driver;
    }

    public void setExecutor(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        js.executeScript("window.scrollBy(0,500)");
    }

}


