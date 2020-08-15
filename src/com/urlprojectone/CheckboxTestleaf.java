package com.urlprojectone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckboxTestleaf {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand.muthukrishnan\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://leafground.com/pages/checkbox.html");
        driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div[1]/input")).click();
        driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div[2]/input")).click();
        WebElement selectBox=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/input"));
        Boolean Boxselected =selectBox.isSelected();
        System.out.println("Boxselected"+Boxselected);
        WebElement SelctBox1=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div[1]/input"));
        Boolean SelectStatus=SelctBox1.isSelected();
        if(SelectStatus)
        {
        System.out.println("Checkbox selected");
            SelctBox1.click();
        }
        else
            {System.out.println("Checkbox not selected");

    }

        WebElement SelctBox2=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div[2]/input"));
        if(SelctBox2.isSelected())
        {
            System.out.println("Checkbox selected");
            SelctBox2.click();
        }
        else
            {System.out.println("Checkbox not selected");

            }

        }
}

