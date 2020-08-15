package com.urlprojectone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DraggableTestleaf {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand.muthukrishnan\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://leafground.com/pages/drag.html");
        Actions Keys= new Actions(driver);
        WebElement draggable=driver.findElement(By.id("draggable"));
        WebElement Droplocation=driver.findElement(By.id("mydiv"));
        Keys.clickAndHold(draggable).moveToElement(Droplocation).release().build().perform();
    }
}