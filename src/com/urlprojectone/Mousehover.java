package com.urlprojectone;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.util.List;
import java.util.concurrent.TimeUnit;
/*Using Implict wait and Actions class for mouse action*/

public class Mousehover {

    public static void main(String[] args) throws AWTException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand.muthukrishnan\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://leafground.com/pages/mouseOver.html#");
        /*Thread.sleep(5000);*/
        WebElement Textpath= driver.findElement(By.xpath("//a[contains(text(),'TestLeaf Courses')]"));
        Actions Mouse= new Actions(driver);
        Mouse.moveToElement(Textpath).build().perform();
       /* Thread.sleep(2000);*/
        List<WebElement> list=driver.findElements(By.xpath("//a[@class='listener']"));
        for (WebElement Element:list) {
                        System.out.println("Links"+Element.getText());

        }

        WebElement Textpath1= driver.findElement(By.xpath("//a[contains(text(),'TestLeaf Courses')]"));
        Mouse.moveToElement(Textpath1).build().perform();
        driver.findElement(By.xpath("//a[contains(text(),'Selenium')]")).click();
        Alert alert=driver.switchTo().alert();
        /*Thread.sleep(2000);*/
        alert.accept();




    }
}
