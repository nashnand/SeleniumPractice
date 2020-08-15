package com.urlprojectone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/* Using Exp wait for the element to be visible*/

public class Expwait_buttontoappear {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand.muthukrishnan\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://leafground.com/pages/appear.html");
        System.out.println("Time before"+java.time.LocalDateTime.now());
        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement Visible = driver.findElement(By.xpath("//b[contains(text(),\"Voila! I'm here Guys\")]"));
        System.out.println("Time before"+java.time.LocalDateTime.now());
        wait.until(ExpectedConditions.visibilityOf(Visible));
        System.out.println(Visible.getText());
    }


}
