import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class automate {
    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.edge.driver","C://Users//amunye//IdeaProjects//Drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        Thread.sleep(1500);
        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.get("https://www.google.com");
        Actions action = new Actions(driver);
        //clicking on sign-in
        WebElement signinclick= driver.findElement(By.cssSelector("#gb > div > div.gb_Re > a"));
        action.moveToElement(signinclick);
        action.click();
        action.perform();
        //login

        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("#identifierId")).sendKeys("mydemo4class");
        WebElement signinclick1= driver.findElement(By.cssSelector("#identifierNext > div > button > div.VfPpkd-RLmnJb"));
        action.moveToElement(signinclick1);
        action.click();
        action.perform();

        driver.findElement(By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input")).sendKeys("Yeahbuddy101");
        WebElement passnext = driver.findElement(By.cssSelector("#passwordNext > div > button > div.VfPpkd-RLmnJb"));
        action.moveToElement(passnext);
        action.click();
        action.perform();
        driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[1]/a")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\":29\"]/span/span")).click();

        driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div[2]/div/table/tr/td/div[2]/div[2]/div/div[3]/div/div/div/div/div/div[2]/div/div/div/table/tbody/tr/td[2]/div/div/span[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div[2]/div/table/tr/td/div[2]/div[2]/div/div[3]/div/div/div/div/div/div[2]/div/div/div/div[4]/table/tbody/tr/td[2]/table/tbody/tr[1]/td/div/div[2]/div[3]/div/table/tbody/tr/td[2]/div[2]/div/div[1]")).sendKeys("This is a automatic reply");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div[2]/div/table/tr/td/div[2]/div[2]/div/div[3]/div/div/div/div/div/div[2]/div/div/div/div[4]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/div[2]/div[1]/div[4]/table/tbody/tr/td[1]/div/div[2]/div[1]")).click();


        Thread.sleep(10000);
        driver.quit();



    }
}
