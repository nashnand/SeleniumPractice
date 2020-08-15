package com.urlprojectone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
/*For Explicit wait we need to create an object for Webdriver wait and put condition*/

public class ExplicitwaitTestleaf {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand.muthukrishnan\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://leafground.com/pages/disapper.html");
        WebElement Button= driver.findElement(By.xpath("//b[contains(text(),\"I'm going to disappear. Keep looking at me!!\")]"));
        WebDriverWait Wait = new WebDriverWait(driver,20);
        Wait.until(ExpectedConditions.invisibilityOf(Button));
        WebElement Result= driver.findElement(By.xpath("//strong[contains(text(),'I know you can do it! Button is disappeared!')]"));
        System.out.println(Result.getText());

    }
}
