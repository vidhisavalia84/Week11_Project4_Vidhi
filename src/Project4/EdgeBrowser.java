package Project4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser {
    public static void main(String[] args) {
        String baseurl="https://www.saucedemo.com/";
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.get(baseurl);// set url
        //maximise the window
        driver.manage().window().maximize();

        //Print title of the page
        System.out.println("The title of the page is : "+driver.getTitle());

        // Print current url
        System.out.println("Current url is : "+driver.getCurrentUrl());

        // Print page source
        System.out.println("The page source is : "+driver.getPageSource());

        //Enter the userName
        WebElement userName=driver.findElement(By.id("user-name"));
        userName.sendKeys("locked_out_user");

        //Enter password
        WebElement password=driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");
       // driver.close();
    }


}
