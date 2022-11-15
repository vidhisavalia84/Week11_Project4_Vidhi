package Project4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowser {
    static String browser="Firefox";
    static WebDriver driver;
    static  String baseUrl="https://www.saucedemo.com/";

    public static void main(String[] args) {
        if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
            driver=new ChromeDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
           driver=new EdgeDriver();


        } else if (browser.equalsIgnoreCase("Firefox")) {
            System.setProperty("webbrowser.gecko.driver","drivers/geckodriver.exe");
             driver=new FirefoxDriver();

        }
        else {
            System.out.println("Please enter valid browser name");
        }
        driver.get(baseUrl);
        //maximise window
        driver.manage().window().maximize();
        //Print title of the page
        String title=driver.getTitle();
        System.out.println("Title of the page is : "+title);
        //print current url
        String url=driver.getCurrentUrl();
        System.out.println("Current url is : "+url);
        //Print page source
        String pageSource= driver.getPageSource();
        System.out.println("Current page source is : "+pageSource);
        //Enter username

        WebElement userName= driver.findElement(By.name("user-name"));
        userName.sendKeys("standard_user");
        //enter password
        WebElement password=driver.findElement(By.name("password"));
        password.sendKeys("secret_sauce");

driver.close();
    }



}
