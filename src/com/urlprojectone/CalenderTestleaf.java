package com.urlprojectone;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/* Keys can be used to send replication keyboard action*/

public class CalenderTestleaf {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand.muthukrishnan\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://leafground.com/pages/Calendar.html");
        WebElement calender = driver.findElement(By.id("datepicker"));
        /*calender.sendKeys("08/10/2020" + Keys.ENTER);*/
        calender.click();
        WebElement next = driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']"));
        next.click();
        driver.findElement(By.xpath("//a[contains(text(),'10')]")).click();

    }

}
