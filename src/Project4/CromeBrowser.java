package Project4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CromeBrowser {
    public static void main(String[] args) {
        String baseUrl="https://www.saucedemo.com/";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //set url
        driver.get(baseUrl);
        //maximise window
        driver.manage().window().maximize();
        //print title o fthe page
        System.out.println("Title of the page is : "+driver.getTitle());
        //Print current url
        System.out.println("Current url is : "+driver.getCurrentUrl());
        //Print page source
        System.out.println("The page source is : "+driver.getPageSource());
        //Enter the userName
        WebElement userName=driver.findElement(By.id("user-name"));
        userName.sendKeys("standard_user");
        //Enter password
        WebElement password=driver.findElement(By.name("password"));
        password.sendKeys("secret_sauce");
        driver.close();
    }
}
