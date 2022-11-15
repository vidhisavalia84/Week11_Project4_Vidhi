package Project4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {
    public static void main(String[] args) {


        String baseurl = "https://www.saucedemo.com/";
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
       //set url
        driver.get(baseurl);
        //maximise window
        driver.manage().window().maximize();
        //print the title of the url
        System.out.println("Title of the page is: "+driver.getTitle());
        //Print current url
        System.out.println("Current url is : "+driver.getCurrentUrl());
        //Print page source
        System.out.println("The page source is : "+driver.getPageSource());
        //enter user name
        WebElement userName=driver.findElement(By.name("user-name"));
        userName.sendKeys("problem_user");
        //enter password
        WebElement password=driver.findElement(By.name("password"));
        password.sendKeys("secret_sauce");
        //driver.close();

    }
}
