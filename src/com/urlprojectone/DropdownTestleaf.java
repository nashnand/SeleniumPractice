package com.urlprojectone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.util.List;

/*Key: Use Select class*/
public class DropdownTestleaf {

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\anand.muthukrishnan\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(" http://leafground.com/pages/Dropdown.html");
        WebElement drop1=driver.findElement(By.id("dropdown1"));
        Select Dropdown= new Select(drop1);
        Dropdown.selectByIndex(1);

        WebElement drop2=driver.findElement(By.name("dropdown2"));
        Select Dropdown2=new Select(drop2);
        Dropdown2.selectByVisibleText("UFT/QTP");

        WebElement drop3=driver.findElement(By.id("dropdown3"));
        Select Dropdown3=new Select(drop3);
        Dropdown3.selectByValue("2");

        WebElement drop4=driver.findElement(By.className("dropdown"));
        Select Dropdown4=new Select(drop4);
        List<WebElement> List= Dropdown4.getOptions();
        System.out.println("Number of option"+List.size());

        driver.findElement(By.xpath("//*[@id='contentblock']/section/div[5]/select")).sendKeys("Loadrunner");

        WebElement drop5=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
        Select Dropdown5=new Select(drop5);
/*        Dropdown5.selectByIndex(1);
        Dropdown5.selectByIndex(2);
        Dropdown5.selectByIndex(3);*/
        List<WebElement> Dplist= Dropdown5.getOptions();
        int Sizedp5= Dplist.size();
        for ( int i=0 ;i<Sizedp5;i++)
             {
                 Dropdown5.selectByIndex(i);
             }
            
        }


    }



