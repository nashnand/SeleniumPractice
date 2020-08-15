package com.urlprojectone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DroppableTestleaf
{
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand.muthukrishnan\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://leafground.com/pages/drop.html");
        Actions Keys= new Actions(driver);
        WebElement Source= driver.findElement(By.id("draggable"));
        WebElement Target=driver.findElement(By.id("droppable"));
        Keys.dragAndDrop(Source,Target).build().perform();
           }
}
