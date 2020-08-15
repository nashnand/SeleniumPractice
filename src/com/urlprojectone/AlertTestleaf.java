package com.urlprojectone;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;

public class AlertTestleaf {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand.muthukrishnan\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://leafground.com/pages/Alert.html");
        driver.findElement(By.xpath("//button[contains(text(),'Alert Box')]")).click();
        Thread.sleep(1000);
        Alert alert=driver.switchTo().alert(); /* Alert interface to handle alert */
        alert.accept(); /* ok will be clicked */

        /*Click the button to display a confirm box.*/
        driver.findElement(By.xpath("//button[@onclick='confirmAlert()']")).click();
        Alert alert1=driver.switchTo().alert();
        alert1.dismiss();
        Thread.sleep(1000);
        /*Click the button to display a prompt box.*/
        driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']")).click();
        Alert alert2=driver.switchTo().alert();
        alert2.sendKeys("OnlineTraining");
        alert2.accept();
        Thread.sleep(1000);
        WebElement sweetalert=driver.findElement(By.xpath("//button[@id='btn']"));
        sweetalert.click();
        Thread.sleep(1000);
        WebElement sweetpopup=driver.findElement(By.xpath("//button[@class='swal-button swal-button--confirm']") );
        sweetpopup.click();

    }
}