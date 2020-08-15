package com.urlprojectone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonTestleaf {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand.muthukrishnan\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(" http://leafground.com/pages/radio.html");
        driver.findElement(By.id("yes")).click();
        Boolean Selected1 = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/label[2]/input")).isSelected();
        Boolean Selected2 = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/label[3]/input")).isSelected();
        if (Selected1) {
            System.out.println("Radio button 1 selected");
        } else {
            System.out.println("Radio button 1 Not selected");

        }
        if (Selected2) {
            System.out.println("Radio button 2 selected");
        } else {
            System.out.println("Radio button 2 Not selected");
        }

        Boolean AgeGrpSelected = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div/div/input[1]")).isSelected();
        if (!Selected1)
            driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div/div/input[1]")).click();
    }
    }
