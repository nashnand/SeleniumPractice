package com.urlprojectone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.collections.Lists;

import java.util.List;

public class IframTestleaf {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand.muthukrishnan\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://leafground.com/pages/frame.html");
        driver.switchTo().frame(0);
        WebElement Iframe1= driver.findElement(By.xpath("//button[@id='Click']"));
        Iframe1.click();
        System.out.println("Iframe1 "+ Iframe1.getText());
        /*Now to switch to native frame after switching*/
        driver.switchTo().defaultContent();
       /* Nested Frame */
        driver.switchTo().frame(1);
        driver.switchTo().frame("frame2");
        WebElement Iframe2= driver.findElement(By.xpath("//button[@id='Click1']"));
        Iframe2.click();
        System.out.println("Iframe2 "+ Iframe2.getText());
        /*Now to switch to native frame after switching*/
        driver.switchTo().defaultContent();
        /*To Find total number of frames */
        List<WebElement> noofframes=driver.findElements(By.tagName("iframe"));
        System.out.println("No fo frames" + noofframes.size());
    }
}