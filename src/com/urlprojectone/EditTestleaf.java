package com.urlprojectone;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class EditTestleaf {

    public static void main(String [] args){


        System.setProperty("webdriver.chrome.driver","C:\\Users\\anand.muthukrishnan\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("http://leafground.com/pages/Edit.html");
        driver.findElement(By.id("email")).sendKeys("anand.muthukrishnan@gmail.com");
        driver.findElement(By.xpath("//input[@type='text' and @value='Append ']")).sendKeys("anand");
        System.out.println(driver.findElement(By.xpath("//input[@type='text' and @name='username' and @value='TestLeaf']")).getAttribute("value"));
        driver.findElement(By.xpath("//input[@type='text' and @value='Clear me!!']")).clear();
        String Isdiable= driver.findElement(By.xpath("//input[@type='text' and @disabled='true']")).getAttribute("disabled");
        if ( Isdiable.equals("true")){
            System.out.println("Disable");}
            else{
                System.out.println("Enabled");
            }

        }
    }



